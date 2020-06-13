
import java.awt.Desktop;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import javax.swing.JOptionPane;

public class GirisEkrani extends javax.swing.JFrame {
    
    static String ad;
    static String sifre;

    public GirisEkrani() {
        initComponents();
        setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblUygulama = new javax.swing.JLabel();
        lblHesgeldiniz = new javax.swing.JLabel();
        lblKullaniciAdi = new javax.swing.JLabel();
        txtKullaniciAdi = new javax.swing.JTextField();
        lblSifre = new javax.swing.JLabel();
        txtSifre = new javax.swing.JPasswordField();
        btnGiris = new javax.swing.JButton();
        btnKayit = new javax.swing.JButton();
        lblUyari = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnBilgi = new javax.swing.JMenu();
        mnYardim = new javax.swing.JMenuItem();
        mnİletisim = new javax.swing.JMenuItem();
        mnCikis = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Giriş Ekranı - Hoşgeldiniz!");
        setBounds(new java.awt.Rectangle(500, 250, 0, 0));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        lblUygulama.setText("Şifre Çözme ve Oluşturma Uygulaması");

        lblHesgeldiniz.setFont(new java.awt.Font("Arial Black", 3, 18)); // NOI18N
        lblHesgeldiniz.setText("Hoşgeldiniz! ");

        lblKullaniciAdi.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblKullaniciAdi.setText("Kullanıcı Adı : ");

        lblSifre.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblSifre.setText("Şifre : ");

        btnGiris.setText("Giriş Yap");
        btnGiris.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGirisActionPerformed(evt);
            }
        });

        btnKayit.setText("Kayıt Ol");
        btnKayit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKayitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(226, Short.MAX_VALUE)
                .addComponent(btnKayit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnGiris, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblHesgeldiniz)
                    .addComponent(lblUygulama)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(lblUyari, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblKullaniciAdi)
                                .addComponent(lblSifre))
                            .addGap(31, 31, 31)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txtKullaniciAdi, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtSifre, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(67, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(lblHesgeldiniz)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblUygulama)
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtKullaniciAdi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblKullaniciAdi))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSifre)
                    .addComponent(txtSifre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGiris)
                    .addComponent(btnKayit))
                .addGap(26, 26, 26)
                .addComponent(lblUyari, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        mnBilgi.setText("Bilgi");

        mnYardim.setText("Yardım");
        mnYardim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnYardimActionPerformed(evt);
            }
        });
        mnBilgi.add(mnYardim);

        mnİletisim.setText("İletişim");
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

    private void mnCikisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnCikisActionPerformed
        // programdan çıkılmak istendiğinden "emin misiniz?" diye sorar.
        
        Object[] SaveOption = {"Evet", "Hayır"};

        int noSave = JOptionPane.showOptionDialog(null, "Çıkmak İstediğinize emin misiniz?", "Uyarı!", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE, null, SaveOption, null);

        if (noSave == JOptionPane.YES_OPTION) {
            System.exit(0);
        } else if (noSave == JOptionPane.NO_OPTION) {
        }
    }//GEN-LAST:event_mnCikisActionPerformed

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

    private void btnKayitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKayitActionPerformed
        KayitOl kayitOl = new KayitOl();
        kayitOl.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_btnKayitActionPerformed

    private void mnYardimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnYardimActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mnYardimActionPerformed

    private void btnGirisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGirisActionPerformed
        ad = txtKullaniciAdi.getText();
        sifre = new String(txtSifre.getPassword());

        Connection connection = null;
        DbHelper helper = new DbHelper();
        Statement statement;
        ResultSet resultSet;
        try {
            connection = helper.getConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery("SELECT count(id) as giris FROM kullanici WHERE kullanici_adi='" + ad + "' AND sifre='" + sifre + "'");

            while (resultSet.next()) {
                if (resultSet.getInt("giris") == 1) {
                    Merhaba merhaba = new Merhaba();
                    merhaba.setVisible(true);
                    setVisible(false);
                    
                    FileWriter writer = null;
                    try {
                        Date simdikiZaman = new Date();
                        
                        writer = new FileWriter("girisKayitlari.txt", true);
                        writer.write(simdikiZaman.toString());
                        writer.write(" - "+ad+" sisteme giriş yaptı. \n");
                        
                    } catch (IOException ex) {
                        System.out.println("Dosyaya loglanırken bir hata oluştu.");
                    } finally {
                        if (writer != null) {
                            try {
                                writer.close();
                            } catch (IOException ex) {
                                System.out.println("Dosya Kapatılırken bir hata oluştu.");
                            }
                        }
                    }
                }else{
                    lblUyari.setText("Giriş yapılamadı. Tekrar deneyin veya kayıt olun.");
                }
            }
        } catch (SQLException e) {
            helper.showErrorMessage(e);
        } finally {
            try {
                connection.close();
            } catch (SQLException ex) {
                helper.showErrorMessage(ex);
            }
        }
        
    }//GEN-LAST:event_btnGirisActionPerformed


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
            java.util.logging.Logger.getLogger(GirisEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GirisEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GirisEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GirisEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GirisEkrani().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGiris;
    private javax.swing.JButton btnKayit;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblHesgeldiniz;
    private javax.swing.JLabel lblKullaniciAdi;
    private javax.swing.JLabel lblSifre;
    private javax.swing.JLabel lblUyari;
    private javax.swing.JLabel lblUygulama;
    private javax.swing.JMenu mnBilgi;
    private javax.swing.JMenuItem mnCikis;
    private javax.swing.JMenuItem mnYardim;
    private javax.swing.JMenuItem mnİletisim;
    private javax.swing.JTextField txtKullaniciAdi;
    private javax.swing.JPasswordField txtSifre;
    // End of variables declaration//GEN-END:variables
}
