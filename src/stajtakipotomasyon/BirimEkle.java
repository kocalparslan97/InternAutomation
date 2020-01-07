
package stajtakipotomasyon;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ALPARSLAN
 */
public class BirimEkle extends javax.swing.JFrame {

   
    
    
    public BirimEkle() {
        initComponents();
       // conn=PhpMyAdminConnection.ConnectDB(query);
        
    }

    private BirimEkle(int aInt, int aInt0, String string, int aInt1, String string0, String string1, int aInt2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Birim ID :");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 50, 20));

        jLabel3.setText("Kota Dönemi :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 90, 30));

        jLabel4.setText("Şirket ID :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 60, 30));

        jLabel5.setText("İsim :");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 80, 30));

        jLabel6.setText("Kota / Kapasite :");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 90, 30));

        jLabel7.setText("Kota Danışmanı :");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 100, 30));

        jLabel8.setText("Teslim Tarihi :");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 80, 30));
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 300, 150, 40));
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, 140, 30));
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, 140, 30));

        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 140, 30));
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, 140, 30));
        getContentPane().add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, 150, 40));

        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 250, 150, 40));

        jButton1.setBackground(new java.awt.Color(102, 204, 0));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resimler/deleteIcon.png"))); // NOI18N
        jButton1.setText("Sil");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 460, 130, 50));

        jButton2.setBackground(new java.awt.Color(102, 204, 0));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resimler/32x32Done.png"))); // NOI18N
        jButton2.setText("Satır Ekle");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 460, 130, 50));

        jButton3.setBackground(new java.awt.Color(102, 204, 0));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resimler/okIcon_1.png"))); // NOI18N
        jButton3.setText("Kayıt Et");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 460, 130, 50));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Şirket ID", "İsim", "Kota Kapasite", "Kota Danışmanı", "Teslim Tarihi", "Kota Dönemi"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, 610, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      //Silme butonu
        
        Connection con = PhpMyAdminConnection.con; Statement st=PhpMyAdminConnection.st;ResultSet rs=PhpMyAdminConnection.rs;
        
        int birimID=Integer.parseInt(jTextField2.getText());
        //int sirketID=Integer.parseInt(jTextField3.getText());
        String sirketID=jTextField3.getText();
        String isim=jTextField4.getText();
        //int kapasite=Integer.parseInt(jTextField5.getText()); // jTextField5 e yazılan yazıyı int degere dönüştürdük
        String kapasite=jTextField5.getText();
        String kotaDanismani=jTextField6.getText();
        String teslimTarihi=jTextField7.getText();
        //int kotaDonemi=Integer.parseInt(jTextField1.getText());
        String kotaDonemi=jTextField1.getText();
        
        int a=Integer.parseInt(sirketID);
       int b=Integer.parseInt(kapasite);
       int c=Integer.parseInt(kotaDonemi);

        try{
            String verigonder = "DELETE FROM birim WHERE birim_id = "+birimID+" ";

            st.execute(verigonder);

            System.out.println("Gonderildi");

        } catch (SQLException ex) {

            ex.printStackTrace();

            System.out.println(ex.getMessage());

        }
    
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       // Satır ekle
       
    //Veritabanına ekleme yapılacak
        
    Connection con = PhpMyAdminConnection.con; Statement st=PhpMyAdminConnection.st;ResultSet rs=PhpMyAdminConnection.rs;
         
       String sirketID=jTextField3.getText();
        String isim=jTextField4.getText();
        //int kapasite=Integer.parseInt(jTextField5.getText()); // jTextField5 e yazılan yazıyı int degere dönüştürdük
        String kapasite=jTextField5.getText();
        String kotaDanismani=jTextField6.getText();
        String teslimTarihi=jTextField7.getText();
        //int kotaDonemi=Integer.parseInt(jTextField1.getText());
        String kotaDonemi=jTextField1.getText();
        
       int a=Integer.parseInt(sirketID);
       int b=Integer.parseInt(kapasite);
       int c=Integer.parseInt(kotaDonemi);
        
       DefaultTableModel model=(DefaultTableModel)jTable1.getModel();
        model.addRow(new Object[]{a,isim,b,kotaDanismani,teslimTarihi,c});
       
       
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // Kayıt Et butonu
        
        Connection con = PhpMyAdminConnection.con; Statement st=PhpMyAdminConnection.st;ResultSet rs=PhpMyAdminConnection.rs;
        
         String sirketID=jTextField3.getText();
        String isim=jTextField4.getText();
        //int kapasite=Integer.parseInt(jTextField5.getText()); // jTextField5 e yazılan yazıyı int degere dönüştürdük
        String kapasite=jTextField5.getText();
        String kotaDanismani=jTextField6.getText();
        String teslimTarihi=jTextField7.getText();
        //int kotaDonemi=Integer.parseInt(jTextField1.getText());
        String kotaDonemi=jTextField1.getText();
        
       int a=Integer.parseInt(sirketID);
       int b=Integer.parseInt(kapasite);
       int c=Integer.parseInt(kotaDonemi);
        
        
        try{
            String verigonder = "INSERT INTO birim (sirket_id,isim,Kotakapasitesi,Kotadanismani,teslimtarihi,Kotadonemi) VALUES ('"
                    +a+"','"+isim+"','"+b+"','"+kotaDanismani +"','"+teslimTarihi+"','"+c+"')";

            st.execute(verigonder);

            System.out.println("Gonderildi");

        } catch (SQLException ex) {

            ex.printStackTrace();

            System.out.println(ex.getMessage());

        }
       
        
        
        
        
    }//GEN-LAST:event_jButton3ActionPerformed

//    public ArrayList<BirimEkle>getBirimList(){
//        
//        ArrayList<BirimEkle> BirimList=new ArrayList<>();
//        Connection conn=PhpMyAdminConnection.ConnectDB();
//        String query="SELECT * FROM 'birim'";
//        
//        Statement st;
//        ResultSet rs;
//        
//        try {
//            st=conn.createStatement();
//            rs=st.executeQuery(query);
//            BirimEkle birimEkle;
//            
//            while(rs.next()){
//                birimEkle=new BirimEkle(rs.getInt("Birim_id"),rs.getInt("Şirket_id"),rs.getString("İsim"),rs.getInt("Kotakapasitesi")
//                        ,rs.getString("Kotadanismani"),rs.getString("Teslimtarihi"),rs.getInt("Kotadonemi"));
//                BirimList.add(birimEkle);
//                
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return BirimList;
//        
//        
//    }
//    
//    //display data  in jtable 
//    
//    public void BirimTabloGoster(){
//        
//        ArrayList<BirimEkle> list=getBirimList();
//        DefaultTableModel model=(DefaultTableModel)jTable1.getModel();
//        Object [] row =new Object[7];
//        
////        for(int i=0;i<list.size();i++){
////            row[0]=list.get(i).getBirim_id();
////            row[0]=list.get(i).getSirket_id();
////            row[0]=list.get(i).getIsim();
////            row[0]=list.get(i).getKota_kapasitesi();
////            row[0]=list.get(i).getKota_danismani();
////            row[0]=list.get(i).getTeslim_Tarihi();
////            row[0]=list.get(i).getKota_donemi();
////            
////            model.addRow(row);
////            
////            
////        }
//        
//    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       
        
        PhpMyAdminConnection.sqlbaslat();
        
        
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BirimEkle().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    // End of variables declaration//GEN-END:variables
}
