package SpaceCup.Business.Repositories;

import SpaceCup.Business.Connection;
import SpaceCup.Entity.Entities.Turma;
import SpaceCup.Entity.Interfaces.ITurmaRepository;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import SpaceCup.Business.Filter.Message;

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
            ps.setDate(2,(java.sql.Date)turma.getDataIncio());
            ps.execute();

        } catch (SQLException e) {
            ErrorMessage("Erro ao Inserir aluno.\n" + e);
        }
        
    }

    @Override
    public void AtualizaTurma(Turma turma) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void DeletaTurma(Turma turma) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
