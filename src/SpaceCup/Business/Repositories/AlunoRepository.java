package SpaceCup.Business.Repositories;

import SpaceCup.Business.Connection;
import SpaceCup.Entity.Entities.Aluno;
import SpaceCup.Entity.Interfaces.IAlunoRepository;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

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
            ps.setString(1, aluno.getRmAluno());
            ps.setString(2, aluno.getPassword());
            rs = ps.executeQuery();

            while (rs.next()) {
                String RmAluno = rs.getString(1);
                String NomeAluno = rs.getString(2);
                String Password = rs.getString(3);

                retorno = new Aluno(0, RmAluno, NomeAluno, null, null, Password);

            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao validar aluno.\nErro: " + e);
        }
        return retorno;
    }

    @Override
    public ArrayList<Aluno> BuscarTodos() {

        String sql = "SELECT * "
                + "FROM ALUNO ";
        conexao = Connection.getConnection();
        ResultSet rs = null;
        PreparedStatement ps = null;
        ArrayList<Aluno> retorno = new ArrayList<>();

        try {

            ps = conexao.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                String RmAluno = rs.getString(1);
                String NomeAluno = rs.getString(2);
                String Password = rs.getString(3);
                retorno.add(new Aluno(0, RmAluno, NomeAluno, null, null, Password));
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao Buscar alunos.\nErro: " + e);
        }
        return retorno;

    }

    @Override
    public Aluno BuscarPorId(int id) {
       
        String sql = "SELECT * "
                + "FROM ALUNO "
                + "WHERE IdAluno = ?";
        conexao = Connection.getConnection();
        ResultSet rs = null;
        PreparedStatement ps = null;
        Aluno retorno = new Aluno();

        try {

            ps = conexao.prepareStatement(sql);
            ps.setInt(1, id);
            rs = ps.executeQuery();

            while (rs.next()) {
                String RmAluno = rs.getString(1);
                String NomeAluno = rs.getString(2);
                String Password = rs.getString(3);
                retorno = new Aluno(0, RmAluno, NomeAluno, null, null, Password);
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao Buscar alunos.\nErro: " + e);
        }
        return retorno;
        
    }

    @Override
    public Aluno BuscarPorId(Aluno aluno) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void InsereAluno(Aluno aluno) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void AtualizaAluno(Aluno aluno) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void DeletaAluno(Aluno aluno) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
