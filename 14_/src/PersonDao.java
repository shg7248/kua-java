import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class PersonDao {

	Connection conn = null;
	PreparedStatement ps = null;
	ResultSet rs = null;
	
	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:orcl";
	String id = "jspid";
	String pw = "jsppw";
	
	PersonDao() {
		// 1. 드라이버 로드
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로드에 실패했습니다.");
		}
	}
	
	public void connect() {
		// 2. 계정에 접속
		try {
			conn = DriverManager.getConnection(url, id, pw);
		} catch (SQLException e) {
			System.out.println("실행중 에러가 발생했습니다.");
		}
	}
	
	// 1. 전체 정보 조회
	public ArrayList<PersonBean> getAllPerson() {
		
		ArrayList<PersonBean> lists = new ArrayList<PersonBean>();
		
		connect();
		String sql = "select * from person order by num";
		
		try {
			// 3. SQL문 분석
			ps = conn.prepareStatement(sql);
			
			// 4. SQL문 실행
			rs = ps.executeQuery();
			
			while(rs.next()) {
				
				PersonBean bean = new PersonBean();
				
				int num = rs.getInt("num");
				String name = rs.getString("name");
				int age = rs.getInt("age");
				String gender = rs.getString("gender");
				String birth = String.valueOf(rs.getDate("birth"));
				
				bean.setNum(num);
				bean.setName(name);
				bean.setAge(age);
				bean.setGender(gender);
				bean.setBirth(birth);
				
				lists.add(bean);
			}
			
			conn.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		// 에러가 발생해도 리턴을 해야 함
		return lists;
	}

	public ArrayList<PersonBean> getPersonByGender(String gender) {
		
		ArrayList<PersonBean> beans = new ArrayList<PersonBean>();
		
		connect();
		String sql = "select * from person where gender = ?";
		
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, gender);
			
			rs = ps.executeQuery();
			
			while(rs.next()) {
				PersonBean bean = new PersonBean();
				bean.setNum(rs.getInt("num"));
				bean.setName(rs.getString("name"));
				bean.setGender(rs.getString("gender"));
				bean.setAge(rs.getInt("age"));
				bean.setBirth(String.valueOf(rs.getDate("birth")));
				beans.add(bean);
			}
			
			conn.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return beans;
	}

	// 5. 정보 추가
	public int insertPerson(PersonBean bean) {
		connect();
		int result = -1;
		String sql = 	"insert into person (num, name, age, gender, birth) " + 
						"values(perseq.nextval, ?, ?, ?, ?)";
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, bean.getName());
			ps.setInt(2, bean.getAge());
			ps.setString(3, bean.getGender());
			ps.setString(4, bean.getBirth());
			
			result = ps.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}

	public int updatePerson(PersonBean bean) {
		connect();
		String sql = "update person set name = ?, age = ?, gender = ?, birth = ? where num = ?";
		int result = -1;
		
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, bean.getName());
			ps.setInt(2, bean.getAge());
			ps.setString(3, bean.getGender());
			ps.setString(4, bean.getBirth());
			ps.setInt(5, bean.getNum());
			
			result = ps.executeUpdate();
			
			conn.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return result;
	}

	public int deletePerson(int num) {
		
		int result = -1;
		connect();
		String sql = "delete person where num = ?";
		
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, num);
			
			result = ps.executeUpdate();
			
			conn.close();
	
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return result;
	}
}
