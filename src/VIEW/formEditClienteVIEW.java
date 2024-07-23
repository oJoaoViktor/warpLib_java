/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package VIEW;

import DAO.ClienteDAO;
import DTO.ClienteDTO;
import UTILS.validations;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

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
        lbl_cpfUsuario = new javax.swing.JLabel();
        btn_confirmarEdicao = new javax.swing.JButton();
        txt_cpfUsuario = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        pnl_cadastro.setBackground(new java.awt.Color(48, 48, 48));
        pnl_cadastro.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnl_cadastro.setPreferredSize(new java.awt.Dimension(400, 400));

        lbl_tituloCadastro.setBackground(new java.awt.Color(250, 255, 0));
        lbl_tituloCadastro.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbl_tituloCadastro.setForeground(new java.awt.Color(250, 255, 0));
        lbl_tituloCadastro.setText("EDITAR CLIENTE");

        lbl_nomeCompleto.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_nomeCompleto.setForeground(new java.awt.Color(255, 255, 255));
        lbl_nomeCompleto.setText("Nome completo:");

        lbl_emailUsuario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_emailUsuario.setForeground(new java.awt.Color(255, 255, 255));
        lbl_emailUsuario.setText("E-mail:");

        lbl_cpfUsuario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_cpfUsuario.setForeground(new java.awt.Color(255, 255, 255));
        lbl_cpfUsuario.setText("CPF:");

        btn_confirmarEdicao.setBackground(new java.awt.Color(150, 150, 150));
        btn_confirmarEdicao.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        btn_confirmarEdicao.setForeground(new java.awt.Color(255, 255, 255));
        btn_confirmarEdicao.setText("Confirmar edição");
        btn_confirmarEdicao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_confirmarEdicaoActionPerformed(evt);
            }
        });

        try {
            txt_cpfUsuario.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout pnl_cadastroLayout = new javax.swing.GroupLayout(pnl_cadastro);
        pnl_cadastro.setLayout(pnl_cadastroLayout);
        pnl_cadastroLayout.setHorizontalGroup(
            pnl_cadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_cadastroLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(pnl_cadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbl_nomeCompleto)
                    .addComponent(txt_nomeUsuario)
                    .addComponent(txt_emailUsuario)
                    .addComponent(lbl_emailUsuario)
                    .addComponent(lbl_cpfUsuario)
                    .addComponent(btn_confirmarEdicao, javax.swing.GroupLayout.DEFAULT_SIZE, 318, Short.MAX_VALUE)
                    .addComponent(txt_cpfUsuario))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_cadastroLayout.createSequentialGroup()
                .addContainerGap(130, Short.MAX_VALUE)
                .addComponent(lbl_tituloCadastro)
                .addGap(127, 127, 127))
        );
        pnl_cadastroLayout.setVerticalGroup(
            pnl_cadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_cadastroLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(lbl_tituloCadastro)
                .addGap(37, 37, 37)
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
                .addContainerGap(63, Short.MAX_VALUE))
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pnl_cadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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
        ClienteDTO cliente = new ClienteDTO();
        String nome, email, cpf;
        nome = txt_nomeUsuario.getText();
        email = txt_emailUsuario.getText();
        cpf = txt_cpfUsuario.getText();
        cliente = validations.alreadyExistsCpf(cpf);

        if (nome.isEmpty() || email.isEmpty()) { // Verifica se os campos de nome ou e-mail estão vazios
            JOptionPane.showMessageDialog(this, "Insira todos os campos corretamente.", "Erro", JOptionPane.ERROR_MESSAGE);
            return; //Retorna vazio para os campos continuarem preenchidos para o usuário corrigir.
        }
        if (!validations.isValidEmail(email)) { //Verifica se o e-mail é válido
            JOptionPane.showMessageDialog(this, "Insira um e-mail válido.", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (!validations.isValidCpf(cpf)) { //Verifica se o CPF é válido
            JOptionPane.showMessageDialog(this, "Insira um CPF válido.", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (cliente != null) {
            if (!cliente.getNome().contains(nome)) { //Verifica se o CPF já existe no banco de dados
                JOptionPane.showMessageDialog(this, "Já existe um cliente cadastrado com este CPF.", "Erro", JOptionPane.ERROR_MESSAGE);
                return;
            }
        }
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
    private javax.swing.JFormattedTextField txt_cpfUsuario;
    private javax.swing.JTextField txt_emailUsuario;
    private javax.swing.JTextField txt_nomeUsuario;
    // End of variables declaration//GEN-END:variables
}
