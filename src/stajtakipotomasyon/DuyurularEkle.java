 
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
public class DuyurularEkle extends javax.swing.JFrame {
 
    
    
    public DuyurularEkle() {
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
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Durum :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, 100, 30));

        jLabel3.setText("Duyuru_ID :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 100, 30));

        jLabel4.setText("Teslim_Tarihi :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, 100, 30));

        jButton2.setBackground(new java.awt.Color(102, 204, 0));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resimler/deleteIcon.png"))); // NOI18N
        jButton2.setText("Sil");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 260, 110, 40));

        jButton3.setBackground(new java.awt.Color(102, 204, 0));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resimler/32x32Done.png"))); // NOI18N
        jButton3.setText("Kayıt Et");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 260, 110, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resimler/761x365MainWallpaper.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, 340));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        //Silme işlemi yapılacak
        Connection con = PhpMyAdminConnection.con; Statement st=PhpMyAdminConnection.st;ResultSet rs=PhpMyAdminConnection.rs;
        
        String duyuruID=jTextField2.getText();
        String durum=jTextField1.getText();
        String teslimTarihi=jTextField3.getText();
        
        int a=Integer.parseInt(duyuruID);
        
        
        try{
            String verigonder = "DELETE FROM duyurular WHERE Duyuru_id = "+duyuruID+" ";

            st.execute(verigonder);

            System.out.println("Gonderildi");

        } catch (SQLException ex) {

            ex.printStackTrace();

            System.out.println(ex.getMessage());

        }
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       //Kayıt Et butonu
        
        Connection con = PhpMyAdminConnection.con; Statement st=PhpMyAdminConnection.st;ResultSet rs=PhpMyAdminConnection.rs;
        
        String duyuruID=jTextField2.getText();
        String durum=jTextField1.getText();
        String teslimTarihi=jTextField3.getText();
        
        int a=Integer.parseInt(duyuruID);
        
         try{
            String verigonder = "INSERT INTO duyurular (Duyuru_id,Durum,teslimtarihi) VALUES ('"+a+"','"+durum
                                    +"','"+teslimTarihi+"')";

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
                new DuyurularEkle().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
