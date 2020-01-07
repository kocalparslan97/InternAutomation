
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
public class SirketEkle extends javax.swing.JFrame {

    
    public SirketEkle() {
        initComponents();
        
       
        
    }
     public void theQuery(String query ){
       
        
        
        
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, 110, 30));
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 110, 30));
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 30, 110, 30));
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 90, 110, 30));

        jButton1.setBackground(new java.awt.Color(102, 204, 0));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resimler/deleteIcon.png"))); // NOI18N
        jButton1.setText("Sil");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 260, 120, 40));

        jButton2.setText("Kayıtlı Şirket");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 40, 120, 40));

        jLabel5.setText("Şehir :");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 30, 50, 20));

        jLabel4.setText("Adres :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 90, 50, 20));

        jLabel2.setText("Şirket Adı :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, -1));

        jLabel3.setText("Şirket ID :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, -1, -1));

        jButton3.setBackground(new java.awt.Color(102, 204, 0));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resimler/32x32Done.png"))); // NOI18N
        jButton3.setText("Kayıt Et");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 260, 120, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resimler/761x365MainWallpaper.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, 360));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        //Silme İşlemi yapılacak
        
        Connection con = PhpMyAdminConnection.con; Statement st=PhpMyAdminConnection.st;ResultSet rs=PhpMyAdminConnection.rs;
        String sirketID=jTextField2.getText();
        String sirketAdı=jTextField3.getText();
        String sehir=jTextField4.getText();
        String adres=jTextField5.getText();
        
        int a=Integer.parseInt(sirketID);
        
         try{
            String verigonder = "DELETE FROM sirket WHERE sirket_id = "+a+" ";

            st.execute(verigonder);

            System.out.println("Gonderildi");

        } catch (SQLException ex) {

            ex.printStackTrace();

            System.out.println(ex.getMessage());

        }
        
       
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // Kayıtlı Şirket butonuna basıldığında Başka bir  forum a gidilecek
        
        Connection con = PhpMyAdminConnection.con; Statement st=PhpMyAdminConnection.st;ResultSet rs=PhpMyAdminConnection.rs;
        KayıtlıSirket ks=new KayıtlıSirket();
        ks.setVisible(true);
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // Kayıt Et Butonu 
        Connection con = PhpMyAdminConnection.con; Statement st=PhpMyAdminConnection.st;ResultSet rs=PhpMyAdminConnection.rs;
        //Butona basıldığında eklenen Şirket bilgilerini veritabanındaki Şirket tablosuna ekleyecek
        
        String sirketID=jTextField2.getText();
        String sirketAdı=jTextField3.getText();
        String sehir=jTextField4.getText();
        String adres=jTextField5.getText();
        
        int a=Integer.parseInt(sirketID);
        
        try{
            String verigonder = "INSERT INTO sirket (sirket_id,sirket_isim,sirket_sehir,sirket_adres) VALUES ('"
                    +a+"','"+sirketAdı+"','"+sehir+"','"+adres +"')";

            st.execute(verigonder);

            System.out.println("Gonderildi");

        } catch (SQLException ex) {

            ex.printStackTrace();

            System.out.println(ex.getMessage());

        }
       
        
       
        
    }//GEN-LAST:event_jButton3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
      
        PhpMyAdminConnection.sqlbaslat();
        
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SirketEkle().setVisible(true);
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
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables
}
