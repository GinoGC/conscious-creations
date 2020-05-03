import java.sql.*;

public class PantryDB{
  
  private String url;
  private String username;
  private String pass;
         
    
  
  
  
  // Establishes database connection. This is used in every other method
  public Connection getConnection() throws Exception {
       try{
         
         Connection conn = DriverManager.getConnection(this.url, this.username, this.pass);
    
         //if this prints the connection succeeded
         System.out.println("Connection sucessful");
         
         return conn;
         
       } catch (SQLException e) { 
         System.out.println("Connection failed");
         e.printStackTrace();
         return null;
       }
  }
  

  
  // This method adds a new user to the database. It should search for the users email in the database. If 
  //the email already exists, the user will be prompted to login to their existing account. If the email
  //does not already exist, the user will be added to the database.
  public void addUser(String email, String username) throws Exception {
       try{
         
         //calls cogetConnection method to establish connection to MySQL server
         Connection conn = getConnection();
         
          
         //this next line executes the SQL code within the quotes using connector J
         PreparedStatement create = conn.prepareStatement("INSERT INTO Users(email, username)" +
                                                             "VALUES('" + email + "', '" + username + "')");
         
         create.executeUpdate();
         System.out.println("Function Executed Successfully");
       } catch (SQLException e) { 
         System.out.println("Function Failed to Execute");
         e.printStackTrace();
       }
    }
  
  
  
  //constructor method
  public PantryDB(String url, String username, String pass){
    this.url = url;
    this.username = username;
    this.pass = pass;
  }
  
  
}

    

