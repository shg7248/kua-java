package git;
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

    private String driver = "oracle.jdbc.driver.OracleDriver";
    private String url = "jdbc:oracle:thin:@localhost:1521:orcl";
    private String id = "jspid";
    private String pw = "jsppw";

    PersonDao() {
        // 1. 드라이버 로드
        try {
            Class.forName(driver);
        } catch (ClassNotFoundException e) {
            System.out.println("오라클 드라이버 로드 실패");
        }
    }

    private void connect() {
        // 2. 오라클 DB 접속
        try {
            conn = DriverManager.getConnection(url, id, pw);
        } catch (SQLException e) {
            System.out.println("오라클 실행 중 에러");
        }
    }

    public  ArrayList<PersonBean> getAllPerson() {

        ArrayList<PersonBean> beans = new ArrayList<PersonBean>();

        this.connect();

        try {

            // SQL문 분석
            String sql = "select * from person order by num";
            ps = conn.prepareStatement(sql);

            // SQL문 실행
            rs = ps.executeQuery();

            // 레코드들을 하나씩 가지고 와서 출력
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
				
				beans.add(bean);
            }

            conn.close();

        } catch (SQLException e) {
            System.out.println("오라클 실행 중 에러");
        }

        return beans;
    }
}
