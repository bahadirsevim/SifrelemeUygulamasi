
import java.awt.Desktop;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author CASPER
 */
public class DogrusalSifreleme extends javax.swing.JFrame {

    /**
     * Creates new form DogrusalSifreleme
     */
    public DogrusalSifreleme() {
        initComponents();
        setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblHesgeldiniz = new javax.swing.JLabel();
        lblBirincilAnahtar = new javax.swing.JLabel();
        txtBirincilAnahtar = new javax.swing.JTextField();
        lblIkincilAnahtar = new javax.swing.JLabel();
        txtIkincilAnahtar = new javax.swing.JTextField();
        lblMesaj1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtMesaj = new javax.swing.JTextArea();
        btnCevir = new javax.swing.JButton();
        btnGeri = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtSifreliMesaj = new javax.swing.JTextArea();
        lblMesaj = new javax.swing.JLabel();
        lblUyari = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnDosya = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        mnYardim = new javax.swing.JMenu();
        mnBilgiAl = new javax.swing.JMenuItem();
        mnCikis = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Doğrusal Şifreleme ");
        setBounds(new java.awt.Rectangle(500, 250, 0, 0));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        lblHesgeldiniz.setFont(new java.awt.Font("Arial Black", 3, 18)); // NOI18N
        lblHesgeldiniz.setText("Doğrusal Şifrelem Yöntemi İle Şifrele! ");

        lblBirincilAnahtar.setText("Birincil Anahtar : ");

        txtBirincilAnahtar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBirincilAnahtarActionPerformed(evt);
            }
        });

        lblIkincilAnahtar.setText("İkincil Anahtar : ");

        txtIkincilAnahtar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIkincilAnahtarActionPerformed(evt);
            }
        });

        lblMesaj1.setText("Şifrelenecek Mesaj : ");

        txtMesaj.setColumns(20);
        txtMesaj.setRows(5);
        jScrollPane1.setViewportView(txtMesaj);

        btnCevir.setText("Çevir");
        btnCevir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCevirActionPerformed(evt);
            }
        });

        btnGeri.setText("< Geri");
        btnGeri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGeriActionPerformed(evt);
            }
        });

        txtSifreliMesaj.setColumns(20);
        txtSifreliMesaj.setRows(5);
        jScrollPane2.setViewportView(txtSifreliMesaj);

        lblMesaj.setText("Şifreleniş Mesaj :");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblMesaj1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblBirincilAnahtar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBirincilAnahtar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(lblIkincilAnahtar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtIkincilAnahtar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblHesgeldiniz)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 602, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(lblUyari, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(lblMesaj)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnGeri)
                            .addGap(18, 18, 18)
                            .addComponent(btnCevir, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(lblHesgeldiniz)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBirincilAnahtar)
                    .addComponent(txtBirincilAnahtar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIkincilAnahtar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblIkincilAnahtar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMesaj1)
                    .addComponent(lblUyari))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnCevir, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnGeri, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lblMesaj)
                        .addGap(9, 9, 9)))
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        mnDosya.setText("Dosya");

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem3.setText("Çevirilen Metni Kaydet");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        mnDosya.add(jMenuItem3);

        jMenuBar1.add(mnDosya);

        mnYardim.setText("Yardım");

        mnBilgiAl.setText("Bilgi Al");
        mnBilgiAl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnBilgiAlActionPerformed(evt);
            }
        });
        mnYardim.add(mnBilgiAl);

        mnCikis.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_MASK));
        mnCikis.setText("Çıkış");
        mnCikis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnCikisActionPerformed(evt);
            }
        });
        mnYardim.add(mnCikis);

        jMenuBar1.add(mnYardim);

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

    private void txtBirincilAnahtarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBirincilAnahtarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBirincilAnahtarActionPerformed

    private void txtIkincilAnahtarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIkincilAnahtarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIkincilAnahtarActionPerformed

    private void btnCevirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCevirActionPerformed
        int birincilAnahtar = Integer.valueOf(txtBirincilAnahtar.getText());
        int ikincilAnahtar = Integer.valueOf(txtIkincilAnahtar.getText());
        String mesaj = txtMesaj.getText();
        
        txtSifreliMesaj.setText(sifrele(mesaj, birincilAnahtar, ikincilAnahtar));
    }//GEN-LAST:event_btnCevirActionPerformed

    private void btnGeriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGeriActionPerformed
        Merhaba merhaba = new Merhaba();
        merhaba.setVisible(true);
        setVisible(false);

    }//GEN-LAST:event_btnGeriActionPerformed

    private void mnBilgiAlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnBilgiAlActionPerformed
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
    }//GEN-LAST:event_mnBilgiAlActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        FileWriter writer = null;
                    try {
                        writer = new FileWriter("sifreliMesaj.txt", true);
                        writer.write(txtSifreliMesaj.getText());
                        
                    } catch (IOException ex) {
                        System.out.println("Dosyaya kaydedilirken bir hata oluştu.");
                    } finally {
                        if (writer != null) {
                            try {
                                writer.close();
                            } catch (IOException ex) {
                                System.out.println("Dosya Kapatılırken bir hata oluştu.");
                            }
                        }
                    }
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    public String sifrele(String metin, int birincilAnahtar, int ikincilAnahtar) {
        String alfabe = "abcçdefgğhıijklmnoöprsştuüvyz";
        metin = metin.toLowerCase();
        String sifreliMesaj = "";

        for (int i = 0; i < metin.length(); i++) {
                for (int j = 0; j < 29; j++) {
                    if (metin.charAt(i) == alfabe.charAt(j)) {
                        int indis = j * birincilAnahtar + ikincilAnahtar;
                        if (i == metin.length() - 1) {
                            sifreliMesaj += String.valueOf(indis);
                        } else {
                            sifreliMesaj += String.valueOf(indis) + "-";
                        }
                    }
                }
        }
        return sifreliMesaj;
    }
    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(DogrusalSifreleme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DogrusalSifreleme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DogrusalSifreleme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DogrusalSifreleme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DogrusalSifreleme().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCevir;
    private javax.swing.JButton btnGeri;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblBirincilAnahtar;
    private javax.swing.JLabel lblHesgeldiniz;
    private javax.swing.JLabel lblIkincilAnahtar;
    private javax.swing.JLabel lblMesaj;
    private javax.swing.JLabel lblMesaj1;
    private javax.swing.JLabel lblUyari;
    private javax.swing.JMenuItem mnBilgiAl;
    private javax.swing.JMenuItem mnCikis;
    private javax.swing.JMenu mnDosya;
    private javax.swing.JMenu mnYardim;
    private javax.swing.JTextField txtBirincilAnahtar;
    private javax.swing.JTextField txtIkincilAnahtar;
    private javax.swing.JTextArea txtMesaj;
    private javax.swing.JTextArea txtSifreliMesaj;
    // End of variables declaration//GEN-END:variables
}
