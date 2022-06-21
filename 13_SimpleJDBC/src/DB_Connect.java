import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import oracle.jdbc.driver.OracleDriver;

public class DB_Connect {
	
	public static void main(String[] args) throws SQLException {
		
		Connection conn = null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 로드 성공");
			
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "jspid", "jsppw");
			System.out.println("접속 성공");
			
			conn.close();
			System.out.println("접속 끊기 성공");
			
		} catch (SQLException e) {
			System.out.println("접속 실패");
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로드 실패");
		}
	}
}

/*
 * 프로젝트 명에서 우클릭 - Properties
 * C:\Oracle\product\12.2.0\dbhome_1\jdbc\lib 에서 jdbc8.jar
 */
