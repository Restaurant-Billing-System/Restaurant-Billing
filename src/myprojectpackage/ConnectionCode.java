/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myprojectpackage;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author skhas
 */
public class ConnectionCode {
    static Connection con;
    ConnectionCode(){
           try{
        Class.forName("oracle.jdbc.driver.OracleDriver");
        con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","Javaproject","9390016702");
        }
        catch(Exception e){
            System.out.println("Error occures "+e);
        } 
    }
}
//public class connect{

//}
