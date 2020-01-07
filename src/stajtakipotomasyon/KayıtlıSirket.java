
package stajtakipotomasyon;

import java.sql.*;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ALPARSLAN
 */
public class KayıtlıSirket extends javax.swing.JFrame {
    
    
 
    public KayıtlıSirket() {
        initComponents();
    }

    private KayıtlıSirket(int aInt, int aInt0, String string, String string0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public ArrayList<KayıtlıSirket> kayitliSirketList(){
        Connection con = PhpMyAdminConnection.con; Statement st=PhpMyAdminConnection.st;ResultSet rs=PhpMyAdminConnection.rs;
        ArrayList<KayıtlıSirket> kayitlisirketList=new  ArrayList<>();
        String vericek = "SELECT * FROM kayitlisirket" ;
        
        try {
            st=con.createStatement();
            rs=st.executeQuery(vericek);
            
            KayıtlıSirket ks;
            
            while(rs.next()){
                
                ks=new KayıtlıSirket(rs.getInt("ogrenci_id"),rs.getInt("sirket_id"),rs.getString("sirket_isim"),rs.getString("danismanadi"));
                kayitlisirketList.add(ks);
            }
            
            
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return kayitlisirketList;
    }
    
   
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Öğrenci T.C Numarası :");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 140, 20));
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, 100, 30));

        jButton1.setText("Arama Yap");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, 100, 40));

        jLabel3.setText("Öğrenci ID :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 20, 100, 30));

        jLabel4.setText("Şirket ID :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 60, 100, 30));

        jLabel5.setText("Şirket Adı :");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 110, 100, 30));
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 20, 120, 30));
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 60, 120, 30));
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 110, 120, 30));

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resimler/761x365MainWallpaper.png"))); // NOI18N
        getContentPane().add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //Arama Yap  Butonu
       Connection con = PhpMyAdminConnection.con; Statement st=PhpMyAdminConnection.st;ResultSet rs=PhpMyAdminConnection.rs;
        String tut=jTextField1.getText();
        int a=Integer.parseInt(tut);
        
       
        try{
            
            
             String vericek = "SELECT ogrenci.ogrenci_id,kayitlisirket.sirketid,kayitlisirket.sirketisim FROM ogrenci INNER JOIN kayitlisirket ON ogrenci.ogrenci_id= kayitlisirket.ogrenci_id WHERE ogrenci.ogrenci_id='" +a+"'" ;
               
           rs = st.executeQuery(vericek);

            while(rs.next()) {
                
              
                
                String id=rs.getString("ogrenci.ogrenci_id");
                
                System.out.println(id);
                String sirketID=rs.getString("kayitlisirket.sirketid");
                System.out.println("şirketid="+sirketID);
                String isim=rs.getString("kayitlisirket.sirketisim");
                System.out.println(isim);
                
                 
                jTextField3.setText(id);
                jTextField4.setText(sirketID);
                jTextField5.setText(isim);
                // jTextField2.setText();

         //       System.out.println("recete_id= "+rs.getString("recete_id")+"recete_tarih= "+rs.getString("recete_tarih")+"recete_ilac_id= "+rs.getString("recete_ilac_id")+"recete_doktor_id= "+rs.getString("recete_doktor_id")+"recete_hasta_tc= "+rs.getString("recete_hasta_tc"));


            }


            System.out.println("Alindi");
                
                
                //jTable1.
                /*
                setText("  Ogrenci id: "+rs.getString("ogrenci_id")+"  Sirket id: "+rs.getString("sirket_id")
                        +"  Sirket Adı: "+rs.getString("sirket_isim")+"  Danisman Adı: "+rs.getString("danismanadi"));*/
            

            

        } catch (SQLException ex) {

            ex.printStackTrace();

            System.out.println(ex.getMessage());

        }

        
        
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        PhpMyAdminConnection.sqlbaslat();
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KayıtlıSirket().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables
}
