package com.login.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


/**
 *
 * @author amany
 */
public class alogindao {
    
String sql="select * from admin where user=? and pass=?";

public boolean check(String uid,String pass) {

   
    try {
        Class.forName("org.sqlite.JDBC");
            Connection con = DriverManager.getConnection("jdbc:sqlite:C:/Sqllite/aman.db");
            
    PreparedStatement st=con.prepareStatement(sql);
    st.setString(1,uid);
    st.setString(2,pass);
    ResultSet rs=st.executeQuery();
    if(rs.next())
    {
    return true;
    }
    } catch (ClassNotFoundException | SQLException e) {
    }
    return false;
}
}
