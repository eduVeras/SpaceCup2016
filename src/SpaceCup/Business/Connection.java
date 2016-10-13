/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SpaceCup.Business;

import com.sun.pisces.JavaSurface;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Shiftinc-Dev02
 */
public class Connection {
    

    private static java.sql.Connection conexao;
    private static String url = "jdbc:oracle:thin:@";
    private static String usuario = "OPS$RM";
    private static String senha = "00000";

    public static java.sql.Connection getConnection() {

        if (conexao == null) {
            try {
                Class.forName("oracle.jdbc.driver.OracleDriver");
                conexao = DriverManager.getConnection(url, usuario, senha);
            } catch (ClassNotFoundException e) {
                JOptionPane.showMessageDialog(null, "Não foi possível carregar o driver de conexão.\n\nErro: " + e);
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Falha ao estabelecer conexão com o banco de dados.\nErro: " + e);
            }
        }
        return conexao;

    }

}
