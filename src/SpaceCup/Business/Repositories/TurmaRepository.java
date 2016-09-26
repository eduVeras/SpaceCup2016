package SpaceCup.Business.Repositories;

import SpaceCup.Business.Connection;
import SpaceCup.Entity.Entities.Turma;
import SpaceCup.Entity.Interfaces.ITurmaRepository;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import SpaceCup.Business.Filter.Message;
import SpaceCup.Entity.Entities.Aluno;

public class TurmaRepository extends Message implements ITurmaRepository {

    private static java.sql.Connection conexao;

    @Override
    public ArrayList<Turma> BuscarTodos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Turma BuscarPorId(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Turma BuscarPorId(Turma turma) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void InsereTurma(Turma turma) {

        String sql = "INSERT INTO Turma (NomeCurso,DataIncio)"
                + "VALUES(?,?)";
        conexao = Connection.getConnection();
        ResultSet rs = null;
        PreparedStatement ps = null;

        try {
            ps = conexao.prepareStatement(sql);
            ps.setString(1, turma.getNomeCurso());
            ps.setDate(2, (java.sql.Date) turma.getDataIncio());
            ps.execute();

        } catch (SQLException e) {
            ErrorMessage("Erro ao Inserir aluno.\n" + e);
        }

    }

    @Override
    public void AtualizaTurma(Turma turma) {

        String sql = "UPDATE Turma "
                + "SET NomeCurso = ?,"
                + "DataIncio = ?,"
                + "WHERE ID_Turma = ?";
        conexao = Connection.getConnection();
        ResultSet rs = null;
        PreparedStatement ps = null;
        Aluno retorno = new Aluno();

        try {
            java.sql.Date date = (java.sql.Date) turma.getDataIncio();
            ps = conexao.prepareStatement(sql);
            ps.setString(1, turma.getNomeCurso());
            ps.setDate(2, date);
            ps.setInt(3, turma.getIdTurma());
            ps.executeUpdate();

        } catch (SQLException e) {
            ErrorMessage("Erro ao Atualizar Turma.\n" + e);
        }

    }

    @Override
    public void DeletaTurma(Turma turma) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
