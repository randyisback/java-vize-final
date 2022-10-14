package odevproje;

import com.sun.source.tree.BreakTree;
import java.awt.Color;
import java.awt.Container;
import javax.swing.JOptionPane;
import javax.swing.plaf.synth.ColorType;

public class FirstForm extends javax.swing.JFrame {

    public FirstForm() {
        
        initComponents();
        
        this.getContentPane().setBackground(Color.pink); // FORMUMUZUN ARKA PLAN RENGİNİ KOD İLE AYARLADIK.
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblNumara = new javax.swing.JLabel();
        lblAdsoyad = new javax.swing.JLabel();
        lblVize = new javax.swing.JLabel();
        lblFinal = new javax.swing.JLabel();
        txtAdsoyad = new javax.swing.JTextField();
        btnGoster = new javax.swing.JButton();
        txtNumara = new javax.swing.JTextField();
        txtVize = new javax.swing.JTextField();
        txtFinal = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ÖDEV");
        setResizable(false);

        lblNumara.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblNumara.setText("Numara");

        lblAdsoyad.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblAdsoyad.setText("Ad Soyad");

        lblVize.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblVize.setText("Vize Notu");

        lblFinal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblFinal.setText("Final Notu");
        lblFinal.setToolTipText("");

        txtAdsoyad.setBackground(new java.awt.Color(204, 255, 255));

        btnGoster.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnGoster.setText("Sonuçları Göster");
        btnGoster.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGosterActionPerformed(evt);
            }
        });

        txtNumara.setBackground(new java.awt.Color(204, 255, 255));

        txtVize.setBackground(new java.awt.Color(204, 255, 255));

        txtFinal.setBackground(new java.awt.Color(204, 255, 255));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblAdsoyad)
                        .addGap(18, 18, 18)
                        .addComponent(txtAdsoyad, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblVize)
                        .addGap(18, 18, 18)
                        .addComponent(txtVize, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblFinal)
                    .addComponent(lblNumara))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNumara, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(145, Short.MAX_VALUE)
                .addComponent(btnGoster, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(146, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAdsoyad)
                    .addComponent(txtAdsoyad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNumara)
                    .addComponent(txtNumara, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblVize)
                    .addComponent(txtVize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFinal)
                    .addComponent(txtFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(btnGoster, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    /*DEĞİŞKENLER*/
    String adsoyad;  // Ad soyad değişkenimizi oluşturduk.
    String durumnot= " "; // Not durumu Geçti,Kaldı yazabilmek için durum  değişkenimizi oluşturduk.
    int numara, vizenot,finalnot; // tamsayı değer olarak öğrenci no,vize,final notu için  değişkenlerimizi oluşturduk.
    int ortalama; // ortalama  değişkenimizi oluşturduk.
    float yuzdedort=(float) 0.4; // işlemde hata çıkmaması için float olarak ortalama bulma değerlerimizi değişkene atayıp oluşturduk.
    float yuzdealti =(float) 0.6; // işlemde hata çıkmaması için float olarak ortalama bulma değerlerimizi değişkene atayıp oluşturduk.
    
    private void btnGosterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGosterActionPerformed
   
        adsoyad = txtAdsoyad.getText(); // txtAdsoyad ismine sahip olan Text Field verisini adsoyad değişkenine atadık.
        numara = Integer.parseInt(txtNumara.getText()); // txtNumara ismine sahip olan Text Field verisini numara değişkenine atadık.
        vizenot = Integer.parseInt(txtVize.getText()); // txtVize ismine sahip olan Text Field verisini vizenot değişkenine atadık.
        finalnot = Integer.parseInt(txtFinal.getText()); // txtFinal ismine sahip olan Text Field verisini finalnot değişkenine atadık.
        ortalama = (int) (vizenot*yuzdedort + finalnot*yuzdealti); // Girilen iki sınav notunun ortalamasını hesaplayıp, ortalama değişkenimize atadık.
      
        if(ortalama>50&&ortalama<=100&&finalnot>=50) // if yapısı ile geçme koşullarımızı oluşturduk.
        {
        durumnot = "GEÇTİ";
        
        JOptionPane.showMessageDialog(null, "Adı Soyadı: " + adsoyad + "\nNumaranız: "+ numara + "\nVize Notunuz: " + vizenot + "\nFinal Notunuz: " + finalnot + "\nOrtalama: "+ ortalama + "\nDurum: " + durumnot , "deneme",3);
        
        
        }
        else if(ortalama>100||vizenot>100||finalnot>100){ //Girilen değerler veya ortalama 100 üzeri olursa Hata mesajı gelmesi için else if yapımız ile koşul oluşturduk.
        JOptionPane.showMessageDialog(null,"HATA! Lütfen doğru değer giriniz.");
        }
        else{ // else yapısı ile kalma koşullarımızı oluşturduk.
        durumnot = "KALDI";
        
        JOptionPane.showMessageDialog(null, "Adı Soyadı: " + adsoyad + "\nNumaranız: "+ numara + "\nVize Notunuz: " + vizenot + "\nFinal Notunuz: " + finalnot + "\nOrtalama: "+ ortalama + "\nDurum: " + durumnot , "deneme",3);
        
        
        }
        
       // Buton kodları buraya kadar. 
        
    }//GEN-LAST:event_btnGosterActionPerformed
 
    
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
            java.util.logging.Logger.getLogger(FirstForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FirstForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FirstForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FirstForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FirstForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGoster;
    private javax.swing.JLabel lblAdsoyad;
    private javax.swing.JLabel lblFinal;
    private javax.swing.JLabel lblNumara;
    private javax.swing.JLabel lblVize;
    private javax.swing.JTextField txtAdsoyad;
    private javax.swing.JTextField txtFinal;
    private javax.swing.JTextField txtNumara;
    private javax.swing.JTextField txtVize;
    // End of variables declaration//GEN-END:variables
}
