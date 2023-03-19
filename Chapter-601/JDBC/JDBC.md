# Java JDBC 
- JDBC stands for Java Database Connectivity. 
- JDBC is a Java API to connect and execute the query with the database. 
- It is a part of JavaSE (Java Standard Edition). 
- JDBC API uses JDBC drivers to connect with the database. 
- There are four types of JDBC drivers:
    - JDBC-ODBC Bridge Driver,
    - Native Driver,
    - Network Protocol Driver, and
    - Thin Driver


### What is API?

- API (Application programming interface) is a document that contains a description of all the features of a product or software. 
- It represents classes and interfaces that software programs can follow to communicate with each other.
- An API can be created for applications, libraries, operating systems, etc.

>>We can use JDBC API to access tabular data stored in any relational database. By the help of JDBC API, we can save, update, delete and fetch data from the database. It is like Open Database Connectivity (ODBC) provided by Microsoft.

![Screenshot](https://i.imgur.com/WRmSv3W.png)

- The current version of JDBC is 4.3. 
- It is the stable release since 21st September, 2017. 
- It is based on the X/Open SQL Call Level Interface. 
- The java.sql package contains classes and interfaces for JDBC API.
-  A list of popular interfaces of JDBC API are
    -  Driver interface
    -  Connection interface
    -  Statement interface
    -  PreparedStatement interface
    -  CallableStatement interface
    -  ResultSet interface
    -  ResultSetMetaData interface
    -  DatabaseMetaData interface
    -  RowSet interface

- A list of popular classes of JDBC API are
    - DriverManager class
    - Blob class
    - Clob class
    - Types class

### Why Should We Use JDBC?
- Before JDBC, ODBC API was the database API to connect and execute the query with the database. - But, ODBC API uses ODBC driver which is written in C language (i.e. platform dependent and unsecured). 
- That is why Java has defined its own API (JDBC API) that uses JDBC drivers (written in Java language).
- We can use JDBC API to handle database using Java program and can perform the following activities:
    - Connect to the database
    - Execute queries and update statements to the database
    - Retrieve the result received from the database.

## JDBC Drivers

>>JDBC Driver is a software component that enables java application to interact with the database.

There are 4 types of JDBC drivers:
- JDBC-ODBC bridge driver
- Native-API driver (partially java driver)
- Network Protocol driver (fully java driver)
- Thin driver (fully java driver)

**1) JDBC-ODBC bridge driver**
- The JDBC-ODBC bridge driver uses ODBC driver to connect to the database.
- The JDBC-ODBC bridge driver converts JDBC method calls into the ODBC function calls. 
- This is now discouraged because of thin driver.
- In Java 8, the JDBC-ODBC Bridge has been removed.

![Screenshot](https://i.imgur.com/H7YVYaB.png)

- Oracle does not support the JDBC-ODBC Bridge from Java 8. Oracle recommends that you use JDBC drivers provided by the vendor of your database instead of the JDBC-ODBC Bridge.

**Advantages:**
- easy to use.
- can be easily connected to any database.
**Disadvantages:**
- Performance degraded because JDBC method call is converted into the ODBC function calls.
- The ODBC driver needs to be installed on the client machine.

**2) Native-API driver**
- The Native API driver uses the client-side libraries of the database. 
- The driver converts JDBC method calls into native calls of the database API. 
- It is not written entirely in java.

![Screenshot](https://i.imgur.com/5NZkyzm.png)

Advantage:
- performance upgraded than JDBC-ODBC bridge driver.

Disadvantage:
- The Native driver needs to be installed on the each client machine.
- The Vendor client library needs to be installed on client machine.

**3) Network Protocol driver**
- The Network Protocol driver uses middleware (application server) that converts JDBC calls directly or indirectly into the vendor-specific database protocol. 
- It is fully written in java.

![Screenshot](https://i.imgur.com/unwIUOd.png)

**Advantage:**
- No client side library is required because of application server that can perform many tasks like auditing, load balancing, logging etc.

**Disadvantages:**
- Network support is required on client machine.
- Requires database-specific coding to be done in the middle tier.
- Maintenance of Network Protocol driver becomes costly because it requires database-specific coding to be done in the middle tier.

**4) Thin driver**
- The thin driver converts JDBC calls directly into the vendor-specific database protocol. 
- That is why it is known as thin driver. 
- It is fully written in Java language.
![Screenshot](https://i.imgur.com/teQTPAU.png)

**Advantage:**
- Better performance than all other drivers.
- No software is required at client side or server side.

**Disadvantage:**
- Drivers depend on the Database.

## Java Database Connectivity with 5 Steps

There are 5 steps to connect any java application with the database using JDBC. These steps are as follows:
- Register the Driver class
- Create connection
- Create statement
- Execute queries
- Close connection

![Screenshot](https://i.imgur.com/TP4WYOB.png)

**1) Register the driver class**
- The forName() method of Class class is used to register the driver class. 
- This method is used to dynamically load the driver class.

**Syntax**
```java
public static void forName(String className)throws ClassNotFoundException  
```
**Example**
```java
Class.forName("oracle.jdbc.driver.OracleDriver");   //  loading oracle driver to establish database connection.
```

**Note**
- Since JDBC 4.0, explicitly registering the driver is optional. 
- We just need to put vender's Jar in the classpath, and then JDBC driver manager can detect and load the driver automatically.

**2) Create the connection object**
- The getConnection() method of DriverManager class is used to establish connection with the database.

