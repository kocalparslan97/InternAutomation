package stajtakipotomasyon;

import java.sql.*;

import javax.swing.*;

/**
 *
 * @author ALPARSLAN
 */
public class LoginScreen extends javax.swing.JFrame {

   
    public LoginScreen() {
        initComponents();
        
       // PhpMyAdminConnection.ConnectDB();
        
    }
   

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setBackground(new java.awt.Color(0, 153, 153));
        jButton2.setText("About");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 400, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resimler/32x32User.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, 29, 33));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resimler/StajTitle.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(148, 39, -1, 137));
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 270, 121, 35));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resimler/32x32Key.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, 29, 33));
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 220, 121, 33));

        jButton1.setBackground(new java.awt.Color(153, 255, 51));
        jButton1.setText("Giriş Yap");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 330, 92, 31));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resimler/Abstract-Pattern-Background.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 510, 460));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

         Connection con = PhpMyAdminConnection.con; Statement st=PhpMyAdminConnection.st;ResultSet rs=PhpMyAdminConnection.rs;
        
        String kullaniciAdi=jTextField1.getText();
        String sifre=jTextField2.getText();
        
        
        
       try {
        if (kullaniciAdi != null && sifre != null) {
            String verigonder = "Select kullaniciadi,sifre from kisi Where kullaniciadi='" + kullaniciAdi 
                    + "' and sifre='" + sifre + "'";
            
             st.execute(verigonder);
             rs = st.executeQuery(verigonder);
            System.out.println("Gonderildi");
            
            if (rs.next()) {
               

                
                JOptionPane.showMessageDialog(rootPane, "Başarılı Giriş Yapıldı !");
                
                LoginScreen ls=new LoginScreen();
                ls.setVisible(false);
                MainScreen ms=new MainScreen();
                ms.setVisible(true);
               
                
            } else {
               
                JOptionPane.showMessageDialog(rootPane, "Tekrar Giriş Yapınız !");
                
                
            }
        }

        // You can also validate user by result size if its comes zero user is invalid else user is valid

    } catch (SQLException ex) {
         ex.printStackTrace();
         System.out.println(ex.getMessage());
        
    }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        About ab=new About();
        ab.setVisible(true);
        
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    public static void main(String args[]) {
       
        PhpMyAdminConnection.sqlbaslat();
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginScreen().setVisible(true);
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
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
