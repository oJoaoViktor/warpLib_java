package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ConexaoDAO {

    public Connection conectaBD() {
        Connection conn = null;
        try {
            String url = "jdbc:mysql://localhost:3307/biblioteca?user=root";  //Não é necessário inserir a porta
            conn = DriverManager.getConnection(url);
        } catch (SQLException error) {
            JOptionPane.showMessageDialog(null, "Erro na classe Conexao: " + error.getMessage());
        }
        return conn;
    }
}
