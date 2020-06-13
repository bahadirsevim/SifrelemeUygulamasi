
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class KayitOl extends javax.swing.JFrame {


    public KayitOl() {
        initComponents();
        setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblKayitOl = new javax.swing.JLabel();
        lblkullaniciadikayit = new javax.swing.JLabel();
        txtKullaniciAdi = new javax.swing.JTextField();
        lblSifreKayit = new javax.swing.JLabel();
        txtSifre = new javax.swing.JPasswordField();
        lblAdSoyad = new javax.swing.JLabel();
        txtAdSoyad = new javax.swing.JTextField();
        lblSifreTekrar = new javax.swing.JLabel();
        txtSifreTekrar = new javax.swing.JPasswordField();
        btnKayitOl = new javax.swing.JButton();
        btnGirisYap = new javax.swing.JButton();
        txtKayitUyari = new javax.swing.JLabel();
        lblUygulama = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Kayıt Ol");
        setBounds(new java.awt.Rectangle(500, 250, 0, 0));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        lblKayitOl.setFont(new java.awt.Font("Arial Black", 3, 18)); // NOI18N
        lblKayitOl.setText("Kayıt Ol! ");

        lblkullaniciadikayit.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblkullaniciadikayit.setText("Kullanıcı Adı : ");

        lblSifreKayit.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblSifreKayit.setText("Sifre : ");

        txtSifre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSifreActionPerformed(evt);
            }
        });

        lblAdSoyad.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblAdSoyad.setText("Ad Soyad : ");

        lblSifreTekrar.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblSifreTekrar.setText("Şifre (Tekrar) :");

        btnKayitOl.setText("Kayıt Ol");
        btnKayitOl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKayitOlActionPerformed(evt);
            }
        });

        btnGirisYap.setText("Giriş Yap");
        btnGirisYap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGirisYapActionPerformed(evt);
            }
        });

        lblUygulama.setText("Şifre Çözme ve Oluşturma Uygulaması");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblUygulama)
                    .addComponent(txtKayitUyari)
                    .addComponent(lblKayitOl)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblkullaniciadikayit)
                            .addComponent(lblAdSoyad)
                            .addComponent(lblSifreKayit)
                            .addComponent(lblSifreTekrar))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btnGirisYap, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnKayitOl, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtSifreTekrar)
                            .addComponent(txtSifre)
                            .addComponent(txtKullaniciAdi)
                            .addComponent(txtAdSoyad))))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(lblKayitOl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblUygulama)
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAdSoyad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAdSoyad))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtKullaniciAdi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblkullaniciadikayit))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSifreKayit)
                    .addComponent(txtSifre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSifreTekrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSifreTekrar))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnKayitOl)
                    .addComponent(btnGirisYap))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(txtKayitUyari)
                .addGap(34, 34, 34))
        );

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

    private void txtSifreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSifreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSifreActionPerformed

    private void btnGirisYapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGirisYapActionPerformed
        // giriş yap paneli açılır.
        GirisEkrani girisEkrani = new GirisEkrani();
        girisEkrani.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_btnGirisYapActionPerformed

    private void btnKayitOlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKayitOlActionPerformed
        // veritabanına bağlanarak insert sorgusunu çalıştırır.
        
        String adSoyad = txtAdSoyad.getText();
        String kullaniciAdi = txtKullaniciAdi.getText();
        String sifre = new String(txtSifre.getPassword());
        String sifreTekrar = new String(txtSifreTekrar.getPassword()); 

        if(sifre.equals(sifreTekrar)){
            Connection connection = null;
            DbHelper helper = new DbHelper(); 
            PreparedStatement statement = null; 
            try{
                connection = helper.getConnection();

                String sql ="insert into kullanici (ad_soyad, kullanici_adi, sifre) values (?, ?, ?)";
                statement = connection.prepareStatement(sql);

                statement.setString(1, adSoyad);
                statement.setString(2, kullaniciAdi);
                statement.setString(3, sifre);

                statement.executeUpdate(); // başlatmak için (etkilenen oge sayısı da döner)

                txtKayitUyari.setText("Kayıt Oluşturuldu! Giriş yapabilirsiniz.");
            }catch(SQLException e){
                helper.showErrorMessage(e);
            }finally{
                try {
                    statement.close();
                } catch (SQLException ex) {
                    helper.showErrorMessage(ex);
                }
                try {
                    connection.close();
                } catch (SQLException ex) {
                    helper.showErrorMessage(ex);
                }
            }
        }else{
            txtKayitUyari.setText("Şifreniz tekrarı ile örtüşmüyor. Lütfen Tekrar Deneyin!");
        }
    }//GEN-LAST:event_btnKayitOlActionPerformed

 
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
            java.util.logging.Logger.getLogger(KayitOl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KayitOl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KayitOl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KayitOl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KayitOl().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGirisYap;
    private javax.swing.JButton btnKayitOl;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblAdSoyad;
    private javax.swing.JLabel lblKayitOl;
    private javax.swing.JLabel lblSifreKayit;
    private javax.swing.JLabel lblSifreTekrar;
    private javax.swing.JLabel lblUygulama;
    private javax.swing.JLabel lblkullaniciadikayit;
    private javax.swing.JTextField txtAdSoyad;
    private javax.swing.JLabel txtKayitUyari;
    private javax.swing.JTextField txtKullaniciAdi;
    private javax.swing.JPasswordField txtSifre;
    private javax.swing.JPasswordField txtSifreTekrar;
    // End of variables declaration//GEN-END:variables
}
