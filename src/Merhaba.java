
import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Merhaba extends javax.swing.JFrame {

    public Merhaba() {
        initComponents();
        setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblMerhaba = new javax.swing.JLabel();
        lblUygulama = new javax.swing.JLabel();
        cmbYontemler = new javax.swing.JComboBox<>();
        btnMesajUret = new javax.swing.JButton();
        btnMesajCoz = new javax.swing.JButton();
        lblTanitim = new javax.swing.JLabel();
        lblUyari = new javax.swing.JLabel();
        lbl2020 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnBilgi = new javax.swing.JMenu();
        mnYardim = new javax.swing.JMenuItem();
        mnİletisim = new javax.swing.JMenuItem();
        mnCikis = new javax.swing.JMenuItem();
        mnAyarlar = new javax.swing.JMenu();
        mnGuncelle = new javax.swing.JMenuItem();
        mnSil = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Merhaba!");
        setBounds(new java.awt.Rectangle(500, 250, 0, 0));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        lblMerhaba.setFont(new java.awt.Font("Arial Black", 3, 18)); // NOI18N
        lblMerhaba.setText("Merhaba! ");

        lblUygulama.setText("Şifreleme yöntemini seçin.");

        cmbYontemler.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seçiniz", "Zıt Şifreleme", "Sezar Şifreleme", "Doğrusal Şifreleme", "Yerine Koyma Şifreleme" }));
        cmbYontemler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbYontemlerActionPerformed(evt);
            }
        });

        btnMesajUret.setText("Mesaj Üret");
        btnMesajUret.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMesajUretActionPerformed(evt);
            }
        });

        btnMesajCoz.setText("Mesaj Çöz");
        btnMesajCoz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMesajCozActionPerformed(evt);
            }
        });

        lblTanitim.setForeground(new java.awt.Color(153, 153, 153));
        lblTanitim.setText("Bahadır SEVİM - Fırat Üni. Yazılım Müh.");

        lblUyari.setForeground(new java.awt.Color(255, 0, 0));

        lbl2020.setForeground(new java.awt.Color(153, 153, 153));
        lbl2020.setText("@2020");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnMesajCoz)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnMesajUret))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lblUygulama)
                        .addComponent(lblMerhaba)
                        .addComponent(cmbYontemler, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblUyari, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(lblTanitim)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                            .addComponent(lbl2020))))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(lblMerhaba)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblUygulama)
                .addGap(18, 18, 18)
                .addComponent(cmbYontemler, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMesajUret)
                    .addComponent(btnMesajCoz))
                .addGap(18, 18, 18)
                .addComponent(lblUyari)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTanitim)
                    .addComponent(lbl2020))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        mnBilgi.setText("Bilgi");

        mnYardim.setText("Yardım");
        mnBilgi.add(mnYardim);

        mnİletisim.setText("İlettişim");
        mnİletisim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnİletisimActionPerformed(evt);
            }
        });
        mnBilgi.add(mnİletisim);

        mnCikis.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_MASK));
        mnCikis.setText("Çıkış");
        mnCikis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnCikisActionPerformed(evt);
            }
        });
        mnBilgi.add(mnCikis);

        jMenuBar1.add(mnBilgi);

        mnAyarlar.setText("Ayarlar");

        mnGuncelle.setText("Hesabımı Güncelle");
        mnGuncelle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnGuncelleActionPerformed(evt);
            }
        });
        mnAyarlar.add(mnGuncelle);

        mnSil.setText("Hesabımı Sil");
        mnSil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnSilActionPerformed(evt);
            }
        });
        mnAyarlar.add(mnSil);

        jMenuBar1.add(mnAyarlar);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnİletisimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnİletisimActionPerformed
        // Programın çalışır bir videosu browser ile açılır.
        
        String webSite = "https://youtu.be/m5Bf2_439wE";
            Desktop desktop = Desktop.getDesktop();
            
            try {
                desktop.browse(new URI(webSite));
            } catch (IOException ex) {
                lblUyari.setText("URL açılırken bir hata oluştu.");
            } catch (URISyntaxException ex) {
                lblUyari.setText("URL Bulunamadı.");
            }
        
    }//GEN-LAST:event_mnİletisimActionPerformed

    private void mnCikisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnCikisActionPerformed
        // programdan çıkılmak istendiğinden "emin misiniz?" diye sorar.
        
        Object[] SaveOption = {"Evet", "Hayır"};

        int noSave = JOptionPane.showOptionDialog(null, "Çıkmak İstediğinize emin misiniz?", "Uyarı!", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE, null, SaveOption, null);

        if (noSave == JOptionPane.YES_OPTION) {
            System.exit(0);
        } else if (noSave == JOptionPane.NO_OPTION) {
        }
        
    }//GEN-LAST:event_mnCikisActionPerformed

    private void cmbYontemlerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbYontemlerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbYontemlerActionPerformed

    private void mnSilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnSilActionPerformed
        GirisEkrani giris = new GirisEkrani();
        String adTeyit = giris.ad;
        String sifreTeyit = giris.sifre;
        
        Object[] SaveOption = {"Evet", "Hayır"};
        int noSave = JOptionPane.showOptionDialog(null, "Hesabınızı silmek istediğinize emin misiniz?", "Uyarı!", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE, null, SaveOption, null);

        if (noSave == JOptionPane.YES_OPTION) {
            Connection connection = null;
            DbHelper helper = new DbHelper(); 
            PreparedStatement statement = null; 
            try{
                connection = helper.getConnection();

                String sql ="delete from kullanici where kullanici_adi = ? and sifre = ?";
                statement = connection.prepareStatement(sql);

                statement.setString(1, adTeyit);
                statement.setString(2, sifreTeyit);

                statement.executeUpdate(); // başlatmak için (etkilenen oge sayısı da döner)

                String msj = "Kaydınız Silinmiştir.";
                JOptionPane.showMessageDialog(null, msj, "Sonuç" , JOptionPane.INFORMATION_MESSAGE);
                System.exit(0);
            }catch(SQLException e){
                helper.showErrorMessage(e);
            }finally{
                try {
                    statement.close();
                    connection.close();
                } catch (SQLException ex) {
                    helper.showErrorMessage(ex);
                }
            }
        } else if (noSave == JOptionPane.NO_OPTION) {
        }
                
    }//GEN-LAST:event_mnSilActionPerformed

    private void mnGuncelleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnGuncelleActionPerformed
        Guncelle guncelle = new Guncelle();
        guncelle.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_mnGuncelleActionPerformed

    private void btnMesajUretActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMesajUretActionPerformed
        int seciliIndis = cmbYontemler.getSelectedIndex();
        
        if(seciliIndis==0){
            // Hicbir sey yapmayacak
        }
        else if(seciliIndis==1){
            zitSifreleme zit = new zitSifreleme();
            zit.setVisible(true);
            setVisible(false);
        }
        else if(seciliIndis==2){
            SezarSifreleme sezar = new SezarSifreleme();
            sezar.setVisible(true);
            setVisible(false);
        }
        else if(seciliIndis==3){
            DogrusalSifreleme dogrusal = new DogrusalSifreleme();
            dogrusal.setVisible(true);
            setVisible(false);
        }
        else if(seciliIndis==4){
            YerineKoymaSifrele yerineKoyma = new YerineKoymaSifrele();
            yerineKoyma.setVisible(true);
            setVisible(false);
        }
        else{
            System.out.println("Bir hata Oluştu...");
        }
    }//GEN-LAST:event_btnMesajUretActionPerformed

    private void btnMesajCozActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMesajCozActionPerformed
        int seciliIndis = cmbYontemler.getSelectedIndex();
        
        if(seciliIndis==0){
            // Hicbir sey yapmayacak
        }
        else if(seciliIndis==1){
            zitSifrelemeCoz zitCoz = new zitSifrelemeCoz();
            zitCoz.setVisible(true);
            setVisible(false);
        }
        else if(seciliIndis==2){
            SezarSifrelemeCoz sezarCoz = new SezarSifrelemeCoz();
            sezarCoz.setVisible(true);
            setVisible(false);
        }
        else if(seciliIndis==3){
            DogrusalSifrelemeCoz dogrusalCoz = new DogrusalSifrelemeCoz();
            dogrusalCoz.setVisible(true);
            setVisible(false);
        }
        else if(seciliIndis==4){
            YerineKoymaSifreCoz yerineKoymaCoz = new YerineKoymaSifreCoz();
            yerineKoymaCoz.setVisible(true);
            setVisible(false);
        }
        else{
            System.out.println("Bir hata Oluştu...");
        }
    }//GEN-LAST:event_btnMesajCozActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Merhaba.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Merhaba.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Merhaba.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Merhaba.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Merhaba().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMesajCoz;
    private javax.swing.JButton btnMesajUret;
    private javax.swing.JComboBox<String> cmbYontemler;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl2020;
    private javax.swing.JLabel lblMerhaba;
    private javax.swing.JLabel lblTanitim;
    private javax.swing.JLabel lblUyari;
    private javax.swing.JLabel lblUygulama;
    private javax.swing.JMenu mnAyarlar;
    private javax.swing.JMenu mnBilgi;
    private javax.swing.JMenuItem mnCikis;
    private javax.swing.JMenuItem mnGuncelle;
    private javax.swing.JMenuItem mnSil;
    private javax.swing.JMenuItem mnYardim;
    private javax.swing.JMenuItem mnİletisim;
    // End of variables declaration//GEN-END:variables
}