**Syntax**
```java
1) public static Connection getConnection(String url)throws SQLException  
2) public static Connection getConnection(String url,String name,String password)  
throws SQLException  
```

**Example**
```java
Connection con=DriverManager.getConnection(  
"jdbc:oracle:thin:@localhost:1521:xe","system","password");  
```

**3) Create the Statement object**
- The createStatement() method of Connection interface is used to create statement. 
- The object of statement is responsible to execute queries with the database.

**Syntax**
```java
public Statement createStatement()throws SQLException  
```
**Example**
```java
Statement stmt=con.createStatement();  
```
**4) Execute the query**
- The executeQuery() method of Statement interface is used to execute queries to the database. 
- This method returns the object of ResultSet that can be used to get all the records of a table.

**Syntax**
```java
public ResultSet executeQuery(String sql)throws SQLException  
```

**Example**
```java
ResultSet rs=stmt.executeQuery("select * from emp");  
while(rs.next()){  
System.out.println(rs.getInt(1)+" "+rs.getString(2));  
}  
```

**5) Close the connection object**
- By closing connection object statement and ResultSet will be closed automatically. 
- The close() method of Connection interface is used to close the connection.

**Syntax**
```java
public void close()throws SQLException  
```

**Example**
```java
con.close();  
```

*NOTE*: Since Java 7, JDBC has ability to use try-with-resources statement to automatically close resources of type Connection, ResultSet, and Statement.


## Java Database Connectivity with MySQL

- To connect Java application with the MySQL database, we need to follow 5 following steps.

- **Driver class:** The driver class for the mysql database is **com.mysql.jdbc.Driver.**
- **Connection URL:** The connection URL for the mysql database is jdbc:mysql://localhost:3306/Student
    - where jdbc is the API, 
    - mysql is the database, 
    - localhost is the server name on which mysql is running, we may also use IP address, 
    - 3306 is the port number and 
    - Student is the database name.

- **Username:** The default username for the mysql database is root.
- **Password:** It is the password given by the user at the time of installing the mysql database. 

## DriverManager class

- The DriverManager class is the component of JDBC API and also a member of the java.sql package. - The DriverManager class acts as an interface between users and drivers.
- . It keeps track of the drivers that are available and handles establishing a connection between a database and the appropriate driver.
- It contains all the appropriate methods to register and deregister the database driver class and to create a connection between a Java application and the database. 
- The DriverManager class maintains a list of Driver classes that have registered themselves by calling the method DriverManager.registerDriver()

**Methods**
- public static synchronized void registerDriver(Driver driver):
- public static synchronized void deregisterDriver(Driver driver):
- public static Connection getConnection(String url) throws SQLException:
- public static Connection getConnection(String url,String userName,String password) throws SQLException:
- public static Driver getDriver(String url)
- pubic static void setLoginTimeout(int sec)
- public static Connection getConnection(String URL, Properties prop) throws SQLException

## Connection interface
- A Connection is a session between a Java application and a database. It helps to establish a connection with the database.
- The Connection interface is a factory of Statement, PreparedStatement, and DatabaseMetaData, i.e., an object of Connection can be used to get the object of Statement and DatabaseMetaData. - The Connection interface provide many methods for transaction management like commit(), rollback(), setAutoCommit(), setTransactionIsolation(), etc.

**NOTE**
- By default, connection commits the changes after executing queries.

**Methods of Connection interface:**
- 1) **public Statement createStatement():** creates a statement object that can be used to execute SQL queries.

- 2) **public Statement createStatement(int resultSetType,int resultSetConcurrency):** Creates a Statement object that will generate ResultSet objects with the given type and concurrency.

- 3) **public void setAutoCommit(boolean status):** is used to set the commit status. By default, it is true.

- 4) **public void commit()**: saves the changes made since the previous commit/rollback is permanent.

- 5) **public void rollback():** Drops all changes made since the previous commit/rollback.

- 6) **public void close():** closes the connection and Releases a JDBC resources immediately.


**Connection Interface Fields**
- TRANSACTION_NONE: No transaction is supported, and it is indicated by this constant.

- TRANSACTION_READ_COMMITTED: It is a constant which shows that the dirty reads are not allowed. However, phantom reads and non-repeatable reads can occur.

- TRANSACTION_READ_UNCOMMITTED: It is a constant which shows that dirty reads, non-repeatable reads, and phantom reads can occur.

- TRANSACTION_REPEATABLE_READ: It is a constant which shows that the non-repeatable reads and dirty reads are not allowed. However, phantom reads and can occurr.

- TRANSACTION_SERIALIZABLE: It is a constant which shows that the non-repeatable reads, dirty reads as well as the phantom reads are not allowed.