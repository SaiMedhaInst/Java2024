import java.sql.*;
import java.io.*;
public class RetrieveImage {
    public static void main(String[] args) {
        String dburl = "jdbc:mysql://localhost:3306/company";
        String username = "root";
        String passwd = "SqlAk@18";
        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(dburl, username, passwd);
            PreparedStatement ps = con.prepareStatement("select * from imgtable");
            ResultSet rs = ps.executeQuery();
            if (rs.next()) { //now on 1st row  

                Blob b = rs.getBlob(2); //2 means 2nd column data  
                byte barr[] = b.getBytes(1, (int) b.length()); //1 means first image  
                
                String downloadImgPath = "D:\\SaiMedha\\Java-ECET\\Chapter-601\\JDBC\\Programs\\";
                FileOutputStream fout = new FileOutputStream(downloadImgPath+"downloadImg.jpg");
                fout.write(barr);

                fout.close();
            } //end of if  
            System.out.println("ok");

            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}