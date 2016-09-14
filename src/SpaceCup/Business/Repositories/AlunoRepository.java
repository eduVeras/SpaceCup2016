/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SpaceCup.Business.Repositories;

import SpaceCup.Business.Connection;
import SpaceCup.Entity.Entities.Aluno;
import SpaceCup.Entity.Interfaces.IAlunoRepository;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Shiftinc-Dev02
 */
public class AlunoRepository implements IAlunoRepository {

    private static java.sql.Connection conexao;
    
    @Override
    public Aluno ValidarLogin(Aluno aluno) {
        
        String sql = "SELECT * "
                + "FROM ALUNO "
                + "WHERE RM = ? "
                + "AND PASSWORD = ?"
                + "AND ATIVO = 1 ";
        conexao = Connection.getConnection();
        ResultSet rs = null;
        PreparedStatement ps = null;
        Aluno retorno = new Aluno();
        
        try {
            
            ps = conexao.prepareStatement(sql);
            ps.setString(1, aluno.getRM());
            ps.setString(2, aluno.getPassword());
            rs = ps.executeQuery();
            
            while(rs.next()) {
                String  RM     = rs.getString(1);
                String Password  = rs.getString(2);
                
                retorno = new Aluno(RM, Password);
            }
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao validar aluno.\nErro: " + e);
        }
        return retorno;
    }
    
}
