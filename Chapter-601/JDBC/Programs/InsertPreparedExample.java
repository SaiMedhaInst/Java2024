import java.sql.*;

public class InsertPreparedExample {
    public static void main(String[] args) {
        String dburl = "jdbc:mysql://localhost:3306/company";
        String username = "root";
        String passwd = "SqlAk@18";

        try{

            Class.forName("com.mysql.cj.jdbc.Driver");
            
            Connection con = DriverManager.getConnection(dburl, username, passwd);

            PreparedStatement stmt = con.prepareStatement("insert into stu values(?,?)");
            stmt.setInt(1, 103); //1 specifies the first parameter in the query  
            stmt.setString(2, "john");

            int i = stmt.executeUpdate();
            System.out.println(i + " records inserted");
            
            con.close();

        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
