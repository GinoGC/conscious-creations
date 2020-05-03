import java.sql.*;


class MySQLConnectionMethodized{
  
  public static void main(String[] args) throws Exception{ 
    
    
    
  }
  
  
  
  
  
// Establishes database connection. This is used in every other method
public static Connection getConnection() throws Exception {
       try{
         String url = "jdbc:mysql://localhost:3306/VeganPantry";
         String username = "root";
         String password = "H3ll@D@t@2020";
         Connection conn = DriverManager.getConnection(url, username, password);
    
         //if this prints the connection succeeded
         System.out.println("Connection sucessful");
         
         return conn;
         
       } catch (SQLException e) { 
         System.out.println("Connection failed");
         e.printStackTrace();
         return null;
       }
    }


// This is a prepared statement function
public static void createTable() throws Exception{
  Connection conn = getConnection();
  
  //this next line executes the SQL code within the quotes using connector J
  PreparedStatement create = conn.preparedstatement("USE ");
  
  create.executeUpdate();
  finally(System.out.println("Function complete");
}



} //class
 
// May need to download platform independent connectorJ
// When developing any web app, you have to put mysql-connector to the lib folder of WEB-INF Directory of your web-app

