import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Insert {
	
	public static void main(String[] args) {
		
		Connection conn = null;
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String id = "jspid";
		String pw = "jsppw";
		
		try {
//			1. 드라이버로드
			Class.forName(driver);
			
//			2. 계정에 접속
			conn = DriverManager.getConnection(url, id, pw);
			
//			int in_num = 5;
//			String in_name = "lee";
//			String in_addr = "인천";
			
			int in_num = 6;
			String in_name = "sin";
			String in_addr = "강원";
			
//			3. 명령어 분석
//			String sql = "insert into dbtest values("+in_num+", '"+in_name+"', '"+in_addr+"')";
			String sql = "insert into dbtest values(?, ?, ?)";
			
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, in_num);
			ps.setString(2, in_name);
			ps.setString(3, in_addr);
			
//			4. 실행
			int cnt = ps.executeUpdate();
			
//			성공적으로 insert한 개수가 리턴됨
			System.out.println("cnt : " + cnt);
			
//			5. 접속끊기
			conn.close(); // 자동 commit
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}

/*
 * ClassNotFoundException : 
 * 		Class.forName(driver);
 * 
 * SQLException :
 * 		DriverManager.getConnection
 * 		conn.prepareStatement(sql)
 * 		rs.getInt
 * 		rs.getString
 * 		conn.close()
 * 
 * 실행 명령어
 * select : executeQuery()
 * insert, update, delete : executeUpdate() 성공적으로 실행된 개수
 * 
 * 
 */
