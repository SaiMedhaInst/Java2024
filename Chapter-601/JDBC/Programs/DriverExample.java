import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;

public class DriverExample {

    public static void main(String[] args) {
        String dburl = "jdbc:mysql://localhost:3306/company";
        String username = "root";
        String passwd = "SqlAk@18";

    
        try{

            Class.forName("com.mysql.cj.jdbc.Driver");
            
            Connection conn = DriverManager.getConnection(dburl, username, passwd);
            /* 
            DriverManager.registerDriver(null);
            DriverManager.deregisterDriver(null);

            Driver driver = DriverManager.getDriver(dburl);
            System.out.println(driver.getClass().getName());
            System.out.println(driver.getMajorVersion());
            System.out.println(driver.getMinorVersion());
            */
        
            /* 
            conn.createStatement();
            conn.prepareStatement(passwd)
            conn.commit();
            conn.rollback();
            conn.close();
            conn.setAutoCommit(false);
            conn.setTransactionIsolation(0);
            conn.getMetaData();
            */
            conn.getMetaData();
            //Statement stmt = conn.createStatement();
            Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,  
            ResultSet.CONCUR_UPDATABLE);

            /* 
            stmt.executeQuery(passwd); 
            stmt.execute(passwd);
            stmt.executeUpdate(passwd);
            stmt.execute(passwd, 0)
            stmt.executeBatch();
            stmt.executeLargeUpdate(passwd);

            */
            ResultSet rs = stmt.executeQuery("select empno , ename , job from emp");

            ResultSetMetaData rsmd = rs.getMetaData();
        

           // System.out.println(rs.last() + " "+ rs.getInt("empno") +" "+ rs.getString("ename") +" "+rs.getString("job"));

           System.out.println(rsmd.getTableName(1));
           System.out.println(rsmd.getColumnCount());

        
        }

        catch(Exception e){
            System.out.println("exception handled..."+ e);
        }

    }
}
