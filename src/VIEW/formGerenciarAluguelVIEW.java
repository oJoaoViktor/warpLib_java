package VIEW;

import DAO.AluguelDAO;
import DAO.ClienteDAO;
import DAO.LivroDAO;
import DTO.AluguelDTO;
import DTO.ClienteDTO;
import DTO.LivroDTO;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class formGerenciarAluguelVIEW extends javax.swing.JFrame {

    Date hoje = new Date();

    public formGerenciarAluguelVIEW() {
        this.hoje = new Date();
        initComponents();
        listarAlugueis();
        listarClientes();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_pesquisarCliente = new javax.swing.JLabel();
        cbox_listaClientes = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_listaAlugueis = new javax.swing.JTable();
        btn_voltarHome = new javax.swing.JButton();
        btn_gerenciarAluguel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbl_pesquisarCliente.setText("Pesquisar cliente:");

        cbox_listaClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbox_listaClientesActionPerformed(evt);
            }
        });

        tbl_listaAlugueis.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cliente", "Livro", "Data empréstimo", "Data devolução", "Situação", "Devolvido"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_listaAlugueis.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_listaAlugueisMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_listaAlugueis);
        if (tbl_listaAlugueis.getColumnModel().getColumnCount() > 0) {
            tbl_listaAlugueis.getColumnModel().getColumn(5).setPreferredWidth(20);
        }

        btn_voltarHome.setText("Voltar");
        btn_voltarHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_voltarHomeActionPerformed(evt);
            }
        });

        btn_gerenciarAluguel.setText("Gerenciar");
        btn_gerenciarAluguel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_gerenciarAluguelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(42, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 716, Short.MAX_VALUE)
                    .addComponent(lbl_pesquisarCliente, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbox_listaClientes, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_gerenciarAluguel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_voltarHome, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(42, 42, 42))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(lbl_pesquisarCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbox_listaClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_voltarHome)
                    .addComponent(btn_gerenciarAluguel))
                .addGap(13, 13, 13))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_voltarHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_voltarHomeActionPerformed
        formHomeVIEW objFormHomeVIEW = new formHomeVIEW();
        dispose();
        objFormHomeVIEW.setVisible(true);
    }//GEN-LAST:event_btn_voltarHomeActionPerformed

    private void cbox_listaClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbox_listaClientesActionPerformed
        pesquisarAluguelCliente();
    }//GEN-LAST:event_cbox_listaClientesActionPerformed

    private void tbl_listaAlugueisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_listaAlugueisMouseClicked

    }//GEN-LAST:event_tbl_listaAlugueisMouseClicked

    private void btn_gerenciarAluguelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_gerenciarAluguelActionPerformed
        AluguelDTO objAluguelDTO = new AluguelDTO();
        objAluguelDTO = gerenciarAluguelSelecionado();
        openEditScreen(objAluguelDTO);
        listarAlugueis();
    }//GEN-LAST:event_btn_gerenciarAluguelActionPerformed

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
            java.util.logging.Logger.getLogger(formGerenciarAluguelVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formGerenciarAluguelVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formGerenciarAluguelVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formGerenciarAluguelVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new formGerenciarAluguelVIEW().setVisible(true);
        });
    }

    private int collectMatricula() {
        int matricula = 0;
        try {
            String selectedItem = (String) cbox_listaClientes.getSelectedItem();
            if (selectedItem != null) {
                String[] parts = selectedItem.split(" - ");
                matricula = Integer.parseInt(parts[0]);
            }
        } catch (NumberFormatException erro) {
            JOptionPane.showMessageDialog(null, "collectMatricula()" + erro);
        }
        return matricula;
    }

    private AluguelDTO gerenciarAluguelSelecionado() {
        int row = tbl_listaAlugueis.getSelectedRow();
        if (row != -1) {
            AluguelDTO objAluguelDTO = new AluguelDTO();
            objAluguelDTO.setNome_cliente((String) tbl_listaAlugueis.getValueAt(row, 0));
            objAluguelDTO.setNome_livro((String) tbl_listaAlugueis.getValueAt(row, 1));
            objAluguelDTO.setData_aluguel((java.sql.Date) (Date) tbl_listaAlugueis.getValueAt(row, 2));
            objAluguelDTO.setData_devolucao((java.sql.Date) (Date) tbl_listaAlugueis.getValueAt(row, 3));
            objAluguelDTO.setSituacao((String) tbl_listaAlugueis.getValueAt(row, 4));
            objAluguelDTO.setDevolvido((Boolean) tbl_listaAlugueis.getValueAt(row, 5));
            return objAluguelDTO;
        }
        return null;
    }

    private void listarAlugueis() {
        try {
            AluguelDAO objAluguelDAO = new AluguelDAO();
            DefaultTableModel model = (DefaultTableModel) tbl_listaAlugueis.getModel();
            model.setNumRows(0);
            ArrayList<AluguelDTO> aluguelList = objAluguelDAO.listarAlugueis();
            for (AluguelDTO aluguel : aluguelList) {
                String situacao = verificarSituacao(aluguel.getData_devolucao(), hoje, aluguel.isDevolvido());
                model.addRow(new Object[]{
                    aluguel.getNome_cliente(),
                    aluguel.getNome_livro(),
                    aluguel.getData_aluguel(),
                    aluguel.getData_devolucao(),
                    situacao,
                    aluguel.isDevolvido(),});
            }
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "formGerenciarAluguelVIEW - listarAlugueis(): " + erro);
        }
    }

    private void listarAlugueisPorCliente(ClienteDTO objClienteDTO) {
        try {
            AluguelDAO objAluguelDAO = new AluguelDAO();
            DefaultTableModel model = (DefaultTableModel) tbl_listaAlugueis.getModel();
            model.setNumRows(0);
            ArrayList<AluguelDTO> aluguelList = objAluguelDAO.listarAlugueisPorCliente(objClienteDTO);
            for (AluguelDTO aluguel : aluguelList) {
                String situacao = verificarSituacao(aluguel.getData_devolucao(), hoje, aluguel.isDevolvido());
                model.addRow(new Object[]{
                    aluguel.getNome_cliente(),
                    aluguel.getNome_livro(),
                    aluguel.getData_aluguel(),
                    aluguel.getData_devolucao(),
                    situacao,
                    aluguel.isDevolvido(),});
            }
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "formGerenciarAluguelVIEW - listarAlugueis(): " + erro);
        }
    }

    private void listarClientes() {
        try {
            ClienteDAO objClienteDAO = new ClienteDAO();
            this.cbox_listaClientes.removeAllItems();
            ArrayList<ClienteDTO> clientList = objClienteDAO.pesquisarCliente();
            this.cbox_listaClientes.addItem("Selecione um cliente"); //Adiciona um campo inicial para listar todos
            for (ClienteDTO cliente : clientList) {
                String item = cliente.getMatricula() + " - " + cliente.getNome();
                this.cbox_listaClientes.addItem(item);
            }
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "listarClientes(): " + erro);
        }
    }

    private void openEditScreen(AluguelDTO objAluguelDTO) {
        try {
            JDialog dialog = new JDialog();
            if (objAluguelDTO != null) {
                formEditAluguelVIEW editScreen = new formEditAluguelVIEW(dialog, rootPaneCheckingEnabled, objAluguelDTO);
                editScreen.setVisible(true);
            }
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Houve um erro ao abrir a tela de gerenciamento de aluguel: " + erro);
        }
    }

    private void pesquisarAluguelCliente() {
        String clienteSelecionado = (String) cbox_listaClientes.getSelectedItem();
        if (clienteSelecionado == null || clienteSelecionado.equals("Selecione um cliente")) {
            listarAlugueis();
        } else {
            ClienteDAO objClienteDAO = new ClienteDAO();
            ClienteDTO objClienteDTO = new ClienteDTO();
            objClienteDTO = objClienteDAO.pesquisarClienteMatricula(collectMatricula());
            listarAlugueisPorCliente(objClienteDTO);
        }
    }

    private String verificarSituacao(java.sql.Date data_devolucao, Date hoje, boolean devolvido) {
        if (devolvido) {
            return "Devolvido";
        } else if (data_devolucao != null && data_devolucao.before(hoje)) {
            return "Em atraso";
        }
        return "Em dia";
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_gerenciarAluguel;
    private javax.swing.JButton btn_voltarHome;
    private javax.swing.JComboBox<String> cbox_listaClientes;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_pesquisarCliente;
    private javax.swing.JTable tbl_listaAlugueis;
    // End of variables declaration//GEN-END:variables

}
