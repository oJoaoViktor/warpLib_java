/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package VIEW;

import DAO.ClienteDAO;
import DTO.ClienteDTO;
import javax.swing.JDialog;

public class formEditClienteVIEW extends javax.swing.JDialog {

    private ClienteDTO objClienteDTO;
    private int id_cliente;

    public formEditClienteVIEW(JDialog parent, boolean modal, ClienteDTO objClienteDTO) {
        super(parent, modal);
        this.objClienteDTO = objClienteDTO;
        this.id_cliente = objClienteDTO.getId_cliente();
        initComponents();
        preencherCampos(objClienteDTO);
        setResizable(false);
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnl_cadastro = new javax.swing.JPanel();
        lbl_tituloCadastro = new javax.swing.JLabel();
        lbl_nomeCompleto = new javax.swing.JLabel();
        txt_nomeUsuario = new javax.swing.JTextField();
        lbl_emailUsuario = new javax.swing.JLabel();
        txt_emailUsuario = new javax.swing.JTextField();
        txt_cpfUsuario = new javax.swing.JTextField();
        lbl_cpfUsuario = new javax.swing.JLabel();
        btn_confirmarEdicao = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        pnl_cadastro.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnl_cadastro.setPreferredSize(new java.awt.Dimension(400, 400));

        lbl_tituloCadastro.setText("EDITAR CLIENTE");

        lbl_nomeCompleto.setText("Nome completo:");

        lbl_emailUsuario.setText("E-mail:");

        lbl_cpfUsuario.setText("CPF:");

        btn_confirmarEdicao.setText("Confirmar edição");
        btn_confirmarEdicao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_confirmarEdicaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnl_cadastroLayout = new javax.swing.GroupLayout(pnl_cadastro);
        pnl_cadastro.setLayout(pnl_cadastroLayout);
        pnl_cadastroLayout.setHorizontalGroup(
            pnl_cadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_cadastroLayout.createSequentialGroup()
                .addGroup(pnl_cadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_cadastroLayout.createSequentialGroup()
                        .addGap(165, 165, 165)
                        .addComponent(lbl_tituloCadastro))
                    .addGroup(pnl_cadastroLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(pnl_cadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbl_nomeCompleto)
                            .addComponent(txt_nomeUsuario)
                            .addComponent(txt_emailUsuario)
                            .addComponent(lbl_emailUsuario)
                            .addComponent(txt_cpfUsuario)
                            .addComponent(lbl_cpfUsuario)
                            .addComponent(btn_confirmarEdicao, javax.swing.GroupLayout.DEFAULT_SIZE, 318, Short.MAX_VALUE))))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        pnl_cadastroLayout.setVerticalGroup(
            pnl_cadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_cadastroLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(lbl_tituloCadastro)
                .addGap(42, 42, 42)
                .addComponent(lbl_nomeCompleto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_nomeUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbl_emailUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_emailUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbl_cpfUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_cpfUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(btn_confirmarEdicao)
                .addContainerGap(74, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnl_cadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(pnl_cadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_confirmarEdicaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_confirmarEdicaoActionPerformed
        atualizarCliente();
    }//GEN-LAST:event_btn_confirmarEdicaoActionPerformed

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
            java.util.logging.Logger.getLogger(formEditClienteVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formEditClienteVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formEditClienteVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formEditClienteVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                formEditClienteVIEW dialog = new formEditClienteVIEW(new javax.swing.JDialog(), true, null);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    private void atualizarCliente() {
        String nome, email, cpf;
        nome = txt_nomeUsuario.getText();
        email = txt_emailUsuario.getText();
        cpf = txt_cpfUsuario.getText();
        ClienteDTO objClienteDTO = new ClienteDTO();
        objClienteDTO.setId_cliente(this.id_cliente);
        objClienteDTO.setNome(nome);
        objClienteDTO.setEmail(email);
        objClienteDTO.setCpf(cpf);
        ClienteDAO objClienteDAO = new ClienteDAO();
        objClienteDAO.editarCliente(objClienteDTO);
        dispose();
    }

    private void preencherCampos(ClienteDTO objClienteDTO) {
        txt_nomeUsuario.setText(objClienteDTO.getNome());
        txt_emailUsuario.setText(objClienteDTO.getEmail());
        txt_cpfUsuario.setText(objClienteDTO.getCpf());
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_confirmarEdicao;
    private javax.swing.JLabel lbl_cpfUsuario;
    private javax.swing.JLabel lbl_emailUsuario;
    private javax.swing.JLabel lbl_nomeCompleto;
    private javax.swing.JLabel lbl_tituloCadastro;
    private javax.swing.JPanel pnl_cadastro;
    private javax.swing.JTextField txt_cpfUsuario;
    private javax.swing.JTextField txt_emailUsuario;
    private javax.swing.JTextField txt_nomeUsuario;
    // End of variables declaration//GEN-END:variables
}
