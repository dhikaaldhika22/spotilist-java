/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterfaceJFRAME;
import Playlist.Akun;
import Data.DataAkun;
import UserInterfaceJFRAME.Menu;
import UserInterfaceJFRAME.SignUp;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.logging.Level;
import javax.swing.JOptionPane;
/**
 *
 * @author ASUS
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

        jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        usernameIcon = new javax.swing.JLabel();
        passwordIcon = new javax.swing.JLabel();
        usernameTXT = new javax.swing.JTextField();
        passwordTXT = new javax.swing.JPasswordField();
        jLabel9 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        SignupButton = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        logInbutton = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        bg = new javax.swing.JLabel();

        jLabel6.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(1209, 679));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1209, 679));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Geometr415 Blk BT", 0, 70)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("SELAMAT DATANG");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, -1, -1));

        jLabel7.setBackground(new java.awt.Color(0, 153, 153));
        jLabel7.setFont(new java.awt.Font("Geometr415 Blk BT", 0, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(103, 76, 255));
        jLabel7.setText("DI");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 90, -1, -1));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 240, -1, -1));

        usernameIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/icons8-username-50.png"))); // NOI18N
        jPanel1.add(usernameIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 280, 50, 40));

        passwordIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/icons8-sign-in-form-password-50.png"))); // NOI18N
        jPanel1.add(passwordIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 330, -1, -1));

        usernameTXT.setBackground(new java.awt.Color(47, 47, 47));
        usernameTXT.setForeground(new java.awt.Color(255, 255, 255));
        usernameTXT.setText(" Username");
        usernameTXT.setBorder(null);
        usernameTXT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameTXTActionPerformed(evt);
            }
        });
        jPanel1.add(usernameTXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 280, 250, 30));

        passwordTXT.setBackground(new java.awt.Color(47, 47, 47));
        passwordTXT.setForeground(new java.awt.Color(255, 255, 255));
        passwordTXT.setText("Password");
        passwordTXT.setBorder(null);
        passwordTXT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordTXTActionPerformed(evt);
            }
        });
        jPanel1.add(passwordTXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 340, 250, 30));

        jLabel9.setBackground(new java.awt.Color(0, 153, 153));
        jLabel9.setFont(new java.awt.Font("Geometr415 Blk BT", 0, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 102, 102));
        jLabel9.setText("SPOTILIST");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 90, -1, -1));

        jLabel5.setForeground(new java.awt.Color(153, 153, 153));
        jLabel5.setText("Created by Kelompok 3");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 620, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/kecil.png"))); // NOI18N
        jLabel8.setText("k");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(-640, 140, 1290, 290));

        SignupButton.setBackground(new java.awt.Color(204, 0, 204));
        SignupButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SignupButtonMouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Geometr415 Blk BT", 0, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("SIGN UP");

        javax.swing.GroupLayout SignupButtonLayout = new javax.swing.GroupLayout(SignupButton);
        SignupButton.setLayout(SignupButtonLayout);
        SignupButtonLayout.setHorizontalGroup(
            SignupButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SignupButtonLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel4)
                .addContainerGap(23, Short.MAX_VALUE))
        );
        SignupButtonLayout.setVerticalGroup(
            SignupButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SignupButtonLayout.createSequentialGroup()
                .addGap(0, 2, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(SignupButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 400, 100, 30));

        logInbutton.setBackground(new java.awt.Color(0, 153, 153));
        logInbutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logInbuttonMouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Geometr415 Blk BT", 0, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("LOG IN");

        javax.swing.GroupLayout logInbuttonLayout = new javax.swing.GroupLayout(logInbutton);
        logInbutton.setLayout(logInbuttonLayout);
        logInbuttonLayout.setHorizontalGroup(
            logInbuttonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, logInbuttonLayout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(26, 26, 26))
        );
        logInbuttonLayout.setVerticalGroup(
            logInbuttonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, logInbuttonLayout.createSequentialGroup()
                .addGap(0, 2, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(logInbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 400, 100, 30));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/icons8-fire-exit-64.png"))); // NOI18N
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel10MouseEntered(evt);
            }
        });
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 590, -1, -1));

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Quit");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 650, -1, -1));

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/wallpaperflare.com_wallpaper.jpg"))); // NOI18N
        bg.setText("jLabel1");
        jPanel1.add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(-660, -210, 1870, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1209, 680));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void usernameTXTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameTXTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameTXTActionPerformed

    private void passwordTXTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordTXTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordTXTActionPerformed

    private void logInbuttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logInbuttonMouseClicked
        // TODO add your handling code here:
//        String username = "akuanakub";
//        String pw = "akulupa123";
//        if(username.equalsIgnoreCase(usernameTXT.getText()) && pw.equalsIgnoreCase(passwordTXT.getText())){
//            Menu menu = new Menu();
//            menu.setVisible(true);
//            dispose();
//        }else{
//            javax.swing.JOptionPane.showMessageDialog(null, "Maaf, username atau password yang anda masukkan salah");
//            usernameTXT.setText("");
//            passwordTXT.setText("");
//            usernameTXT.requestFocus();
//        }
        DataAkun.inisialisasiDataAkun();
        String usBlank = "";
        String pwBlank = "";
        String username = null;
        String password = null;
        int j = 0;
        for (int i = 0; i < DataAkun.akun.size(); i++) {
            username = DataAkun.akun.get(i).getUsername();
            password = DataAkun.akun.get(i).getPassword();
            if (username.equals(usernameTXT.getText()) && password.equals(passwordTXT.getText())) {
                Menu menu = new Menu();
                Login login = new Login();
                login.setVisible(false);
                menu.setVisible(true);
                
                break;
            } else if (usBlank.equalsIgnoreCase(usernameTXT.getText())) {
                javax.swing.JOptionPane.showMessageDialog(null, "Username tidak boleh kosong");
                usernameTXT.setText("");
                passwordTXT.setText("");
                usernameTXT.requestFocus();
                break;
            } else if (pwBlank.equalsIgnoreCase(passwordTXT.getText())) {
                javax.swing.JOptionPane.showMessageDialog(null, "Username atau password tidak boleh kosong");
                usernameTXT.setText("");
                passwordTXT.setText("");
                usernameTXT.requestFocus();
                break;
            }
            j++;
        }
        if (j == DataAkun.akun.size()) {
            javax.swing.JOptionPane.showMessageDialog(null, "Username atau password yang anda masukkan salah");
            usernameTXT.setText("");
                passwordTXT.setText("");
                usernameTXT.requestFocus();
        }
    
//        String userBlank = "";
//        String pwBlank = "";
//        String user = null;
//        String password = null;
//        
//        int j = 0;
//        for(int i = 0; i < DataAkun.akun.size(); i++){
//            user = DataAkun.akun.get(i).getUsername();
//            password = DataAkun.akun.get(i).getPassword();
//            if(user.equals(usernameTXT.getText()) && password.equals(passwordTXT.getText())){
//                Menu menu = new Menu();
//                menu.setVisible(true);
//                dispose();
//                break;
//        }else if(userBlank.equalsIgnoreCase(usernameTXT.getText())){
//            JOptionPane.showMessageDialog(null, "Username tidak boleh kosong");
//            usernameTXT.setText("");
//            passwordTXT.setText("");
//            usernameTXT.requestFocus();
//            break;
//        }else if(pwBlank.equalsIgnoreCase(passwordTXT.getText())){
//            JOptionPane.showMessageDialog(null, "Username atau password tidak boleh kosong");
//            usernameTXT.setText("");
//            passwordTXT.setText("");
//            usernameTXT.requestFocus();
//            break;
//        }
//            j++;
//        }
//        if(j == DataAkun.akun.size()){
//            JOptionPane.showMessageDialog(null, "Username atau password yang anda masukkan salah");
//            usernameTXT.setText("");
//            passwordTXT.setText("");
//            usernameTXT.requestFocus();   
//        }
    }//GEN-LAST:event_logInbuttonMouseClicked

    private void SignupButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SignupButtonMouseClicked
        // TODO add your handling code here:
        SignUp register = new SignUp();
        register.setVisible(true);
        dispose();
    }//GEN-LAST:event_SignupButtonMouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        // TODO add your handling code here:
         int tomboldialog = JOptionPane.YES_NO_OPTION;
        int hasildialog = JOptionPane.showConfirmDialog(this, "Yakin ingin keluar Aplikasi?", "PERINGATAN", tomboldialog);
        
        if(hasildialog == 0) {
            System.exit(0);
            dispose();
        }else{
            
        }
    }//GEN-LAST:event_jLabel10MouseClicked

    private void jLabel10MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseEntered
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jLabel10MouseEntered

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
    private javax.swing.JPanel SignupButton;
    private javax.swing.JLabel bg;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel logInbutton;
    private javax.swing.JLabel passwordIcon;
    private javax.swing.JPasswordField passwordTXT;
    private javax.swing.JLabel usernameIcon;
    private javax.swing.JTextField usernameTXT;
    // End of variables declaration//GEN-END:variables
}