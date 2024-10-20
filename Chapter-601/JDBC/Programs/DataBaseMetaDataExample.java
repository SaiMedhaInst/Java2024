import java.sql.*;
public class DataBaseMetaDataExample{
    public static void main(String[] args) {
        
        String dburl = "jdbc:mysql://localhost:3306/company";
        String username = "root";
        String passwd = "SqlAk@18";

        try{

                //register the driver -1
                Class.forName("com.mysql.cj.jdbc.Driver");
                
                //create connection -2
                Connection con = DriverManager.getConnection(dburl, username , passwd); 

                DatabaseMetaData dbmd =  con.getMetaData();

                System.out.println("Driver Name: "+dbmd.getDriverName());  
                System.out.println("Driver Version: "+dbmd.getDriverVersion());  
                System.out.println("UserName: "+dbmd.getUserName());  
                System.out.println("Database Product Name: "+dbmd.getDatabaseProductName());  
                System.out.println("Database Product Version: "+dbmd.getDatabaseProductVersion());


                
            // print all tables
            String table[]={"TABLE"};  
            ResultSet rs=dbmd.getTables(null,null,null,table);  
            
            while(rs.next()){  
                System.out.println(rs.getString(3));  
            }

        }
        catch(Exception e){}
    }
}