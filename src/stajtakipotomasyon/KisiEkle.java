
package stajtakipotomasyon;

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
public class KisiEkle extends javax.swing.JFrame {
        
 
    
    public KisiEkle() {
        initComponents();
       
    }
    
   

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Kullanıcı Adı :");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 30, 90, 20));

        jLabel2.setText("T.C. No:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        jLabel3.setText("İsim :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 40, 20));

        jLabel4.setText("Ayrıntılar :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 60, 20));

        jLabel5.setText("Şifre :");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 80, 60, 20));

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 130, 30));

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 130, 30));
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 70, 130, 30));
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, 130, 30));
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 30, 130, 30));

        jButton1.setBackground(new java.awt.Color(102, 255, 102));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resimler/deleteIcon.png"))); // NOI18N
        jButton1.setText("Sil");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 220, 140, 50));

        jButton2.setBackground(new java.awt.Color(102, 255, 102));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resimler/okIcon_1.png"))); // NOI18N
        jButton2.setText("Kayıt Et");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, 140, 50));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resimler/761x365MainWallpaper.png"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 360));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //Silme işlemi yapılacak
        Connection con = PhpMyAdminConnection.con; Statement st=PhpMyAdminConnection.st;ResultSet rs=PhpMyAdminConnection.rs;
        
        String TCNo=jTextField2.getText();
        String isim=jTextField1.getText();
        String ayrintilar=jTextField4.getText();
        String kullaniciAdi=jTextField5.getText();
        String sifre=jTextField3.getText();
        
        int a=Integer.parseInt(TCNo);
        
        try{
            String verigonder = "DELETE FROM kisi WHERE TC = "+a+" ";

            st.execute(verigonder);

            System.out.println("Gonderildi");

        } catch (SQLException ex) {

            ex.printStackTrace();

            System.out.println(ex.getMessage());

        }
        
       
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        //Kayıt Et  butonu
        
        Connection con = PhpMyAdminConnection.con; Statement st=PhpMyAdminConnection.st;ResultSet rs=PhpMyAdminConnection.rs;
      // Basıldığında veri tabanındaki kisiler tablosuna ekleme yapılacak
        String TCNo=jTextField2.getText();
        String isim=jTextField1.getText();
        String ayrintilar=jTextField4.getText();
        String kullaniciAdi=jTextField5.getText();
        String sifree=jTextField3.getText();
        
        int a=Integer.parseInt(TCNo);
        //veri tabanına ekleme yapılacak
        
        //TC kısmında sıkıntı var
        
        try{
            String verigonder = "INSERT INTO kisi (TC,isim,kullaniciadi,sifre,ayrintilar) VALUES ('"+a+"','"+isim+
                    "'),('"+kullaniciAdi+"'),('"+sifree+"'),('"+ayrintilar+"')";

            st.execute(verigonder);

            System.out.println("Gonderildi");

        } catch (SQLException ex) {

            ex.printStackTrace();

            System.out.println(ex.getMessage());

        }
       
       
        
    }//GEN-LAST:event_jButton2ActionPerformed

    
    public static void main(String args[]) {
       
        PhpMyAdminConnection.sqlbaslat();
         
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KisiEkle().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables
}
