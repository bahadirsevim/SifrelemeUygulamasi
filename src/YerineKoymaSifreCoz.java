
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
public class YerineKoymaSifreCoz extends javax.swing.JFrame {

    /**
     * Creates new form YerineKoymaSifreCoz
     */
    public YerineKoymaSifreCoz() {
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
        lblBilgi = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtMesaj = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtSifreliMesaj = new javax.swing.JTextArea();
        lblSifrelenmisMesaj = new javax.swing.JLabel();
        btnCevir = new javax.swing.JButton();
        btnGeri = new javax.swing.JButton();
        lblSifrelenecek = new javax.swing.JLabel();
        lblUyari = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnDosya = new javax.swing.JMenu();
        mnKaydet = new javax.swing.JMenuItem();
        mnYardim = new javax.swing.JMenu();
        mnBilgiAl = new javax.swing.JMenuItem();
        mnCikis = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Yerine Koyma Metodu ile Şifre Çöz");
        setBounds(new java.awt.Rectangle(500, 250, 0, 0));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        lblHesgeldiniz.setFont(new java.awt.Font("Arial Black", 3, 18)); // NOI18N
        lblHesgeldiniz.setText("Yerine Koyma Şifrelem Yöntemi İle Şifre Çöz! ");

        lblBilgi.setText("Restgele alfabe dizilimlerine göre şifrelenmiş mesajları üretin.");

        txtMesaj.setColumns(20);
        txtMesaj.setRows(5);
        jScrollPane1.setViewportView(txtMesaj);

        txtSifreliMesaj.setColumns(20);
        txtSifreliMesaj.setRows(5);
        jScrollPane2.setViewportView(txtSifreliMesaj);

        lblSifrelenmisMesaj.setText("Sifrelenmiş Mesaj : ");

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

        lblSifrelenecek.setText("Çözülen Mesaj :");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblSifrelenecek)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 555, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(btnGeri)
                            .addGap(18, 18, 18)
                            .addComponent(btnCevir, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblSifrelenmisMesaj)
                                .addGap(58, 58, 58)
                                .addComponent(lblUyari, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 555, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblBilgi)
                            .addComponent(lblHesgeldiniz))))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(lblHesgeldiniz)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblBilgi)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSifrelenmisMesaj)
                    .addComponent(lblUyari))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnGeri)
                            .addComponent(btnCevir)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblSifrelenecek)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        mnDosya.setText("Dosya");

        mnKaydet.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        mnKaydet.setText("Çevrilen Metni Kaydet");
        mnKaydet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnKaydetActionPerformed(evt);
            }
        });
        mnDosya.add(mnKaydet);

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

    private void btnCevirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCevirActionPerformed
        String mesaj = txtMesaj.getText();
        txtSifreliMesaj.setText(sifreCoz(mesaj));
    }//GEN-LAST:event_btnCevirActionPerformed

    private void btnGeriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGeriActionPerformed
        Merhaba merhaba = new Merhaba();
        merhaba.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_btnGeriActionPerformed

    private void mnCikisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnCikisActionPerformed
        // programdan çıkılmak istendiğinden "emin misiniz?" diye sorar.
        
        Object[] SaveOption = {"Evet", "Hayır"};

        int noSave = JOptionPane.showOptionDialog(null, "Çıkmak İstediğinize emin misiniz?", "Uyarı!", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE, null, SaveOption, null);

        if (noSave == JOptionPane.YES_OPTION) {
            System.exit(0);
        } else if (noSave == JOptionPane.NO_OPTION) {
        }
    }//GEN-LAST:event_mnCikisActionPerformed

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

    private void mnKaydetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnKaydetActionPerformed
        FileWriter writer = null;
                    try {
                        writer = new FileWriter("sifreliMesaj.txt", true);
                        writer.write(txtSifreliMesaj.getText());
                        
                    } catch (IOException ex) {
                        lblUyari.setText("Dosyaya kaydedilirken bir hata oluştu.");
                    } finally {
                        if (writer != null) {
                            try {
                                writer.close();
                            } catch (IOException ex) {
                                lblUyari.setText("Dosya Kapatılırken bir hata oluştu.");
                            }
                        }
                    }
    }//GEN-LAST:event_mnKaydetActionPerformed

    
    public static String sifreCoz(String metin) {
        String alfabe = "abcçdefgğhıijklmnoöprsştuüvyz";
        String tersAlfabe = "lkjiıhğgfedçcbazyvüutşsrpöonm";
        metin = metin.toLowerCase();
        String sifreliMesaj = "";
        char bosluk = ' ';

        for (int i = 0; i < metin.length(); i++) {
            if (metin.charAt(i) == bosluk) {
                sifreliMesaj += bosluk;
            } else if (metin.charAt(i) == '.') {
                sifreliMesaj += '.';
            } else {
                for (int j = 0; j < 29; j++) {
                    if (metin.charAt(i) == tersAlfabe.charAt(j)) {
                        sifreliMesaj += alfabe.charAt(j);
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
            java.util.logging.Logger.getLogger(YerineKoymaSifreCoz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(YerineKoymaSifreCoz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(YerineKoymaSifreCoz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(YerineKoymaSifreCoz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new YerineKoymaSifreCoz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCevir;
    private javax.swing.JButton btnGeri;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblBilgi;
    private javax.swing.JLabel lblHesgeldiniz;
    private javax.swing.JLabel lblSifrelenecek;
    private javax.swing.JLabel lblSifrelenmisMesaj;
    private javax.swing.JLabel lblUyari;
    private javax.swing.JMenuItem mnBilgiAl;
    private javax.swing.JMenuItem mnCikis;
    private javax.swing.JMenu mnDosya;
    private javax.swing.JMenuItem mnKaydet;
    private javax.swing.JMenu mnYardim;
    private javax.swing.JTextArea txtMesaj;
    private javax.swing.JTextArea txtSifreliMesaj;
    // End of variables declaration//GEN-END:variables
}
