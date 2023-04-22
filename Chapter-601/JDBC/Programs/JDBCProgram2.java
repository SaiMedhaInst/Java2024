import java.sql.*;

public class JDBCProgram2 {
    public static void main(String[] args) {
        
        String dburl = "jdbc:mysql://localhost:3306/emp";
        String username = "root";
        String passwd = "SqlAk@18";
        try{

            //register-1 
            Class.forName("com.mysql.cj.jdbc.Driver");

            //create connection object -2
            //System.out.println(DriverManager.getDrivers());
            Connection conn = DriverManager.getConnection(dburl, username, passwd);

            //create statement -3
            Statement stmt = conn.createStatement();

            // execute the sql queries -4
            //int r = stmt.executeUpdate("delete from user420 where id=101");
            ResultSet rs = stmt.executeQuery("select * from user420 where id  in (201,501,101)");

            while(rs.next()){
                System.out.println(rs.getInt(1) + " "+ rs.getString(2));
            }

            //System.out.println("number of records affected is :"+r);

            //close -5
            conn.close();


        }

        catch(Exception e ){System.out.println("expection occured "+e);}

        
    }
}
