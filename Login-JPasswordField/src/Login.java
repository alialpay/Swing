
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alial
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        giris = new javax.swing.JButton();
        kullanici_adi_alani = new javax.swing.JTextField();
        parola_alani = new javax.swing.JPasswordField();
        kullanici_adi_lable = new javax.swing.JLabel();
        parola_lable = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        giris.setText("Giriş Yap");
        giris.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                girisActionPerformed(evt);
            }
        });

        kullanici_adi_alani.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kullanici_adi_alaniActionPerformed(evt);
            }
        });

        parola_alani.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                parola_alaniActionPerformed(evt);
            }
        });

        kullanici_adi_lable.setText("Kullanıcı Adı:");

        parola_lable.setText("Parola :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addComponent(giris))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(kullanici_adi_lable)
                            .addComponent(parola_lable))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(kullanici_adi_alani)
                            .addComponent(parola_alani, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE))))
                .addContainerGap(85, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(89, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(kullanici_adi_alani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(kullanici_adi_lable))
                        .addGap(18, 18, 18)
                        .addComponent(parola_alani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(parola_lable, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(41, 41, 41)
                .addComponent(giris)
                .addGap(89, 89, 89))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void kullanici_adi_alaniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kullanici_adi_alaniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kullanici_adi_alaniActionPerformed

    private void girisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_girisActionPerformed

        String kullanici_adi = kullanici_adi_alani.getText();
        String parola = new String(parola_alani.getPassword());
        String message;
        
        if (kullanici_adi.equals("Ali Alpay")&&parola.equals("123")) {
            
            message = "Hoşgeldiniz, " + kullanici_adi;
        }
        else if (!kullanici_adi.equals("Ali Alpay")&&parola.equals("123")) {
            
            message = "Kullanıcı Adı Hatalı";
        }
        else if (kullanici_adi.equals("Ali Alpay")&&!parola.equals("123")) {
            
            message = "Parola Hatalı";
        }
        else{
            message = "Kullanıcı adı ve parola hatalı...";
        }
        if (message.equals("Hoşgeldiniz, " + kullanici_adi)) {
            //setVisible(false);
            JOptionPane.showMessageDialog(this, message);
            System.exit(0);
        } 
        else {
            JOptionPane.showMessageDialog(this, message);
        }
        
        
        kullanici_adi_alani.setText("");
        parola_alani.setText("");

        // TODO add your handling code here:
    }//GEN-LAST:event_girisActionPerformed

    private void parola_alaniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_parola_alaniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_parola_alaniActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton giris;
    private javax.swing.JTextField kullanici_adi_alani;
    private javax.swing.JLabel kullanici_adi_lable;
    private javax.swing.JPasswordField parola_alani;
    private javax.swing.JLabel parola_lable;
    // End of variables declaration//GEN-END:variables
}
