package DAO;

import DTO.UsuarioDTO;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

public class UsuarioDAO {

    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;

    public ResultSet autenticacaoUsuario(UsuarioDTO objusuariodto) {
        conn = new ConexaoDAO().conectaBD();
        try {
            String sql = "select * from usuario where username = ? and password = ?";
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objusuariodto.getUsername()); //Passa nome do usuário para o primeiro "?"
            pstm.setString(2, objusuariodto.getPassword());
            rs = pstm.executeQuery();
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "UsuarioDAO: " + erro);
            return null;
        } finally {
            return rs;
        }
    }
}
