/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package VIEW;

import DAO.UsuarioDAO;
import DTO.UsuarioDTO;
import java.sql.SQLException;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import UTILS.RoundedBorder;
import UTILS.RoundedBorderTextField;

/**
 *
 * @author TRJ1JVL
 */
public class formLoginVIEW extends javax.swing.JFrame {

    public formLoginVIEW() {
        initComponents();
        txt_username.setBorder(new RoundedBorderTextField(20, 255, 255, 255, 5));
        txt_password.setBorder(new RoundedBorderTextField(20, 255, 255, 255, 5));
        btn_login.setBorder(new RoundedBorderTextField(20, 150, 150, 150, 5));
        setResizable(false);
        setLocationRelativeTo(null);
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnl_background = new javax.swing.JPanel();
        pnl_formLogin = new javax.swing.JPanel();
        lbl_username = new javax.swing.JLabel();
        txt_username = new javax.swing.JTextField();
        lbl_password = new javax.swing.JLabel();
        txt_password = new javax.swing.JPasswordField();
        btn_login = new javax.swing.JButton();
        lbl_backgroundImage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnl_background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnl_formLogin.setBackground(new java.awt.Color(48, 48, 48));
        pnl_formLogin.setBorder(new RoundedBorder(15, new java.awt.Color(48, 48, 48), 0, new java.awt.Color(48, 48, 48)));
        pnl_formLogin.setForeground(new java.awt.Color(48, 48, 48));
        pnl_formLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        pnl_formLogin.setMaximumSize(new java.awt.Dimension(400, 200));
        pnl_formLogin.setOpaque(false);
        pnl_formLogin.setPreferredSize(new java.awt.Dimension(400, 200));
        pnl_formLogin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_username.setFont(new java.awt.Font("Inter ExtraBold", 0, 14)); // NOI18N
        lbl_username.setForeground(new java.awt.Color(255, 255, 255));
        lbl_username.setText("Usuário");
        pnl_formLogin.add(lbl_username, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 27, -1, -1));

        txt_username.setBackground(new java.awt.Color(255, 255, 255));
        txt_username.setBorder(null);
        pnl_formLogin.add(txt_username, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 320, -1));

        lbl_password.setBackground(new java.awt.Color(255, 255, 255));
        lbl_password.setFont(new java.awt.Font("Inter ExtraBold", 0, 14)); // NOI18N
        lbl_password.setForeground(new java.awt.Color(255, 255, 255));
        lbl_password.setText("Senha");
        pnl_formLogin.add(lbl_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 85, -1, -1));

        txt_password.setBorder(null);
        pnl_formLogin.add(txt_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 109, 316, -1));

        btn_login.setBackground(new java.awt.Color(150, 150, 150));
        btn_login.setFont(new java.awt.Font("Inter ExtraBold", 0, 12)); // NOI18N
        btn_login.setForeground(new java.awt.Color(255, 255, 255));
        btn_login.setText("Login");
        btn_login.setBorder(null);
        btn_login.setBorderPainted(false);
        btn_login.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_login.setFocusPainted(false);
        btn_login.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_login.setMargin(new java.awt.Insets(3, 14, 3, 14));
        btn_login.setName(""); // NOI18N
        btn_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_loginActionPerformed(evt);
            }
        });
        pnl_formLogin.add(btn_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 149, 316, -1));

        pnl_background.add(pnl_formLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, 400, 200));

        lbl_backgroundImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/background.png"))); // NOI18N
        pnl_background.add(lbl_backgroundImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_loginActionPerformed
        login();
    }//GEN-LAST:event_btn_loginActionPerformed

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
            java.util.logging.Logger.getLogger(formLoginVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formLoginVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formLoginVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formLoginVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new formLoginVIEW().setVisible(true);
        });
    }

    private void login() {
        try {
            String nome_usuario;
            char[] senha_usuario;
            nome_usuario = txt_username.getText(); // É possível inserir essa linha diretamente no setter
            senha_usuario = txt_password.getPassword();

            UsuarioDTO objusuariodto = new UsuarioDTO();
            objusuariodto.setUsername(nome_usuario);
            objusuariodto.setPassword(String.valueOf(senha_usuario));
            UsuarioDAO objusuariodao = new UsuarioDAO();
            ResultSet rsusuariodao = objusuariodao.autenticacaoUsuario(objusuariodto);
            if (rsusuariodao.next()) {
                formHomeVIEW objformprincipalview = new formHomeVIEW();
                objformprincipalview.setVisible(true);
                dispose(); // Fecha tela atual
            } else {
                JOptionPane.showMessageDialog(null, "Usuário ou senha inválida.");
            }
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "formLoginView: " + erro);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_login;
    private javax.swing.JLabel lbl_backgroundImage;
    private javax.swing.JLabel lbl_password;
    private javax.swing.JLabel lbl_username;
    private javax.swing.JPanel pnl_background;
    private javax.swing.JPanel pnl_formLogin;
    private javax.swing.JPasswordField txt_password;
    private javax.swing.JTextField txt_username;
    // End of variables declaration//GEN-END:variables
}
