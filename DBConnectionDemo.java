//wap which connects to a drive on mysql driver and prints system connected or database connected successfully
import java.sql.Connection;
import java.sql.DriverManager;
public class DBConnectionDemo {
    public static void main(String[] args) {
        try{
            // Step 1: Load MySQL Driver (Optional in Latest versions)
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Step 2: Establish Connection
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/studentdb",
                "root",
                "password"
            );
            System.out.println("Database connected successfully!");
            // Step 3: Close the connection
            con.close();
        } catch (Exception e) {
            System.out.println("Error occurred while connecting to the database.");
    }
    }
}
/* This is a simple example of connecting to a MySQL database using JDBC in Java.
Observation: The code demonstrates how to load the MySQL driver, establish a connection to the database, and handle exceptions that may occur during the connection process. 
Note: Make sure to replace "localhost:3306/studentdb", "root", and "password" with your actual database URL, username, and password. Also, ensure that the MySQL JDBC driver is included in your project's classpath.
 */


/* Steps to connect to a database management system 
step 1: Load MySQL Driver (Optional in Latest versions)
step 2: Create Connection
step 3: Close the connection
 */