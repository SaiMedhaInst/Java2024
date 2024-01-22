import java.sql.*;
public class DemoJDBC {
    public static void main(String args[]) {

        String dburl = "jdbc:mysql://localhost:3306/saimedhadb";
        String username = "root";
        String passwd = "DbAk@18";
        try {

            //register the driver -1
            Class.forName("com.mysql.cj.jdbc.Driver");

            //create connection -2
            Connection con = DriverManager.getConnection(dburl, username , passwd);

        
            //create statement - 3
            Statement stmt = con.createStatement();

            // DatabaseMetaData d = con.getMetaData();

            //execute the query - 4
            ResultSet rs = stmt.executeUpdate("select name, college , fee from students where fee > 100000");

            while (rs.next()){
                System.out.println(rs.getString(1)+ " : "+ rs.getString(2)+ " : "+ rs.getFloat(3));
            }

            //close - 5
            con.close();
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
}