package DAO;

import DTO.ClienteDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

public class ClienteDAO {

    Connection conn;
    PreparedStatement pstm;

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
            pstm.close();
            JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso.");
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Cliente DAO: " + erro);
        }
    }
}
