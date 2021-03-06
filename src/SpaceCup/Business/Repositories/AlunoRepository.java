package SpaceCup.Business.Repositories;

import SpaceCup.Business.Connection;
import SpaceCup.Business.Filter.Message;
import SpaceCup.Entity.Entities.Aluno;
import SpaceCup.Entity.Interfaces.IAlunoRepository;
import SpaceCup.Entity.Interfaces.Base.IRepositoryBase;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class AlunoRepository extends Message implements IAlunoRepository{

    private static java.sql.Connection conexao;

    @Override
    public Aluno ValidarLogin(Aluno aluno) {

        String sql = "SELECT * "
                + "FROM ALUNO "
                + "WHERE RMALUNO = ? "
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
                boolean Ativo = rs.getBoolean(4);

                retorno = new Aluno(0, RmAluno, NomeAluno, null, null, Password, Ativo);

            }

        } catch (SQLException e) {
            ErrorMessage("Erro ao validar aluno.\n" + e);
        }
        return retorno;
    }
    @Override
    public void Insert(Aluno obj) {
        
        String sql = "INSERT INTO ALUNO ("
                + "RMALUNO,"
                + "NOMEALUNO,"
                + "IDTurma,"
                + "IDGrupo,"
                + "PASSWORD,"
                + "Ativo)"
                + "VALUES(?,?,?,?,?,?)";
        conexao = Connection.getConnection();
        ResultSet rs = null;
        PreparedStatement ps = null;

        try {

            ps = conexao.prepareStatement(sql);
            ps.setString(1, obj.getRmAluno());
            ps.setString(2, obj.getNomeAluno());
            ps.setInt(3, obj.getTurma().getIdTurma());
            ps.setInt(4, obj.getGrupo().getIdGrupo());
            ps.setString(5,obj.getPassword());
            ps.setBoolean(6, obj.getAtivo());
            ps.execute();

        } catch (SQLException e) {
            ErrorMessage("Erro ao Inserir aluno.\n" + e);
        }
    }
    @Override
    public Aluno GetById(int id) {
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
                boolean Ativo = rs.getBoolean(4);

                retorno = new Aluno(0, RmAluno, NomeAluno, null, null, Password, Ativo);
            }

        } catch (SQLException e) {
            ErrorMessage("Erro ao Buscar alunos.\n" + e);
        }
        return retorno;
    }
    @Override
    public void Update(Aluno obj) {

        String sql = "UPDATE ALUNO "
                + "SET RMAluno = ?,"
                + "NomeAluno = ?,"
                + "IDTurma = ?,"
                + "IDGrupo = ?,"
                + "PASSWORD = ?,"
                + "Ativo=?"
                + "WHERE IDAluno = ?";
        conexao = Connection.getConnection();
        ResultSet rs = null;
        PreparedStatement ps = null;
        Aluno retorno = new Aluno();

        try {

            ps = conexao.prepareStatement(sql);
            ps.setString(1, obj.getRmAluno());
            ps.setString(2, obj.getNomeAluno());
            ps.setInt(3, obj.getTurma().getIdTurma());
            ps.setInt(4, obj.getGrupo().getIdGrupo());
            ps.setString(5,obj.getPassword());
            ps.setBoolean(6, obj.getAtivo());
            ps.setInt(7, obj.getIdAluno());

            ps.executeUpdate();

        } catch (SQLException e) {
            ErrorMessage("Erro ao Atualizar aluno.\n" + e);
        }
    }
    @Override
    public void Delete(Aluno obj) {
        String sql = "UPDATE ALUNO "
                + "Ativo=?"
                + "WHERE IDAluno = ?";
        conexao = Connection.getConnection();
        ResultSet rs = null;
        PreparedStatement ps = null;
        try {

            ps = conexao.prepareStatement(sql);
            ps.setBoolean(1, obj.getAtivo());
            ps.setInt(2, obj.getIdAluno());
            ps.execute();

        } catch (SQLException e) {
            ErrorMessage("Erro ao Remover aluno.\n" + e);
        }
    }
    @Override
    public ArrayList<Aluno> GetAll() {
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
                boolean Ativo = rs.getBoolean(4);
                retorno.add(new Aluno(0, RmAluno, NomeAluno, null, null, Password, Ativo));
            }

        } catch (SQLException e) {
            ErrorMessage("Erro ao Buscar alunos.\n" + e);
        }
        return retorno;
    }
}
