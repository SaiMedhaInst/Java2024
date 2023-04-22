						
        
## NOTES  & PROGRAMS
==========================

    link: https://github.com/SaiMedhaInst/JAVA  





            
### JAVA ---->JDBC API ---->DATABASE
=========================================
        
        1. Download any DATABASE like MYSQL , ORACLE , POSTGRES SQL
            MYSQL : https://dev.mysql.com/downloads/installer/
            
        2. Download respective Driver from online vendor website  
        for example:
            MySQL DATABASE 
                driver/ jar file: mysql-connector-j-8.0.32
                
                website: https://mvnrepository.com/artifact/mysql/mysql-connector-java
                
            - after downloading jar add it in the following path
                    drive jar path : D:\Java\Java-8\jre\lib\ext
                    
        3. Get the respective driver-names 
            - com.mysql.cj.jdbc.Driver --> mysql 
            - oracle.jdbc.driver.OracleDriver -- > oracle




    ### SERVLETS EXECUTION
==============================================
   
   - IDE : Eclipse or NetBeans 
            
             link: https://www.eclipse.org/downloads/packages/release/neon/3

   - WebServer: Apache Tomcat or Resin (servlet container)

            link: https://tomcat.apache.org/download-90.cgi






## STEPS
    1. Add the tomcat server into the workspace 
        verify by starting the server hit the localhost:8080 --> welcome page 
    
    2. Create Dynamic web project.
    3. Create Package and write servlet program
    4. Create Servlet mapping in web.xml file








 ## SERVLET MAPPING TEMPLATE 
 

 <servlet>  
    <servlet-name>servletname</servlet-name>  
    <servlet-class>servlet-class-path</servlet-class>  
  </servlet> 
  
  
<servlet-mapping>  
    <servlet-name>servletname</servlet-name>  
    <url-pattern>/url-pattern</url-pattern>  
</servlet-mapping> 