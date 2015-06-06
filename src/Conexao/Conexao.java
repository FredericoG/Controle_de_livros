package Conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Frederico
 */
public class Conexao {

    private Connection con;

    public Conexao() {

        try {
            Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
            con = DriverManager.getConnection("jdbc:derby:Frederico", "frederico", "eobr04");

            JOptionPane.showMessageDialog(null, "Conexão aceita.");
        } catch (ClassNotFoundException | SQLException e) {

            JOptionPane.showMessageDialog(null, e.getMessage());

        }
    }
}
