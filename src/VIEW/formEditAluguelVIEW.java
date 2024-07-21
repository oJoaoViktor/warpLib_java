/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package VIEW;

import DAO.ClienteDAO;
import DAO.LivroDAO;
import DAO.AluguelDAO;
import DTO.AluguelDTO;
import DTO.ClienteDTO;
import DTO.LivroDTO;
import java.sql.Date;
import javax.swing.JDialog;

public class formEditAluguelVIEW extends javax.swing.JDialog {

    private AluguelDTO objAluguelDTO;

    public formEditAluguelVIEW(JDialog parent, boolean modal, AluguelDTO objAluguelDTO) {
        super(parent, modal);
        this.objAluguelDTO = objAluguelDTO;
        initComponents();
        preencherCampos(objAluguelDTO);
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnl_cadastro = new javax.swing.JPanel();
        lbl_tituloGerenciamentoAluguel = new javax.swing.JLabel();
        lbl_nomeCliente = new javax.swing.JLabel();
        txt_nomeCliente = new javax.swing.JTextField();
        lbl_tituloLivro = new javax.swing.JLabel();
        txt_tituloLivro = new javax.swing.JTextField();
        txt_dataEmprestimo = new javax.swing.JTextField();
        lbl_dataEmprestimo = new javax.swing.JLabel();
        btn_devolverLivro = new javax.swing.JButton();
        txt_dataDevolucao = new javax.swing.JTextField();
        lbl_dataDevolucao = new javax.swing.JLabel();
        lbl_situacaoDevolutiva = new javax.swing.JLabel();
        txt_situacaoDevolutiva = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        pnl_cadastro.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnl_cadastro.setPreferredSize(new java.awt.Dimension(400, 400));

        lbl_tituloGerenciamentoAluguel.setText("GERENCIAR ALUGUEL");

        lbl_nomeCliente.setText("Cliente:");

        lbl_tituloLivro.setText("Livro:");

        lbl_dataEmprestimo.setText("Data do empréstimo:");

        btn_devolverLivro.setText("Devolver Livro");
        btn_devolverLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_devolverLivroActionPerformed(evt);
            }
        });

        lbl_dataDevolucao.setText("Data para devolução:");

        lbl_situacaoDevolutiva.setText("Situação:");

        javax.swing.GroupLayout pnl_cadastroLayout = new javax.swing.GroupLayout(pnl_cadastro);
        pnl_cadastro.setLayout(pnl_cadastroLayout);
        pnl_cadastroLayout.setHorizontalGroup(
            pnl_cadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_cadastroLayout.createSequentialGroup()
                .addGroup(pnl_cadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_cadastroLayout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(lbl_tituloGerenciamentoAluguel))
                    .addGroup(pnl_cadastroLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(pnl_cadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbl_nomeCliente)
                            .addComponent(txt_nomeCliente)
                            .addComponent(txt_tituloLivro)
                            .addComponent(lbl_tituloLivro)
                            .addComponent(txt_dataEmprestimo)
                            .addComponent(lbl_dataEmprestimo)
                            .addComponent(btn_devolverLivro, javax.swing.GroupLayout.DEFAULT_SIZE, 318, Short.MAX_VALUE)
                            .addComponent(txt_dataDevolucao)
                            .addComponent(lbl_dataDevolucao)
                            .addComponent(lbl_situacaoDevolutiva)
                            .addComponent(txt_situacaoDevolutiva))))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        pnl_cadastroLayout.setVerticalGroup(
            pnl_cadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_cadastroLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(lbl_tituloGerenciamentoAluguel)
                .addGap(18, 18, 18)
                .addComponent(lbl_nomeCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_nomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbl_tituloLivro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_tituloLivro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbl_dataEmprestimo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_dataEmprestimo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbl_dataDevolucao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_dataDevolucao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbl_situacaoDevolutiva)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_situacaoDevolutiva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_devolverLivro)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(pnl_cadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(pnl_cadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_devolverLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_devolverLivroActionPerformed
        AluguelDTO aluguelEmGerenciamento = new AluguelDTO();
        aluguelEmGerenciamento = coletarLivroEmGerenciamento();
        atualizarAluguel(aluguelEmGerenciamento);
    }//GEN-LAST:event_btn_devolverLivroActionPerformed

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
            java.util.logging.Logger.getLogger(formEditAluguelVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formEditAluguelVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formEditAluguelVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formEditAluguelVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                formEditAluguelVIEW dialog = new formEditAluguelVIEW(new javax.swing.JDialog(), true, null);
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

    private void atualizarAluguel(AluguelDTO aluguelEmGerenciamento) {
        aluguelEmGerenciamento.setDevolvido(true);
        AluguelDAO objAluguelDAO = new AluguelDAO();
        objAluguelDAO.atualizarAluguel(aluguelEmGerenciamento);
        dispose();
    }

    private AluguelDTO coletarLivroEmGerenciamento() {
        ClienteDAO objClienteDAO = new ClienteDAO();
        ClienteDTO objClienteDTO = new ClienteDTO();
        objClienteDTO = objClienteDAO.pesquisarClienteNome(objAluguelDTO.getNome_cliente());
        objAluguelDTO.setId_cliente(objClienteDTO.getId_cliente());
        LivroDAO objLivroDAO = new LivroDAO();
        LivroDTO objLivroDTO = new LivroDTO();
        objLivroDTO = objLivroDAO.pesquisarLivroTitulo(objAluguelDTO.getNome_livro());
        objAluguelDTO.setId_livro(objLivroDTO.getId_livro());
        AluguelDAO objAluguelDAO = new AluguelDAO();
        return objAluguelDAO.pesquisarAluguelPorLinha(objAluguelDTO);
    }

    private void preencherCampos(AluguelDTO objAluguelDTO) {
        txt_nomeCliente.setText(objAluguelDTO.getNome_cliente());
        txt_tituloLivro.setText(objAluguelDTO.getNome_livro());
        txt_dataEmprestimo.setText(String.valueOf(objAluguelDTO.getData_aluguel()));
        txt_dataDevolucao.setText(String.valueOf(objAluguelDTO.getData_devolucao()));
        txt_situacaoDevolutiva.setText(objAluguelDTO.getSituacao());

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_devolverLivro;
    private javax.swing.JLabel lbl_dataDevolucao;
    private javax.swing.JLabel lbl_dataEmprestimo;
    private javax.swing.JLabel lbl_nomeCliente;
    private javax.swing.JLabel lbl_situacaoDevolutiva;
    private javax.swing.JLabel lbl_tituloGerenciamentoAluguel;
    private javax.swing.JLabel lbl_tituloLivro;
    private javax.swing.JPanel pnl_cadastro;
    private javax.swing.JTextField txt_dataDevolucao;
    private javax.swing.JTextField txt_dataEmprestimo;
    private javax.swing.JTextField txt_nomeCliente;
    private javax.swing.JTextField txt_situacaoDevolutiva;
    private javax.swing.JTextField txt_tituloLivro;
    // End of variables declaration//GEN-END:variables
}
