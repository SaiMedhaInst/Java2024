import java.sql.*;
import java.io.*;
public class InsertImage {
    public static void main(String[] args) {
        String dburl = "jdbc:mysql://localhost:3306/company";
        String username = "root";
        String passwd = "SqlAk@18";
        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(dburl, username, passwd);

            PreparedStatement ps = con.prepareStatement("insert into imgtable values(?,?)");
            ps.setString(1, "nature");

            String imgPath = "D:\\SaiMedha\\Java-ECET\\Chapter-601\\JDBC\\Programs\\Nature_Cycle.jpg";
            FileInputStream fin = new FileInputStream(imgPath);
            ps.setBinaryStream(2, fin, fin.available());
            int i = ps.executeUpdate();
            System.out.println(i + " records affected");

            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}