import java.sql.*;
import java.io.*;
public class InsertImageExample {



    public static void main(String[] args) {
        String dburl = "jdbc:mysql://localhost:3306/company";
        String username = "root";
        String passwd = "SqlAk@18";
        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(dburl, username, passwd);

            // PreparedStatement ps = con.prepareStatement("insert into imgtable3 values(?,?)");
            // ps.setString(1, "street");

            // String imgPath = "C:\\Users\\akraj\\Downloads\\street.jpg";
            // FileInputStream fin = new FileInputStream(imgPath);
            // System.out.println(fin);
            // ps.setBinaryStream(2, fin, fin.available());
            // int i = ps.executeUpdate();
            // System.out.println(i + " records affected");

            PreparedStatement ps = con.prepareStatement("select * from imgtable3");
            ResultSet rs = ps.executeQuery();
            String imageName = "img";
            int count = 1;
            while(rs.next()) { //now on 1st row  

                Blob b = rs.getBlob(2); //2 means 2nd column data  
                byte barr[] = b.getBytes(1, (int) b.length()); //1 means first image  

                FileOutputStream fout = new FileOutputStream("d:\\"+imageName+"_"+count+".jpg");
                fout.write(barr);
                System.out.println("image "+count +" downloaded...");
                count+=1;
                fout.close();
               
            } //end of if  
            System.out.println("ok");



            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}