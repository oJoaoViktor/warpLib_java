package DAO;

import DTO.AluguelDTO;
import DTO.ClienteDTO;
import DTO.LivroDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class AluguelDAO {

    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;
    ArrayList<AluguelDTO> aluguelList = new ArrayList<>();

    public void atualizarAluguel(AluguelDTO objAluguelDTO) {
        String sql = "update aluguel set devolvido=true where id_aluguel=?";
        conn = new ConexaoDAO().conectaBD();
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setInt(1, objAluguelDTO.getId_aluguel());
            System.out.println(objAluguelDTO.getId_aluguel());
            pstm.executeUpdate();
            JOptionPane.showMessageDialog(null, "Livro devolvido com sucesso.");
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Aluguel DAO - atualizarAluguel(): " + erro);
        } finally {
            closeResources(conn, pstm);
        }
    }

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

    public ArrayList<AluguelDTO> listarAlugueis() {
        String sql = "SELECT a.id_aluguel, c.nome, l.titulo, a.data_aluguel, a.data_devolucao, a.devolvido\n"
                + "FROM aluguel a\n"
                + "JOIN cliente c ON a.id_cliente = c.id_cliente\n"
                + "JOIN livro l ON a.id_livro = l.id_livro;";
        conn = new ConexaoDAO().conectaBD();
        try {
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();
            while (rs.next()) {
                AluguelDTO objAluguelDTO = new AluguelDTO();
                objAluguelDTO.setId_aluguel(rs.getInt("id_aluguel"));
                objAluguelDTO.setNome_cliente(rs.getString("c.nome"));
                objAluguelDTO.setNome_livro(rs.getString("l.titulo"));
                objAluguelDTO.setData_aluguel(rs.getDate("data_aluguel"));
                objAluguelDTO.setData_devolucao(rs.getDate("data_devolucao"));
                objAluguelDTO.setDevolvido(rs.getBoolean("devolvido"));
                aluguelList.add(objAluguelDTO);
            }
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "AluguelDAO - listarAluguei(): " + erro);
        } finally {
            closeResources(conn, pstm);
        }
        return aluguelList;
    }

    public ArrayList<AluguelDTO> listarAlugueisPorCliente(ClienteDTO objClienteDTO) {
        String sql = "SELECT a.id_aluguel, c.nome, l.titulo, a.data_aluguel, a.data_devolucao, a.devolvido\n"
                + "FROM aluguel a\n"
                + "JOIN cliente c ON a.id_cliente = c.id_cliente\n"
                + "JOIN livro l ON a.id_livro = l.id_livro\n"
                + "WHERE matricula = ?";
        conn = new ConexaoDAO().conectaBD();
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setInt(1, objClienteDTO.getMatricula());
            rs = pstm.executeQuery();
            while (rs.next()) {
                AluguelDTO objAluguelDTO = new AluguelDTO();
                objAluguelDTO.setId_aluguel(rs.getInt("id_aluguel"));
                objAluguelDTO.setNome_cliente(rs.getString("c.nome"));
                objAluguelDTO.setNome_livro(rs.getString("l.titulo"));
                objAluguelDTO.setData_aluguel(rs.getDate("data_aluguel"));
                objAluguelDTO.setData_devolucao(rs.getDate("data_devolucao"));
                objAluguelDTO.setDevolvido(rs.getBoolean("devolvido"));
                aluguelList.add(objAluguelDTO);
            }
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "AluguelDAO - listarAluguei(): " + erro);
        } finally {
            closeResources(conn, pstm);
        }
        return aluguelList;
    }

    public AluguelDTO pesquisarAluguelPorLinha(AluguelDTO objAluguelDTO) {
        AluguelDTO aluguelSelecionado = new AluguelDTO();
        String sql = "select *from aluguel\n"
                + "where id_cliente=? and\n"
                + "id_livro=? and\n"
                + "data_aluguel=? and\n"
                + "data_devolucao=? and\n"
                + "devolvido=?";
        conn = new ConexaoDAO().conectaBD();
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setInt(1, objAluguelDTO.getId_cliente());
            pstm.setInt(2, objAluguelDTO.getId_livro());
            pstm.setDate(3, objAluguelDTO.getData_aluguel());
            pstm.setDate(4, objAluguelDTO.getData_devolucao());
            pstm.setBoolean(5, objAluguelDTO.isDevolvido());
            rs = pstm.executeQuery();
            if (rs.next()) {
                aluguelSelecionado = new AluguelDTO();
                aluguelSelecionado.setId_aluguel(rs.getInt("id_aluguel"));
                aluguelSelecionado.setId_cliente(rs.getInt("id_cliente"));
                aluguelSelecionado.setId_livro(rs.getInt("id_livro"));
                aluguelSelecionado.setData_aluguel(rs.getDate("data_aluguel"));
                aluguelSelecionado.setData_devolucao(rs.getDate("data_devolucao"));
                aluguelSelecionado.setDevolvido(rs.getBoolean("devolvido"));
                return aluguelSelecionado;
            }
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "AluguelDAO - pesquisarAluguelPorLinha():" + erro);
        } finally {
            closeResources(conn, pstm);
        }
        return null;
    }

//    public boolean alreadyExistsRent(AluguelDTO objAluguelDTO) {
//        String sql = "select * from aluguel"
//    }
}
