/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stajtakipotomasyon;

import com.sun.jmx.snmp.BerDecoder;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author ALPARSLAN
 */
public class OgrenciEkle extends javax.swing.JFrame {

  
   
   
    
    public OgrenciEkle() {
        initComponents();
        
        
       
    }
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("AGNO :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 50, 20));
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 110, 30));

        jLabel3.setText("Ogrenci_ID :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 80, 20));
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, 110, 30));

        jLabel4.setText("Yaşı :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 80, 20));
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 110, 30));

        jLabel5.setText("Departman_Kodu :");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 100, 20));
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 110, 30));

        jButton1.setBackground(new java.awt.Color(102, 204, 0));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resimler/32x32Done.png"))); // NOI18N
        jButton1.setText("Ogrenci_Ekle");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 50, 140, 40));

        jButton2.setBackground(new java.awt.Color(102, 204, 0));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resimler/deleteIcon.png"))); // NOI18N
        jButton2.setText("Sil");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 170, 140, 40));

        jButton3.setBackground(new java.awt.Color(102, 204, 0));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resimler/updateIcon.png"))); // NOI18N
        jButton3.setText("Güncelle");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 110, 140, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resimler/761x365MainWallpaper.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 330));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //Kayıt Et butonu 
        
        Connection con = PhpMyAdminConnection.con; Statement st=PhpMyAdminConnection.st;ResultSet rs=PhpMyAdminConnection.rs;
        
        String agno=jTextField1.getText();
        String ogrenci_ID=jTextField2.getText();
        String yas=jTextField3.getText();
        String departmanKodu=jTextField4.getText();
        
        int a=Integer.parseInt(yas);
        int b=Integer.parseInt(ogrenci_ID);
        int c=Integer.parseInt(departmanKodu);
        
        try{
            String verigonder = "INSERT INTO ogrenci (ogrenci_id,AGNO,yas,bolum_id) VALUES ('"
                    +b+"','"+agno+"','"+a+"','"+c+"')";

            st.execute(verigonder);

            System.out.println("Gonderildi");

        } catch (SQLException ex) {

            ex.printStackTrace();

            System.out.println(ex.getMessage());

        }
        
        
        
 
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        //Silme Butonu
        Connection con = PhpMyAdminConnection.con; Statement st=PhpMyAdminConnection.st;ResultSet rs=PhpMyAdminConnection.rs;
        
        String agno=jTextField1.getText();
        String ogrenci_ID=jTextField2.getText();
        String yas=jTextField3.getText();
        String departmanKodu=jTextField4.getText();
        
        int a=Integer.parseInt(yas);
        int b=Integer.parseInt(ogrenci_ID);
        int c=Integer.parseInt(departmanKodu);
        
        try{
            String verigonder = "DELETE FROM ogrenci WHERE ogrenci_id = "+b+" ";

            st.execute(verigonder);

            System.out.println("Gonderildi");

        } catch (SQLException ex) {

            ex.printStackTrace();

            System.out.println(ex.getMessage());

        }
        
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        //Güncelleme butonu
        String agno=jTextField1.getText();
        String ogrenci_ID=jTextField2.getText();
        String yas=jTextField3.getText();
        String departmanKodu=jTextField4.getText();
        
        int a=Integer.parseInt(yas);
        int b=Integer.parseInt(ogrenci_ID);
        int c=Integer.parseInt(departmanKodu);
        
        
        
    }//GEN-LAST:event_jButton3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        PhpMyAdminConnection.sqlbaslat();
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OgrenciEkle().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}
