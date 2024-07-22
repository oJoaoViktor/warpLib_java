package DAO;

import DTO.LivroDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class LivroDAO {

    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;
    ArrayList<LivroDTO> bookList = new ArrayList<>();

    public void atualizarQuantidadeDisponivel(LivroDTO objLivroDTO) {
        String sql = "update livro set qnt_disponivel=? where id_livro=?";
        conn = new ConexaoDAO().conectaBD();
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setInt(1, objLivroDTO.getQnt_disponivel() - 1);
            pstm.setInt(2, objLivroDTO.getId_livro());
            pstm.executeUpdate();
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "LivroDAO - atualizarQuantidadeDisponivel(): " + erro);
        } finally {
            closeResources(conn, pstm);
        }
    }

    public LivroDTO bookAlreadyExists(String isbn) {
        LivroDTO livro = null;
        String sql = "select * from livro where isbn=?";
        conn = new ConexaoDAO().conectaBD();
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, isbn);
            ResultSet rs = pstm.executeQuery();
            if (rs.next()) {
                livro = new LivroDTO();
                livro.setId_livro(rs.getInt("id_livro"));
                livro.setAutor(rs.getString("autor"));
                livro.setTitulo(rs.getString("titulo"));
                livro.setIsbn(rs.getString("isbn"));
                livro.setQnt_disponivel(rs.getInt("qnt_disponivel"));
                return livro;
            }
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "LivroDAO - bookAlreadyExists():\n" + erro);
        } finally {
            closeResources(conn, pstm);
        }
        return null;
    }

    public void cadastrarLivro(LivroDTO objLivroDTO) {
        String sql = "insert into livro (isbn, autor, titulo, qnt_disponivel) values (?, ?, ?, ?)";
        conn = new ConexaoDAO().conectaBD();
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objLivroDTO.getIsbn());
            pstm.setString(2, objLivroDTO.getAutor());
            pstm.setString(3, objLivroDTO.getTitulo());
            pstm.setInt(4, objLivroDTO.getQnt_disponivel());
            pstm.execute();
            JOptionPane.showMessageDialog(null, "Livro cadastrado com sucesso.");
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "LivroDAO - cadastrarLivro(): " + erro);
        } finally {
            closeResources(conn, pstm);
        }
    }

    public void editarLivro(LivroDTO objLivroDTO) {
        System.out.println("Entrou em Editar");
        String sql = "update livro set isbn =?, autor=?, titulo=?, qnt_disponivel=? where id_livro=?";
        conn = new ConexaoDAO().conectaBD();
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objLivroDTO.getIsbn());
            pstm.setString(2, objLivroDTO.getAutor());
            pstm.setString(3, objLivroDTO.getTitulo());
            pstm.setInt(4, objLivroDTO.getQnt_disponivel());
            pstm.setInt(5, objLivroDTO.getId_livro());
            pstm.executeUpdate();
            JOptionPane.showMessageDialog(null, "Livro alterado com sucesso.");
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Livro DAO - editarlivro(): " + erro);
        } finally {
            closeResources(conn, pstm);
        }
    }

    public void excludelivro(LivroDTO objLivroDTO) {
        String sql = "delete from livro where id_livro=?;";

        conn = new ConexaoDAO().conectaBD();
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setInt(1, objLivroDTO.getId_livro());
            pstm.execute();
            JOptionPane.showMessageDialog(null, "livro excluído com sucesso.");
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "livroDAO - excludelivro():" + erro);
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

    public ArrayList<LivroDTO> listarLivros() {
        String sql = "select * from livro where qnt_disponivel >0 order by titulo";
        conn = new ConexaoDAO().conectaBD();
        try {
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();
            while (rs.next()) {
                LivroDTO objLivroDTO = new LivroDTO();
                objLivroDTO.setId_livro(rs.getInt("id_livro"));
                objLivroDTO.setIsbn(rs.getString("isbn"));
                objLivroDTO.setAutor(rs.getString("autor"));
                objLivroDTO.setTitulo(rs.getString("titulo"));
                objLivroDTO.setQnt_disponivel(rs.getInt("qnt_disponivel"));
                bookList.add(objLivroDTO);
            }
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "LivroDAO - listarLivros(): " + erro);
        } finally {
            closeResources(conn, pstm);
        }
        return bookList;
    }

    public LivroDTO pesquisarLivroISBN(String isbn) {
        LivroDTO livro = null;
        String sql = "select * from livro where isbn=?";
        conn = new ConexaoDAO().conectaBD();
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, isbn);
            ResultSet rs = pstm.executeQuery();
            if (rs.next()) {
                livro = new LivroDTO();
                livro.setId_livro(rs.getInt("id_livro"));
                livro.setIsbn(rs.getString("isbn"));
                livro.setAutor(rs.getString("autor"));
                livro.setTitulo(rs.getString("titulo"));
                livro.setQnt_disponivel(rs.getInt("qnt_disponivel"));
            }
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "LivroDAO - pesquisarlivroMatricula(): " + erro);
        } finally {
            closeResources(conn, pstm);
        }
        return livro;
    }

    public LivroDTO pesquisarLivroTitulo(String titulo) {
        LivroDTO livro = null;
        String sql = "select * from livro where titulo=?";
        conn = new ConexaoDAO().conectaBD();
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, titulo);
            ResultSet rs = pstm.executeQuery();
            if (rs.next()) {
                livro = new LivroDTO();
                livro.setId_livro(rs.getInt("id_livro"));
                livro.setIsbn(rs.getString("isbn"));
                livro.setAutor(rs.getString("autor"));
                livro.setTitulo(rs.getString("titulo"));
                livro.setQnt_disponivel(rs.getInt("qnt_disponivel"));
            }
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "LivroDAO - pesquisarlivroMatricula(): " + erro);
        } finally {
            closeResources(conn, pstm);
        }
        return livro;
    }
}
