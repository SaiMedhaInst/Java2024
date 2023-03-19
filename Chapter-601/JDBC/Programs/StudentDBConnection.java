import java.sql.*;
public class StudentDBConnection {

  private final static String dburl = "jdbc:mysql://localhost:3306/institute";
  private final static String username = "root";
  private final static String passwd = "SqlAk@18";
  private final static String drivername = "com.mysql.cj.jdbc.Driver";



  public static void main(String[] args) {
    
    Connection conn=null;
    Statement stmt = null;
    ResultSet rst = null;

    try{
        Class.forName(drivername);
    }
    catch(ClassNotFoundException e ){
      System.out.println("class couldnot found...");
      e.printStackTrace();
    }
    System.out.println("Driver loaded successfully...");

    //step-2 
    try{
      conn = DriverManager.getConnection(dburl, username, passwd);
    }
    catch(SQLException e){
      System.out.println("Unable to connect to the DATABASE....");
      e.printStackTrace();
    }

    //step-3
    try{
       stmt = conn.createStatement();
    }
    catch(SQLException e){
      System.out.println("unable to create a statement..");
      e.printStackTrace();
    }

    //step4
    try{
      String query = "select * from student";
      String insertquery = "update student set srank = 5 where college= \"vasavi\"";


      // rst = stmt.executeQuery(query);
      // boolean isInserted = stmt.execute(insertquery);
       int isInserted = stmt.executeUpdate(insertquery);

      // while(rst.next()){
      //   String data = rst.getInt(1) +" "
      //               + rst.getString(2)+" "
      //               + rst.getString(3)+" "
      //               +rst.getInt(4)+" "
      //               +rst.getString(5)+" ";

      //   System.out.println(data);
      // }

      System.out.println("updated... count..... "+isInserted);
    }

    catch(SQLException e){
      System.out.println("unable to create a statement..");
      e.printStackTrace();
    }


  }
}
