import java.sql.*;


class MySQLConnection{
  
  public static void main(String[] args) { 
    
    String url = "jdbc:mysql://localhost:3306/VeganPantry";
    String username = "root";
    String password = "H3ll@D@t@2020";
    
    try{
      Connection connection = DriverManager.getConnection(url, username, password);
    
    System.out.println("Connection sucessful");
    } catch (SQLException e) { 
      System.out.println("Connection failed");
      e.printStackTrace();
    }
  }
}
 
// May need to download platform independent connectorJ
// If you are developing any web app, you have to put mysql-connector to the lib folder of WEB-INF Directory of your web-app

