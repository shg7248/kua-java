import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BookDao {

    private Connection conn = null;

    private String driver = "oracle.jdbc.driver.OracleDriver";
    private String url = "jdbc:oracle:thin:@localhost:1521:orcl";
    private String id = "jspid";
    private String pw = "jsppw";

    BookDao(){
        try {
            Class.forName(driver);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    private void connect() {
        try {
            conn = DriverManager.getConnection(url, id, pw);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
