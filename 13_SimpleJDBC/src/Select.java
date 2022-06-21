import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Select {
	
	public static void main(String[] args) {
		
		Connection conn = null;
		
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String id = "jspid";
		String pw = "jsppw";
		
//		PhysicalConnection
//		OraclePreparedStatement
		
//		0. jar
		try {
			
//		1. 드라이버 로드
			Class.forName(driver);
			
//		2. 계정에 접속
			conn = DriverManager.getConnection(url, id, pw);
			
			
			String sql = "SELECT * FROM DBTEST";
			
//		3. 명령어 분석
			PreparedStatement ps = conn.prepareStatement(sql);
			
//		4. 실행
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
//				타입 변수 = rs.get타입("칼럼명");
				int num = rs.getInt("num");
				String name = rs.getString("name");
				String addr = rs.getString("addr");
				
				System.out.println(num + ", " + name + ", " + addr);
			}
			
			conn.close();
			
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로드 실패");
		} catch (SQLException e) {
			System.out.println("오라클 접속 실패 / 분석 에러 / 없는 칼럼 가져옴");
		}
	}
}
