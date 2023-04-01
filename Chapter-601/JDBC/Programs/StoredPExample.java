import java.sql.*;
public class StoredPExample {
    public static void main(String[] args) throws Exception {
        String dburl = "jdbc:mysql://localhost:3306/emp";
        String username = "root";
        String passwd = "SqlAk@18";
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(dburl, username, passwd);

        CallableStatement stmt = con.prepareCall("{call get_users()}");
       
        ResultSet rs = stmt.executeQuery();

        while(rs.next()){
            System.out.println(rs.getString(1));
        }

        System.out.println("success");

        con.close();
    }
}