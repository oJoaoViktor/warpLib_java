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

        jPanel1 = new javax.swing.JPanel();
        lbl_pesquisarCliente = new javax.swing.JLabel();
        cbox_listaClientes = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_listaAlugueis = new javax.swing.JTable();
        btn_gerenciarAluguel = new javax.swing.JButton();
        btn_voltarHome = new javax.swing.JButton();
        lbl_tituloGerenciamento = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(48, 48, 48));

        lbl_pesquisarCliente.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        lbl_pesquisarCliente.setForeground(new java.awt.Color(255, 255, 255));
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

        btn_gerenciarAluguel.setBackground(new java.awt.Color(150, 150, 150));
        btn_gerenciarAluguel.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        btn_gerenciarAluguel.setForeground(new java.awt.Color(255, 255, 255));
        btn_gerenciarAluguel.setText("Gerenciar");
        btn_gerenciarAluguel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_gerenciarAluguelActionPerformed(evt);
            }
        });

        btn_voltarHome.setBackground(new java.awt.Color(150, 150, 150));
        btn_voltarHome.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        btn_voltarHome.setForeground(new java.awt.Color(255, 255, 255));
        btn_voltarHome.setText("Voltar");
        btn_voltarHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_voltarHomeActionPerformed(evt);
            }
        });

        lbl_tituloGerenciamento.setBackground(new java.awt.Color(250, 255, 0));
        lbl_tituloGerenciamento.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbl_tituloGerenciamento.setForeground(new java.awt.Color(250, 255, 0));
        lbl_tituloGerenciamento.setText("GESTÃO DE ALUGUÉIS");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(57, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 716, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(lbl_pesquisarCliente)
                                    .addGap(323, 323, 323))
                                .addComponent(cbox_listaClientes, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(btn_gerenciarAluguel, javax.swing.GroupLayout.DEFAULT_SIZE, 354, Short.MAX_VALUE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btn_voltarHome, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(50, 50, 50))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lbl_tituloGerenciamento)
                        .addGap(310, 310, 310))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(lbl_tituloGerenciamento)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_pesquisarCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbox_listaClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_voltarHome)
                    .addComponent(btn_gerenciarAluguel))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 2, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_pesquisarCliente;
    private javax.swing.JLabel lbl_tituloGerenciamento;
    private javax.swing.JTable tbl_listaAlugueis;
    // End of variables declaration//GEN-END:variables

}
