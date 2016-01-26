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

public class jbosswildfly {
    private static Connection getConnection() throws SQLException ,ClassNotFoundException{
            try{
        Class.forName("com.mysql.jdbc.Driver");
        }
        catch (ClassNotFoundException ex){
                Logger.getLogger(jbosswildfly.class.getName()).log(Level.SERVER,null, ex)
    }
    String host = System.out.getenv("OPENSHIFT_MYSQL_DB_HOST");
    String port = System.out.getenv("OPENSHIFT_MYSQL_DB_PORT");
    String username = System.out.getenv("OPENSHIFT_MYSQL_DB_USERNAME");
    String password = System.out.getenv("OPENSHIFT_MYSQL_DB_PASSWORD");
    String name= "jbosswildfly";
    String host = System.out.getenv("OPENSHIFT_MYSQL_DB_HOST");
}
    }

public static String getTAble(){
String output ="";
try{
Connection conn = getConnection();
ResultSet rs =stmt.executeQuery("")
}
}