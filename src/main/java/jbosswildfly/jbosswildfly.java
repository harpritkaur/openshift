/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author c0663712
 */
package jbosswildfly;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class jbosswildfly {
    private static Connection getConnection() throws SQLException {
            try{
        Class.forName("com.mysql.jdbc.Driver");
        }
        catch (ClassNotFoundException ex){
                Logger.getLogger(jbosswildfly.class.getName()).log(Level.SEVERE,null, ex);
    }
    String host = System.getenv("OPENSHIFT_MYSQL_DB_HOST");
    String port = System.getenv("OPENSHIFT_MYSQL_DB_PORT");
    String username = System.getenv("OPENSHIFT_MYSQL_DB_USERNAME");
    String password = System.getenv("OPENSHIFT_MYSQL_DB_PASSWORD");
    String name= "jbosswildfly";
    String url = "jbosswildfly://" + host + ":" + port + "/" + name;
    Connection con = DriverManager.getConnection(url,username,password);
    return con;
}
    

public static String getTable(){
String output ="";
Connection conn;
try{
 conn = getConnection();
Statement stmt =conn.createStatement();//
ResultSet rs =stmt.executeQuery("select*from people");
while (rs.next()){
    output +="<h2>"+rs.getString("name")+"</h2>";
    output +="<h2>"+rs.getString("bio")+"</h2>";
}

}
catch (SQLException ex){
    output=" SQL exception" +ex.getMessage();
}
return output;
}
}