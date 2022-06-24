import java.sql.*;
import java.util.ArrayList;

public class AlbumsDao {

    private Connection conn = null;
    private PreparedStatement ps = null;
    private ResultSet rs = null;

    private String driver = "oracle.jdbc.driver.OracleDriver";
    private String url = "jdbc:oracle:thin:@localhost:1521:orcl";
    private String id = "jspid";
    private String pw = "jsppw";

    AlbumsDao() {
        try {
            Class.forName(driver);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    void connect() {
        try {
            conn = DriverManager.getConnection(url, id, pw);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public ArrayList<AlbumsBean> getAllAlbums() {
        ArrayList<AlbumsBean> beans = new ArrayList<AlbumsBean>();
        connect();

        try {
            String sql = "select * from albums order by 1";
            ps = conn.prepareStatement(sql);

            rs = ps.executeQuery();

            while(rs.next()) {
                AlbumsBean bean = new AlbumsBean();
                bean.setNum(rs.getInt("num"));
                bean.setSong(rs.getString("song"));
                bean.setSinger(rs.getString("singer"));
                bean.setCompany(rs.getString("company"));
                bean.setPrice(rs.getInt("price"));
                bean.setPub_day(String.valueOf(rs.getDate("pub_day")));
                beans.add(bean);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                conn.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
        return beans;
    }

    public int insertAlbums(AlbumsBean bean) {
        int cnt = -1;
        connect();

        try {
            String sql = "insert into albums values(albumseq.nextval, ?, ?, ?, ?, ?)";
            ps = conn.prepareStatement(sql);
            ps.setString(1, bean.getSong());
            ps.setString(2, bean.getSinger());
            ps.setString(3, bean.getCompany());
            ps.setInt(4, bean.getPrice());
            ps.setString(5, bean.getPub_day());

            cnt = ps.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                conn.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
        return cnt;
    }

    public int updateAlbums(AlbumsBean bean) {
        int cnt = -1;
        connect();

        try {
            String sql = "update albums set song = ?, singer = ?, company = ?, price = ?, pub_day = ? where num = ?";
            ps = conn.prepareStatement(sql);
            ps.setString(1, bean.getSong());
            ps.setString(2, bean.getSinger());
            ps.setString(3, bean.getCompany());
            ps.setInt(4, bean.getPrice());
            ps.setString(5, bean.getPub_day());
            ps.setInt(6, bean.getNum());

            cnt = ps.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                conn.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
        return cnt;
    }

    public int deleteAlbums(int num) {
        int cnt = -1;
        connect();

        try {
            String sql = "delete albums where num = ?";
            ps = conn.prepareStatement(sql);
            ps.setInt(1, num);

            cnt = ps.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                conn.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
        return cnt;
    }
}
