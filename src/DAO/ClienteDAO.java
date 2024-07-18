package DAO;

import DTO.ClienteDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ClienteDAO {

    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;
    ArrayList<ClienteDTO> clienteList = new ArrayList<>();

    public void cadastrarCliente(ClienteDTO objClienteDTO) {
        String sql = "insert into cliente (matricula, nome, email, cpf) values (?, ?, ?, ?)";
        conn = new ConexaoDAO().conectaBD();
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setInt(1, objClienteDTO.getMatricula());
            pstm.setString(2, objClienteDTO.getNome());
            pstm.setString(3, objClienteDTO.getEmail());
            pstm.setString(4, objClienteDTO.getCpf());
            pstm.execute();
            JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso.");
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Cliente DAO (cadastrarCliente): " + erro);
        } finally {
            closeResources(conn, pstm);
        }
    }

    public void editarCliente(ClienteDTO objClienteDTO) {
        String sql = "update cliente set nome =?, email=?, cpf=? where id_cliente=?";
        conn = new ConexaoDAO().conectaBD();
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objClienteDTO.getNome());
            pstm.setString(2, objClienteDTO.getEmail());
            pstm.setString(3, objClienteDTO.getCpf());
            pstm.setInt(4, objClienteDTO.getId_cliente());
            pstm.executeUpdate();
            JOptionPane.showMessageDialog(null, "Cliente alterado com sucesso.");
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Cliente DAO - editarCliente(): " + erro);
        } finally {
            closeResources(conn, pstm);
        }
    }

    public void excludeCliente(ClienteDTO objClienteDTO) {
        String sql = "delete from cliente where id_cliente=?;";

        conn = new ConexaoDAO().conectaBD();
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setInt(1, objClienteDTO.getId_cliente());
            pstm.execute();
            JOptionPane.showMessageDialog(null, "Cliente excluído com sucesso.");
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "ClienteDAO - excludeCliente():" + erro);
        } finally{
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

    public ArrayList<ClienteDTO> pesquisarCliente() {
        String sql = "select * from cliente order by nome;";
        conn = new ConexaoDAO().conectaBD();
        try {
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();
            while (rs.next()) {
                ClienteDTO objClienteDTO = new ClienteDTO();
                objClienteDTO.setId_cliente(rs.getInt("id_cliente"));
                objClienteDTO.setMatricula(rs.getInt("matricula"));
                objClienteDTO.setNome(rs.getString("nome"));
                objClienteDTO.setEmail(rs.getString("email"));
                objClienteDTO.setCpf(rs.getString("cpf"));
                clienteList.add(objClienteDTO);
            }
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Cliente DAO (pesquisarCliente): " + erro);
        } finally {
            closeResources(conn, pstm);
        }
        return clienteList;
    }

    public ClienteDTO pesquisarClienteMatricula(int matricula) {
        ClienteDTO cliente = null;
        String sql = "select * from cliente where matricula=?";
        conn = new ConexaoDAO().conectaBD();
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setInt(1, matricula);
            ResultSet rs = pstm.executeQuery();
            if (rs.next()) {
                cliente = new ClienteDTO();
                cliente.setId_cliente(rs.getInt("id_cliente"));
                cliente.setMatricula(rs.getInt("matricula"));
                cliente.setNome(rs.getString("nome"));
                cliente.setEmail(rs.getString("email"));
                cliente.setCpf(rs.getString("cpf"));
            }
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "pesquisarClienteMatricula(): " + erro);
        } finally {
            closeResources(conn, pstm);
        }
        return cliente;
    }
}
