### STORE IMAGE IN  DATABASE
- we can store images in the database in java by the help of PreparedStatement interface.
- The setBinaryStream() method of PreparedStatement is used to set Binary information into the parameterIndex.
**method**
```java
1) public void setBinaryStream(int paramIndex,InputStream stream)  
throws SQLException  
2) public void setBinaryStream(int paramIndex,InputStream stream,long length)  
throws SQLException  
```
- For storing image into the database, BLOB (Binary Large Object) datatype is used in the table.

```sql
CREATE TABLE  "IMGTABLE"   
   (    "NAME" VARCHAR2(4000),   
    "PHOTO" BLOB  
   )  
```

**Example**
```java
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

            String imgPath = "D:\SaiMedha\Java-ECET\Chapter-601\JDBC\Programs\Nature_Cycle.jpg";
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
```


###  RETRIEVE IMAGE FROM ORACLE DATABASE.
- By the help of PreparedStatement we can retrieve and store the image in the database.
- The getBlob() method of PreparedStatement is used to get Binary information, it returns the instance of Blob. After calling the getBytes() method on the blob object, we can get the array of binary information that can be written into the image file.

**Signature of getBlob() method of PreparedStatement**
public Blob getBlob()throws SQLException  

**Signature of getBytes() method of Blob interface**
public  byte[] getBytes(long pos, int length)throws SQLException  

```java
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

                FileOutputStream fout = new FileOutputStream("d:\\sonoo.jpg");
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
```

## CallableStatement Interface
- CallableStatement interface is used to call the stored procedures and functions.
- We can have business logic on the database by the use of stored procedures and functions that will make the performance better because these are precompiled.
    - Suppose we need the get the age of the employee based on the date of birth, you may create a function that receives date as the input and returns age of the employee as the output.

**difference between stored procedures and functions.**
 ![Alt text](https://i.imgur.com/MLvy3fP.png)

- The prepareCall() method of Connection interface returns the instance of CallableStatement. Syntax 

```java
public CallableStatement prepareCall("{ call procedurename(?,?...?)}");  

//example
CallableStatement stmt=con.prepareCall("{call myprocedure(?,?)}");  
```

**Stored Producure IN MYSQL**
```sql
DELIMITER //
CREATE PROCEDURE insert_users(IN id int(10),name varchar(10))
BEGIN 
insert into user420 values(id,name);  
END // 
DELIMITER ;
```
**calling**
```sql
call insert_users(201,"kumar");
```

```java
import java.sql.*;
public class Proc {
    public static void main(String[] args) throws Exception {
        String dburl = "jdbc:mysql://localhost:3306/company";
        String username = "root";
        String passwd = "SqlAk@18";
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(dburl, username, passwd);

        CallableStatement stmt = con.prepareCall("{call insert_users(?,?)}");
        stmt.setInt(1, 1011);
        stmt.setString(2, "Amit");
        stmt.execute();

        System.out.println("success");
    }
}
```

### Transaction Management in JDBC
- Transaction represents a single unit of work.
- The ACID properties describes the transaction management well. ACID stands for Atomicity, Consistency, isolation and durability.
- fast performance It makes the performance fast because database is hit at the time of commit.

**Atomicity** means either all successful or none.

**Consistency** ensures bringing the database from one consistent state to another consistent state.

**Isolation** ensures that transaction is isolated from other transaction.

**Durability** means once a transaction has been committed, it will remain so, even in the event of errors, power loss etc.

![Alt text](https://i.imgur.com/iqTBvU9.png)

**In JDBC, Connection interface provides methods to manage transaction.**
- void setAutoCommit(boolean status)	It is true bydefault means each transaction is committed bydefault.
- void commit()	commits the transaction.
- void rollback()	cancels the transaction.

```java
import java.sql.*;
import java.io.*;
class TM {
    public static void main(String args[]) {
        String dburl = "jdbc:mysql://localhost:3306/emp";
        String username = "root";
        String passwd = "SqlAk@18";

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(dburl, username, passwd);
            con.setAutoCommit(false);

            PreparedStatement ps = con.prepareStatement("insert into user420 values(?,?,?)");

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            while (true) {

                System.out.println("enter id");
                String s1 = br.readLine();
                int id = Integer.parseInt(s1);

                System.out.println("enter name");
                String name = br.readLine();

                System.out.println("enter salary");
                String s3 = br.readLine();
                int salary = Integer.parseInt(s3);

                ps.setInt(1, id);
                ps.setString(2, name);
                ps.setInt(3, salary);
                ps.executeUpdate();

                System.out.println("commit/rollback");
                String answer = br.readLine();
                if (answer.equals("commit")) {
                    con.commit();
                }
                if (answer.equals("rollback")) {
                    con.rollback();
                }


                System.out.println("Want to add more records y/n");
                String ans = br.readLine();
                if (ans.equals("n")) {
                    break;
                }

            }
            con.commit();
            System.out.println("record successfully saved");

            con.close(); //before closing connection commit() is called  
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
}
}
```