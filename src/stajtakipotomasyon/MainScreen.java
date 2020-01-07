
package stajtakipotomasyon;


import java.awt.HeadlessException;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import java.sql.*; // sql bağlantısı için
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;

/**
 *
 * @author ALPARSLAN
 */
public class MainScreen extends javax.swing.JFrame {

    

    public MainScreen(JButton jButton1, JButton jButton10, JButton jButton11, JButton jButton12, JButton jButton2, JButton jButton3, JButton jButton4, JButton jButton5, JButton jButton6, JButton jButton7, JButton jButton8, JButton jButton9, JLabel jLabel1, JLabel jLabel2, JMenu jMenu1, JMenu jMenu2, JMenu jMenu3, JMenu jMenu4, JMenu jMenu5, JMenu jMenu6, JMenu jMenu7, JMenu jMenu8, JMenuBar jMenuBar1, JScrollPane jScrollPane1, JTextField jTextField1) throws HeadlessException {
        this.jButton1 = jButton1;
        this.jButton10 = jButton10;
        this.jButton11 = jButton11;
        this.jButton12 = jButton12;
        
        this.jButton3 = jButton3;
        this.jButton4 = jButton4;
        this.jButton5 = jButton5;
        this.jButton6 = jButton6;
        this.jButton7 = jButton7;
        this.jButton8 = jButton8;
        this.jButton9 = jButton9;
        
        this.jLabel2 = jLabel2;
        this.jMenu1 = jMenu1;
        this.jMenu2 = jMenu2;
        this.jMenu3 = jMenu3;
        this.jMenu4 = jMenu4;
        this.jMenu5 = jMenu5;
        this.jMenu6 = jMenu6;
        this.jMenu7 = jMenu7;
        this.jMenu8 = jMenu8;
        this.jMenuBar1 = jMenuBar1;
        
    }
    
    
    public MainScreen() {
        initComponents();
        
       
        
        
    }
    
    

   
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();
        jMenu8 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("Kayıtlı Uygulama Ekle");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 200, 150, -1));

        jButton3.setText("Kişi Ekle");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 130, -1));

        jButton4.setText("Şirket Ekle");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, 130, -1));

        jButton5.setText("Birim Ekle");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, 130, -1));

        jButton6.setText("Kota Ekle");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 130, 130, -1));

        jButton7.setText("Fakülte Ekle");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 160, 130, -1));

        jButton8.setText("Sekreterlik Ekle");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 190, 130, -1));

        jButton9.setText("Bölüm Ekle");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 20, 140, -1));

        jButton10.setText("Duyurular Ekle");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 50, 140, -1));

        jButton11.setText("Staj Başvurusu EKle");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 100, 150, -1));

        jButton12.setText("Yeni Uygulama Kayıt");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 150, 150, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resimler/unitIcon.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, 30, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resimler/kisiIcon.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 40, 30));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resimler/companyIcon.png"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, 30, 30));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resimler/sekreterlikIcon.png"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 190, 40, 30));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resimler/fakülteIcon.png"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, 40, 30));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resimler/quotaIconNew.png"))); // NOI18N
        jLabel8.setText("Icon");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, 40, 30));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resimler/duyuruIcon.png"))); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 50, 40, 30));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resimler/bölümIcon.png"))); // NOI18N
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 20, 40, 30));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resimler/kayıtlıUygulamaIcon..png"))); // NOI18N
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 190, 40, 30));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resimler/yeniUygulamaIcon.png"))); // NOI18N
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 140, 40, 30));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resimler/stajBaşvurusuIcon.png"))); // NOI18N
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 90, 40, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resimler/761x365MainWallpaper.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, 340));

        jMenuBar1.setName(""); // NOI18N

        jMenu1.setText("Menu");

        jMenu2.setText("Stajyer");
        jMenu1.add(jMenu2);

        jMenu3.setText("Staj Sorumlusu");

        jMenu4.setText("Stajyer");
        jMenu3.add(jMenu4);

        jMenu1.add(jMenu3);

        jMenu5.setText("Şirket");

        jMenu6.setText("Stajyer");
        jMenu5.add(jMenu6);

        jMenu7.setText("Staj Sorumlusu");

        jMenu8.setText("Stajyer");
        jMenu7.add(jMenu8);

        jMenu5.add(jMenu7);

        jMenu1.add(jMenu5);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // Kayıtlı uygulama ekle butonu
        
        KayıtlıUygulamaEkle kue=new KayıtlıUygulamaEkle();
        kue.setVisible(true);
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // Kişi ekle butonu
        
        KisiEkle ke=new KisiEkle();
        ke.setVisible(true);
        
        
        
        
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       // Şirket Ekle butonu
        
        SirketEkle se=new SirketEkle();
        se.setVisible(true);
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
       //Birim ekle
        
        BirimEkle be=new BirimEkle();
        be.setVisible(true);
        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // Kota ekle butonu
        
        KotaEkle kotaE=new KotaEkle();
        kotaE.setVisible(true);
        
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
         // Fakülte ekle butonu
        
        FakülteEkle fe=new FakülteEkle();
        fe.setVisible(true);
        
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
       //Sekreterlik Ekle butonu
        
        SekreterlikEkle sekreterlikE=new SekreterlikEkle();
        sekreterlikE.setVisible(true);
        
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        //Bölüm ekle butonu
        
        BölümEkle BölümE=new BölümEkle();
        BölümE.setVisible(true);
        
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        //Duyurular ekle butonu
        
        DuyurularEkle de=new DuyurularEkle();
        de.setVisible(true);
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
       // Staj Başvurusu ekle butonu
        
        StajBaşvurusuEkle sbe=new StajBaşvurusuEkle();
        sbe.setVisible(true);
        
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        //Yeni uygulama ekle butonu
        
        YeniUygulamaEkle yue=new YeniUygulamaEkle();
        yue.setVisible(true);
        
        
        
    }//GEN-LAST:event_jButton12ActionPerformed

    public static void main(String args[]) {
           
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainScreen().setVisible(true);
            }
        });
       
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
