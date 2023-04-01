import java.sql.*;
import java.io.*;
public class PreparedStatementExample {
    public static void main(String args[]) throws Exception {
        String dburl = "jdbc:mysql://localhost:3306/company";
        String username = "root";
        String passwd = "SqlAk@18";
        Connection con= null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(dburl, username, passwd);
            PreparedStatement ps = con.prepareStatement("insert into stu values(?,?)");
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            do {
                System.out.println("enter id:");
                int id = Integer.parseInt(br.readLine());
                System.out.println("enter name:");
                String name = br.readLine();
               

                ps.setInt(1, id);
                ps.setString(2, name);
               

                int i = ps.executeUpdate();
        
                System.out.println(i + " records affected");

                System.out.println("Do you want to continue: y/n");
                String s = br.readLine();
                if (s.startsWith("n")) {
                    break;
                }
            } while (true);
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            con.close();
        }
    }
}