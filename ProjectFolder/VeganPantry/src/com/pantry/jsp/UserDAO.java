package com.pantry.jsp;
import java.sql.*;

import org.apache.tomcat.jni.User;

public class UserDAO {
	public User getUserFromCredentials(Connection conn, String email, String password) {
        //probably a query
        //Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        User user = null;
        try {
            //question marks replaced with setStrings 1 & 2
            pstmt = conn.prepareStatement("SELECT Username, email FROM users"
                + " WHERE email = ? AND password = ?");
            pstmt.setString(1, email);
            pstmt.setString(2, password);
            rs = pstmt.executeQuery();
            //////////////////////////////////////////////////////////////////////////////////////////////
            if (rs.next()) {
                user = new User(/*rs.getString("username"), rs.getString("email")*/);
            }
            //////////////////////////////////////////////////////////////////////////////////////////////
        } catch (Exception e) {
            //handle the exception
            e.printStackTrace();
        } finally {
            //close the resources
            try {
                rs.close();
                pstmt.close();
                conn.close();
            } catch (SQLException e) {
                //handle the exception
                e.printStackTrace();
            }
        }
        return user;
    }
}
