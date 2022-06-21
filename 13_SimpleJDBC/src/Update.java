import java.io.PrintStream;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Update {

	public static void main(String[] args) {
		
		Connection conn = null;
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String id = "jspid";
		String pw = "jsppw";
		
		try {
			Class.forName(driver);
			
			conn = DriverManager.getConnection(url, id, pw);
			
			String sql = "update dbtest set name = ?, addr = ? where num = ?";
			
			int up_num = 5;
			String up_name = "jeon";
			String up_addr = "남해";
			
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, up_name);
			ps.setString(2, up_addr);
			ps.setInt(3, up_num);
			
			int cnt = -1;
			cnt = ps.executeUpdate();
			System.out.println("cnt : " + cnt);
			
			if(cnt > 0) {
				System.out.println("수정 성공");
			}
			else if(cnt == 0) {
				System.out.println("조건에 맞는 레코드가 없음");
			}
			else {
				System.out.println("에러 발생");
			}
			
			conn.close();
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
}
