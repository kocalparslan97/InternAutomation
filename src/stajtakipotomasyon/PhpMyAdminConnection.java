package stajtakipotomasyon;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
/**
 *
 * @author ALPARSLAN
 */

public class PhpMyAdminConnection {
    static  Connection con = null;  static Statement st = null; static ResultSet rs = null;

  
   static void sqlbaslat(){
          try {

            Class.forName("com.mysql.jdbc.Driver");

            String url = "jdbc:mysql://localhost:3306/deneme";


            String kullaniciad = "root";

 
            String sifre = "";


            con = DriverManager.getConnection(url, kullaniciad, sifre);
            

            st = con.createStatement();


            System.out.println("Baglandi");
           


        } catch (ClassNotFoundException ex) {


            ex.printStackTrace();        


            System.out.println("Sürücü projeye eklenmemiş!");


        } catch (SQLException ex) {


            ex.printStackTrace();


            System.out.println(ex.getMessage());


        }

    }
    
    
    
    public static void main(String[] args) {
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
//    public static Connection ConnectDB(String query){
//        
//        Statement st=null;
//        
//        try {
//            Class.forName("com.mysql.jdbc.Driver");//cj
//            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/deneme", "root", "");
//            st=conn.createStatement();
//            st.executeUpdate(query);
//            System.out.println("Connected !!");
//            return  conn;
//        } catch (Exception e) {
//            JOptionPane.showMessageDialog(null, e);
//            return null;
//            
//        }
        
        
    }
    //https://javarevisited.blogspot.com/2015/06/how-to-connect-to-mysql-database-in-java-jdbc-example.html den aldım
    
     // JDBC URL, username and password of MySQL server
//    private static final String url = "jdbc:mysql://localhost/test";
//    private static final String user = "root";
//    private static final String password = "root";

    // JDBC variables for opening and managing connection
//    private static Connection con;
//    private static Statement stmt;
//    private static ResultSet rs;
    
//    public void theQuery(String query ){
//        
//        
//        Connection con=null;
//        PreparedStatement psmt=null;
//        Statement stmt=null;
//        try {
//            Class.forName("com.mysql.jdbc.Driver");
//            con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:8080/deneme","root","");
//            //con=DriverManager.getConnection("jdbc:mysql://localhost:3306/deneme?zeroDateTimeBehavior=convertToNull","root","");
//            stmt=con.createStatement();
//            JOptionPane.showMessageDialog(null, "Connected !");
//            con.close();
//        } catch (Exception e) {
//            JOptionPane.showMessageDialog(null, "Not Connection !");
//        }
//    }
   /// public static void main(String[] args) {
        
//        String query = "select count(*) from books";
//
//        try {
//            // opening database connection to MySQL server
//            con = DriverManager.getConnection(url, user, password);
//
//            // getting Statement object to execute query
//            stmt = con.createStatement();
//
//            // executing SELECT query
//            rs = stmt.executeQuery(query);
//
//            while (rs.next()) {
//                int count = rs.getInt(1);
//                System.out.println("Total number of books in the table : " + count);
//            }
//
//        } catch (SQLException sqlEx) {
//            sqlEx.printStackTrace();
//        } finally {
//            //close connection ,stmt and resultset here
//            try { con.close(); } catch(SQLException se) { /*can't do anything */ }
//            try { stmt.close(); } catch(SQLException se) { /*can't do anything */ }
//            try { rs.close(); } catch(SQLException se) { /*can't do anything */ }
//        }
    //}

//    static ResultSet ConnectDB(String string) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
        
        
    
   
      

   

