import java.sql.*;

public class JDBCDemo {
  public static void main(String[] args)  throws ClassNotFoundException{
   
    //step-1
    Class.forName("oracle.jdbc.driver.OracleDriver");

    //step-2
    Connection con = DriverManager.getConnection(null, null, null);

    //step-3 create a statments 
    Statement stmt = con.createStatement();

    //step-4 execute the queries
    ResultSet rt = stmt.executeQuery("select name from emp");

    while(rt.next()){
      System.out.println(rt.getInt(0))+ " "+rt.getString());
    }

    
  }
}
