/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package VIEW;

import DAO.ClienteDAO;
import DAO.LivroDAO;
import DTO.LivroDTO;
import UTILS.validations;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

public class formEditLivroVIEW extends javax.swing.JDialog {
    
    private LivroDTO objLivroDTO;
    private int id_livro;
    
    public formEditLivroVIEW(JDialog parent, boolean modal, LivroDTO objLivroDTO) {
        super(parent, modal);
        this.objLivroDTO = objLivroDTO;
        this.id_livro = objLivroDTO.getId_livro();
        initComponents();
        preencherCampos(objLivroDTO);
        setResizable(false);
        setLocationRelativeTo(null);
    }
    
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
        btn_confirmarEdicaoLivro = new javax.swing.JButton();
        txt_qntDisponivelLivro = new javax.swing.JTextField();
        lbl_qntDisponivelLivro = new javax.swing.JLabel();
        txt_isbnLivro = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        pnl_cadastro.setBackground(new java.awt.Color(48, 48, 48));
        pnl_cadastro.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnl_cadastro.setPreferredSize(new java.awt.Dimension(400, 400));

        lbl_tituloCadastro.setBackground(new java.awt.Color(250, 255, 0));
        lbl_tituloCadastro.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbl_tituloCadastro.setForeground(new java.awt.Color(250, 255, 0));
        lbl_tituloCadastro.setText("EDITAR LIVRO");

        lbl_isbnLivro.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_isbnLivro.setForeground(new java.awt.Color(255, 255, 255));
        lbl_isbnLivro.setText("ISBN:");

        lbl_tituloLivro.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_tituloLivro.setForeground(new java.awt.Color(255, 255, 255));
        lbl_tituloLivro.setText("Título:");

        lbl_autorLivro.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_autorLivro.setForeground(new java.awt.Color(255, 255, 255));
        lbl_autorLivro.setText("Autor:");

        btn_confirmarEdicaoLivro.setBackground(new java.awt.Color(150, 150, 150));
        btn_confirmarEdicaoLivro.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        btn_confirmarEdicaoLivro.setForeground(new java.awt.Color(255, 255, 255));
        btn_confirmarEdicaoLivro.setText("Confirmar edição");
        btn_confirmarEdicaoLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_confirmarEdicaoLivroActionPerformed(evt);
            }
        });

        lbl_qntDisponivelLivro.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_qntDisponivelLivro.setForeground(new java.awt.Color(255, 255, 255));
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
                .addGap(40, 40, 40)
                .addGroup(pnl_cadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbl_isbnLivro)
                    .addComponent(txt_tituloLivro)
                    .addComponent(lbl_tituloLivro)
                    .addComponent(txt_autorLivro)
                    .addComponent(lbl_autorLivro)
                    .addComponent(btn_confirmarEdicaoLivro, javax.swing.GroupLayout.DEFAULT_SIZE, 318, Short.MAX_VALUE)
                    .addComponent(txt_qntDisponivelLivro)
                    .addComponent(lbl_qntDisponivelLivro)
                    .addComponent(txt_isbnLivro))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_cadastroLayout.createSequentialGroup()
                .addContainerGap(139, Short.MAX_VALUE)
                .addComponent(lbl_tituloCadastro)
                .addGap(136, 136, 136))
        );
        pnl_cadastroLayout.setVerticalGroup(
            pnl_cadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_cadastroLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(lbl_tituloCadastro)
                .addGap(38, 38, 38)
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
                .addGap(35, 35, 35)
                .addComponent(btn_confirmarEdicaoLivro)
                .addContainerGap(46, Short.MAX_VALUE))
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
            .addComponent(pnl_cadastro, javax.swing.GroupLayout.DEFAULT_SIZE, 476, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_confirmarEdicaoLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_confirmarEdicaoLivroActionPerformed
        atualizarLivro();
    }//GEN-LAST:event_btn_confirmarEdicaoLivroActionPerformed
    
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
            java.util.logging.Logger.getLogger(formEditLivroVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formEditLivroVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formEditLivroVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formEditLivroVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                formEditLivroVIEW dialog = new formEditLivroVIEW(new javax.swing.JDialog(), true, null);
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
    
    private void atualizarLivro() {
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
            if (!livro.getIsbn().contains(isbn)) { //Verifica se o livro já existe no banco de dados
                JOptionPane.showMessageDialog(this, "Já existe um livro cadastrado com este ISBN.", "Erro", JOptionPane.ERROR_MESSAGE);
                return;
            }
        }
        LivroDTO objLivroDTO = new LivroDTO();
        objLivroDTO.setId_livro(this.id_livro);
        objLivroDTO.setAutor(autor);
        objLivroDTO.setIsbn(isbn);
        objLivroDTO.setTitulo(titulo);
        objLivroDTO.setQnt_disponivel(qnt_disponivel);
        LivroDAO objLivroDAO = new LivroDAO();
        objLivroDAO.editarLivro(objLivroDTO);
        dispose();
    }
    
    private void preencherCampos(LivroDTO objLivroDTO) {
        txt_isbnLivro.setText(objLivroDTO.getIsbn());
        txt_tituloLivro.setText(objLivroDTO.getTitulo());
        txt_autorLivro.setText(objLivroDTO.getAutor());
        txt_qntDisponivelLivro.setText(String.valueOf(objLivroDTO.getQnt_disponivel()));
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_confirmarEdicaoLivro;
    private javax.swing.JLabel lbl_autorLivro;
    private javax.swing.JLabel lbl_isbnLivro;
    private javax.swing.JLabel lbl_qntDisponivelLivro;
    private javax.swing.JLabel lbl_tituloCadastro;
    private javax.swing.JLabel lbl_tituloLivro;
    private javax.swing.JPanel pnl_cadastro;
    private javax.swing.JTextField txt_autorLivro;
    private javax.swing.JFormattedTextField txt_isbnLivro;
    private javax.swing.JTextField txt_qntDisponivelLivro;
    private javax.swing.JTextField txt_tituloLivro;
    // End of variables declaration//GEN-END:variables
}
