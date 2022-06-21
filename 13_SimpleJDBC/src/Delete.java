import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Delete {
	
	public static void main(String[] args) {
		
		Connection conn = null;
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String id = "jspid";
		String pw = "jsppw";
		String sql = "delete dbtest where num = ?";
		
		try {
			
			int del_num = 3;
//			3번을 조건으로 삭제
//			SQL문 작성 변수 연결~
//			SQL문 작성 ?
			
//			1. 드라이버 로드
			Class.forName(driver);
			
//			2. 계정에 접속
			conn = DriverManager.getConnection(url, id, pw);
			
//			3. SQL문 분석
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, del_num);
			
//			4. SQL문 실행
			int cnt = -1;
			cnt = ps.executeUpdate();
			System.out.println("cnt : " + cnt);
			
			if(cnt > 0) {
				System.out.println(cnt + "건이 삭제되었습니다.");
			}
			else if(cnt == 0) {
				System.out.println("조건에 맞는 레코드가 없습니다.");
			}
			else {
				System.out.println("에러 발생");
			}
			
			conn.close();
			
		} catch (ClassNotFoundException e) {
			System.out.println("오라클 드라이버 로드에 실패했습니다.");
		} catch (SQLException e) {
			System.out.println("실행 중 문제가 발생했습니다.");
		}
		
	}
}
