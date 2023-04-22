import java.sql.*;

public class JDBCPrepareStatementExample {
    public static void main(String[] args) {
     
        String dburl = "jdbc:mysql://localhost:3306/emp";
        String username = "root";
        String passwd = "SqlAk@18";

        try{

            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(dburl, username, passwd);
            PreparedStatement stmt = conn.prepareStatement("insert into user420 values(?,?)");
            
            stmt.setInt(1, 701);
            stmt.setString(2, "Scoot Lang");

            int count =  stmt.executeUpdate();

            System.out.println("number of records inserted .." + count);

            conn.close();

        }

        catch(Exception e ){
            System.out.println("exception handled .." + e);
        }
    }
}
