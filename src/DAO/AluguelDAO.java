package DAO;

import DTO.AluguelDTO;
import DTO.ClienteDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class AluguelDAO {

    Connection conn;
    PreparedStatement pstm;

    public void cadastrarAluguel(AluguelDTO objAluguelDTO) {
        String sql = "insert into aluguel (id_cliente, id_livro, data_aluguel, data_devolucao) values(?,?,?,?)";
        conn = new ConexaoDAO().conectaBD();
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setInt(1, objAluguelDTO.getId_cliente());
            pstm.setInt(2, objAluguelDTO.getId_livro());
            pstm.setDate(3, objAluguelDTO.getData_aluguel());
            pstm.setDate(4, objAluguelDTO.getData_devolucao());
            pstm.execute();
            JOptionPane.showMessageDialog(null, "Aluguel confirmado\nData de devolução: " + objAluguelDTO.getData_devolucao());
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Aluguel DAO - cadastrarAluguel(): " + erro);
        } finally {
            closeResources(conn, pstm);
        }
    }

    public void closeResources(Connection conn, PreparedStatement pstm) {
        if (pstm != null) {
            try {
                pstm.close();
            } catch (SQLException erro) {
                JOptionPane.showMessageDialog(null, "Erro ao fechar PreparedStatement: " + erro);
            }
        }
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException erro) {
                JOptionPane.showMessageDialog(null, "Erro ao fechar Conexão: " + erro);
            }
        }
    }

}
