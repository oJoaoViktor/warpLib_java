/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package VIEW;

import DAO.LivroDAO;
import DTO.LivroDTO;
import UTILS.validations;
import java.util.Random;
import java.util.ArrayList;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

/**
 *
 * @author TRJ1JVL
 */
public class formLivroVIEW extends javax.swing.JFrame {

    public formLivroVIEW() {
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
        listarLivros();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnl_cadastro = new javax.swing.JPanel();
        lbl_tituloCadastro = new javax.swing.JLabel();
        lbl_isbnLivro = new javax.swing.JLabel();
        lbl_tituloLivro = new javax.swing.JLabel();
        txt_tituloLivro = new javax.swing.JTextField();
        txt_autorLivro = new javax.swing.JTextField();
        lbl_autorLivro = new javax.swing.JLabel();
        btn_cadastrarLivro = new javax.swing.JButton();
        txt_qntDisponivelLivro = new javax.swing.JTextField();
        lbl_qntDisponivelLivro = new javax.swing.JLabel();
        txt_isbnLivro = new javax.swing.JFormattedTextField();
        pnl_gerenciamentoCliente = new javax.swing.JPanel();
        lbl_tituloGerenciamento = new javax.swing.JLabel();
        lbl_selecioneLivro = new javax.swing.JLabel();
        btn_editarLivro = new javax.swing.JButton();
        cbox_bookList = new javax.swing.JComboBox<>();
        btn_excluirLivro = new javax.swing.JButton();
        btn_voltarHome = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnl_cadastro.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnl_cadastro.setPreferredSize(new java.awt.Dimension(400, 400));

        lbl_tituloCadastro.setText("CADASTRO");

        lbl_isbnLivro.setText("ISBN:");

        lbl_tituloLivro.setText("Título:");

        lbl_autorLivro.setText("Autor:");

        btn_cadastrarLivro.setText("Cadastrar Livro");
        btn_cadastrarLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cadastrarLivroActionPerformed(evt);
            }
        });

        lbl_qntDisponivelLivro.setText("Quantidade de exemplares:");

        try {
            txt_isbnLivro.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#############")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout pnl_cadastroLayout = new javax.swing.GroupLayout(pnl_cadastro);
        pnl_cadastro.setLayout(pnl_cadastroLayout);
        pnl_cadastroLayout.setHorizontalGroup(
            pnl_cadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_cadastroLayout.createSequentialGroup()
                .addGroup(pnl_cadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_cadastroLayout.createSequentialGroup()
                        .addGap(169, 169, 169)
                        .addComponent(lbl_tituloCadastro))
                    .addGroup(pnl_cadastroLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(pnl_cadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbl_isbnLivro)
                            .addComponent(txt_tituloLivro, javax.swing.GroupLayout.DEFAULT_SIZE, 318, Short.MAX_VALUE)
                            .addComponent(lbl_tituloLivro)
                            .addComponent(txt_autorLivro, javax.swing.GroupLayout.DEFAULT_SIZE, 318, Short.MAX_VALUE)
                            .addComponent(lbl_autorLivro)
                            .addComponent(btn_cadastrarLivro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txt_qntDisponivelLivro, javax.swing.GroupLayout.DEFAULT_SIZE, 318, Short.MAX_VALUE)
                            .addComponent(lbl_qntDisponivelLivro)
                            .addComponent(txt_isbnLivro))))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        pnl_cadastroLayout.setVerticalGroup(
            pnl_cadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_cadastroLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(lbl_tituloCadastro)
                .addGap(42, 42, 42)
                .addComponent(lbl_isbnLivro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_isbnLivro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbl_tituloLivro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_tituloLivro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbl_autorLivro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_autorLivro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbl_qntDisponivelLivro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_qntDisponivelLivro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(btn_cadastrarLivro)
                .addGap(23, 23, 23))
        );

        getContentPane().add(pnl_cadastro, java.awt.BorderLayout.LINE_START);

        pnl_gerenciamentoCliente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lbl_tituloGerenciamento.setText("GERENCIAMENTO DE LIVROS");

        lbl_selecioneLivro.setText("Selecione o livro:");

        btn_editarLivro.setText("Editar");
        btn_editarLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editarLivroActionPerformed(evt);
            }
        });

        btn_excluirLivro.setText("Excluir");
        btn_excluirLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_excluirLivroActionPerformed(evt);
            }
        });

        btn_voltarHome.setText("Voltar");
        btn_voltarHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_voltarHomeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnl_gerenciamentoClienteLayout = new javax.swing.GroupLayout(pnl_gerenciamentoCliente);
        pnl_gerenciamentoCliente.setLayout(pnl_gerenciamentoClienteLayout);
        pnl_gerenciamentoClienteLayout.setHorizontalGroup(
            pnl_gerenciamentoClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_gerenciamentoClienteLayout.createSequentialGroup()
                .addContainerGap(122, Short.MAX_VALUE)
                .addGroup(pnl_gerenciamentoClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_gerenciamentoClienteLayout.createSequentialGroup()
                        .addComponent(lbl_tituloGerenciamento)
                        .addGap(122, 122, 122))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_gerenciamentoClienteLayout.createSequentialGroup()
                        .addComponent(btn_voltarHome)
                        .addContainerGap())))
            .addGroup(pnl_gerenciamentoClienteLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(pnl_gerenciamentoClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_selecioneLivro)
                    .addGroup(pnl_gerenciamentoClienteLayout.createSequentialGroup()
                        .addComponent(btn_editarLivro, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_excluirLivro, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(cbox_bookList, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnl_gerenciamentoClienteLayout.setVerticalGroup(
            pnl_gerenciamentoClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_gerenciamentoClienteLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(lbl_tituloGerenciamento)
                .addGap(42, 42, 42)
                .addComponent(lbl_selecioneLivro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbox_bookList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_gerenciamentoClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_editarLivro)
                    .addComponent(btn_excluirLivro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 205, Short.MAX_VALUE)
                .addComponent(btn_voltarHome)
                .addContainerGap())
        );

        getContentPane().add(pnl_gerenciamentoCliente, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_cadastrarLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cadastrarLivroActionPerformed
        cadastrarLivro();
        listarLivros();
    }//GEN-LAST:event_btn_cadastrarLivroActionPerformed

    private void btn_editarLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editarLivroActionPerformed
        openEditScreen(collectISBN());
        listarLivros();
    }//GEN-LAST:event_btn_editarLivroActionPerformed

    private void btn_excluirLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_excluirLivroActionPerformed
        excludeLivro();
        listarLivros();
    }//GEN-LAST:event_btn_excluirLivroActionPerformed

    private void btn_voltarHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_voltarHomeActionPerformed
        callHomeScreen();
    }//GEN-LAST:event_btn_voltarHomeActionPerformed

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
            java.util.logging.Logger.getLogger(formLivroVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formLivroVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formLivroVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formLivroVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formLivroVIEW().setVisible(true);
            }
        });
    }

    private void cadastrarLivro() {
        try {
            String autor, isbn, titulo, qnt_disponivelTxt;
            int qnt_disponivel;

            autor = txt_autorLivro.getText().trim();
            isbn = txt_isbnLivro.getText().trim();
            titulo = txt_tituloLivro.getText().trim();
            qnt_disponivelTxt = txt_qntDisponivelLivro.getText().trim();
            LivroDTO livro = validations.alreadyExistsISBN(isbn);
            if (autor.isEmpty() || isbn.isEmpty() || titulo.isEmpty() || qnt_disponivelTxt.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Não podem haver campos vazios.", "Erro", JOptionPane.ERROR_MESSAGE);
                return;
            }
            qnt_disponivel = Integer.parseInt(qnt_disponivelTxt);
            if (isbn.length() < 10 || isbn.length() > 13) {
                JOptionPane.showMessageDialog(this, "Insira um ISBN válido", "Erro", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (livro != null) {
                JOptionPane.showMessageDialog(this, "Já existe um livro cadastrado com esse ISBN.", "Erro", JOptionPane.ERROR_MESSAGE);
                return;
            }

            LivroDTO objLivroDTO = new LivroDTO();
            objLivroDTO.setAutor(autor);
            objLivroDTO.setIsbn(isbn);
            objLivroDTO.setTitulo(titulo);
            objLivroDTO.setQnt_disponivel(qnt_disponivel);
            LivroDAO objLivroDAO = new LivroDAO();
            objLivroDAO.cadastrarLivro(objLivroDTO);
            clearFields();
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "formLivroView - cadastrarLivro():\n" + erro);
        }
    }

    private void callHomeScreen() {
        formHomeVIEW homeScreen = new formHomeVIEW();
        dispose();
        homeScreen.setVisible(true);
    }

    private void clearFields() {
        txt_isbnLivro.setText("");
        txt_tituloLivro.setText("");
        txt_autorLivro.setText("");
        txt_qntDisponivelLivro.setText("");
    }

    private String collectISBN() {
        String isbn = "";
        try {
            String selectedItem = (String) cbox_bookList.getSelectedItem();
            if (selectedItem != null) {
                String[] parts = selectedItem.split(" - ");
                isbn = parts[0];
            }
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "formLivroVIEW - collectMatricula(): " + erro);
        }
        return isbn;
    }

    private void excludeLivro() {
        int id_livro;
        LivroDAO objLivroDAO = new LivroDAO();
        LivroDTO objLivroDTO = objLivroDAO.pesquisarLivroISBN(collectISBN());
        id_livro = objLivroDTO.getId_livro();
        objLivroDAO.excludelivro(objLivroDTO);
    }

    private void listarLivros() {
        try {
            LivroDAO objLivroDAO = new LivroDAO();
            this.cbox_bookList.removeAllItems();
            ArrayList<LivroDTO> bookList = objLivroDAO.listarLivros();
            for (LivroDTO livro : bookList) {
                String item = livro.getIsbn() + " - " + livro.getTitulo();
                this.cbox_bookList.addItem(item);
            }
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "formLivroVIEW - listarLivros():\n" + erro);
        }
    }

    private void openEditScreen(String isbn) {
        try {
            LivroDAO objLivroDAO = new LivroDAO();
            LivroDTO objLivroDTO = objLivroDAO.pesquisarLivroISBN(isbn);
            JDialog dialog = new JDialog();
            if (objLivroDTO != null) {
                formEditLivroVIEW editLivroScreen = new formEditLivroVIEW(dialog, rootPaneCheckingEnabled, objLivroDTO);
                editLivroScreen.setVisible(true);
            }
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Houve um erro ao abrir a tela de edição de cliente: " + erro);
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cadastrarLivro;
    private javax.swing.JButton btn_editarLivro;
    private javax.swing.JButton btn_excluirLivro;
    private javax.swing.JButton btn_voltarHome;
    private javax.swing.JComboBox<String> cbox_bookList;
    private javax.swing.JLabel lbl_autorLivro;
    private javax.swing.JLabel lbl_isbnLivro;
    private javax.swing.JLabel lbl_qntDisponivelLivro;
    private javax.swing.JLabel lbl_selecioneLivro;
    private javax.swing.JLabel lbl_tituloCadastro;
    private javax.swing.JLabel lbl_tituloGerenciamento;
    private javax.swing.JLabel lbl_tituloLivro;
    private javax.swing.JPanel pnl_cadastro;
    private javax.swing.JPanel pnl_gerenciamentoCliente;
    private javax.swing.JTextField txt_autorLivro;
    private javax.swing.JFormattedTextField txt_isbnLivro;
    private javax.swing.JTextField txt_qntDisponivelLivro;
    private javax.swing.JTextField txt_tituloLivro;
    // End of variables declaration//GEN-END:variables
}
