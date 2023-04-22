import java.sql.*;

public class JDBCResultSetMetaDataExample {
    public static void main(String[] args) {
        
        String dburl = "jdbc:mysql://localhost:3306/emp";
        String username = "root";
        String passwd = "SqlAk@18";

        try{

            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(dburl, username, passwd);
            PreparedStatement ps = con.prepareStatement("select * from user420");
            ResultSet rs = ps.executeQuery();

            ResultSetMetaData rsmd = rs.getMetaData();

            System.out.println(rsmd.getColumnCount());

            System.out.println(rsmd.getColumnName(1) + " "+ rsmd.getColumnName(2));
            System.out.println(rsmd.getColumnType(1) + " "+ rsmd.getColumnType(2));

            con.close();
        }
        catch(Exception e ) {}

    }
}
