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
    public void Insert(Turma obj) {
        String sql = "INSERT INTO Turma (NomeCurso,DataIncio)"
                + "VALUES(?,?)";
        conexao = Connection.getConnection();
        ResultSet rs = null;
        PreparedStatement ps = null;

        try {
            ps = conexao.prepareStatement(sql);
            ps.setString(1, obj.getNomeCurso());
            ps.setDate(2, (java.sql.Date) obj.getDataIncio());
            ps.execute();

        } catch (SQLException e) {
            ErrorMessage("Erro ao Inserir turma.\n" + e);
        }
    }

    @Override
    public Turma GetById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Update(Turma obj) {
        String sql = "UPDATE Turma "
                + "SET NomeCurso = ?,"
                + "DataInicio = ?,"
                + "WHERE IdTurma = ?";
        conexao = Connection.getConnection();
        ResultSet rs = null;
        PreparedStatement ps = null;
        Aluno retorno = new Aluno();

        try {
            java.sql.Date date = (java.sql.Date) obj.getDataIncio();
            ps = conexao.prepareStatement(sql);
            ps.setString(1, obj.getNomeCurso());
            ps.setDate(2, date);
            ps.setInt(3, obj.getIdTurma());
            ps.executeUpdate();

        } catch (SQLException e) {
            ErrorMessage("Erro ao Atualizar Turma.\n" + e);
        }
    }

    @Override
    public void Delete(Turma obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Turma> GetAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
