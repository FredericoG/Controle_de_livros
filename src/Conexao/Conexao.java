package Conexao;

import Interface.Interface;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Frederico
 */
public class Conexao {

    private Connection con;
    private Statement stm;

    public Conexao() {

        try {
            Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
            con = DriverManager.getConnection("jdbc:derby:Frederico", "frederico", "eobr04");

            JOptionPane.showMessageDialog(null, "Conexão aceita.");
        } catch (ClassNotFoundException | SQLException e) {

            JOptionPane.showMessageDialog(null, e.getMessage());

        }
    }

    public void verificausuario(String login, String senha) {

        if (login.equals("") || senha.equals("")) {

            JOptionPane.showMessageDialog(null, "Usuário e senha não podem estar vazio");

        } else {

            //Connection con = null;
            try {
                Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
                con = DriverManager.getConnection("jdbc:derby:Frederico", "frederico", "eobr04");
                String SQL = "Select * from frederico.usuario where login = " + "'login'" + "and senha = " + "'senha'" + ";";
                ResultSet rs = stm.executeQuery(SQL);

                while (rs.next()) {
                    String loginn = rs.getString("loginusuario");
                    String senhaa = rs.getString("senhasenha");
                    String nomee = rs.getString("nomeusuario");

                    if (login.equals(loginn) && senha.equals(senhaa)) {
                        JOptionPane.showMessageDialog(null, "Seja bem vindo: " + nomee, null, JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(null, "Login ou Senha inválidos.", null, JOptionPane.ERROR_MESSAGE);
                    }
                }
            } catch (SQLException e) {
                e.printStackTrace(); //vejamos que erro foi gerado e quem o gerou  
                JOptionPane.showMessageDialog(null, "Erro na conexão, com o banco de dados!", null, JOptionPane.WARNING_MESSAGE);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } finally {
                try {
                    con.close();
                } catch (SQLException onConClose) {
                    //System.out.println("Houve erro no fechamento da conexão");  
                    JOptionPane.showMessageDialog(null, "Erro na conexão, com o banco de dados!", null, JOptionPane.WARNING_MESSAGE);
                    onConClose.printStackTrace();
                }
            } // fim do bloco try-catch-finally  
        }//else do login e senha vazios  
    }

}
