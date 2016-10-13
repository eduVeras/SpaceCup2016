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
import java.sql.Date;

public class TurmaRepository extends Message implements ITurmaRepository {

    private static java.sql.Connection conexao;

    @Override
    public void Insert(Turma obj) {
        String sql = "INSERT INTO Turma (NomeCurso,DataInicio)"
                + "VALUES(?,?)";
        conexao = Connection.getConnection();
        ResultSet rs = null;
        PreparedStatement ps = null;

        try {
            ps = conexao.prepareStatement(sql);
            ps.setString(1, obj.getNomeCurso());
            ps.setDate(2, (java.sql.Date) obj.getDataInicio());
            ps.execute();

        } catch (SQLException e) {
            ErrorMessage("Erro ao Inserir turma.\n" + e);
        }
    }

    public Turma GetByName(Turma turma) {
        String sql = "SELECT * "
                + "FROM TURMA "
                + "WHERE NomeCurso = ?";
        conexao = Connection.getConnection();
        ResultSet rs = null;
        PreparedStatement ps = null;
        Turma retorno = new Turma();

        try {

            ps = conexao.prepareStatement(sql);
            ps.setString(1, turma.getNomeCurso());
            rs = ps.executeQuery();

            while (rs.next()) {
                int IdTurma = rs.getInt(1);
                String NomeCurso = rs.getString(2);
                Date DataIncio = rs.getDate(3);

               retorno = new Turma(IdTurma, NomeCurso, DataIncio);
            }

        } catch (SQLException e) {
            ErrorMessage("Erro ao Buscar alunos.\n" + e);
        }
        return retorno;
    }

    @Override
    public Turma GetById(int id) {
        String sql = "SELECT * "
                + "FROM TURMA "
                + "WHERE IdTurma = ?";
        conexao = Connection.getConnection();
        ResultSet rs = null;
        PreparedStatement ps = null;
        Turma retorno = new Turma();

        try {

            ps = conexao.prepareStatement(sql);
            ps.setInt(1, id);
            rs = ps.executeQuery();

            while (rs.next()) {
                int IdTurma = rs.getInt(1);
                String NomeCurso = rs.getString(2);
                Date DataIncio = rs.getDate(3);

                retorno = new Turma(IdTurma, NomeCurso, DataIncio);
            }

        } catch (SQLException e) {
            ErrorMessage("Erro ao Buscar alunos.\n" + e);
        }
        return retorno;
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
            java.sql.Date date = (java.sql.Date) obj.getDataInicio();
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
        String sql = "DELETE FROM TURMA "
                + "WHERE IdTurma = ?";
        conexao = Connection.getConnection();
        ResultSet rs = null;
        PreparedStatement ps = null;
        try {

            ps = conexao.prepareStatement(sql);
            ps.setInt(1, obj.getIdTurma());
            ps.execute();

        } catch (SQLException e) {
            ErrorMessage("Erro ao Remover Turma.\n" + e);
        }
    }

    @Override
    public ArrayList<Turma> GetAll() {
        String sql = "SELECT * FROM TURMA ";

        conexao = Connection.getConnection();
        ResultSet rs = null;
        PreparedStatement ps = null;
        ArrayList<Turma> retorno = new ArrayList<>();

        try {

            ps = conexao.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                int IdTurma = rs.getInt(1);
                String NomeCurso = rs.getString(2);
                Date DataIncio = rs.getDate(3);

                retorno.add(new Turma(IdTurma, NomeCurso, DataIncio));
            }

        } catch (SQLException e) {
            ErrorMessage("Erro ao Buscar turmas.\n" + e);
        }
        return retorno;
    }

}
