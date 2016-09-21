package SpaceCup.Business.Repositories;
import SpaceCup.Business.Connection;
import SpaceCup.Business.Filter.Message;
import SpaceCup.Entity.Entities.Aluno;
import SpaceCup.Entity.Interfaces.IAlunoRepository;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
public class AlunoRepository extends Message implements IAlunoRepository {
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
                boolean Ativo = rs.getBoolean(4);

                retorno = new Aluno(0, RmAluno, NomeAluno, null, null, Password, Ativo);

            }

        } catch (SQLException e) {
            ErrorMessage("Erro ao validar aluno.\n" + e);
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
                boolean Ativo = rs.getBoolean(4);
                retorno.add(new Aluno(0, RmAluno, NomeAluno, null, null, Password, Ativo));
            }

        } catch (SQLException e) {
            ErrorMessage("Erro ao Buscar alunos.\n" + e);
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
                boolean Ativo = rs.getBoolean(4);

                retorno = new Aluno(0, RmAluno, NomeAluno, null, null, Password, Ativo);
            }

        } catch (SQLException e) {
            ErrorMessage("Erro ao Buscar alunos.\n" + e);
        }
        return retorno;

    }
    @Override
    public Aluno BuscarPorId(Aluno aluno) {

        String sql = "SELECT * "
                + "FROM ALUNO "
                + "WHERE IdAluno = ?";
        conexao = Connection.getConnection();
        ResultSet rs = null;
        PreparedStatement ps = null;
        Aluno retorno = new Aluno();

        try {

            ps = conexao.prepareStatement(sql);
            ps.setInt(1, aluno.getIdAluno());
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
    public void InsereAluno(Aluno aluno) {

        String sql = "INSERT INTO ALUNO (RM_Aluno,Nome_Aluno,ID_Turma,ID_Grupo,Ativo_Aluno)"
                + "VALUES(?,?,?,?)";
        conexao = Connection.getConnection();
        ResultSet rs = null;
        PreparedStatement ps = null;

        try {

            ps = conexao.prepareStatement(sql);
            ps.setString(1, aluno.getRmAluno());
            ps.setString(2, aluno.getNomeAluno());
            ps.setInt(3, aluno.getTurma().getIdTurma());
            ps.setInt(4, aluno.getGrupo().getIdGrupo());
            ps.setBoolean(5, aluno.getAtivo());
            ps.execute();

        } catch (SQLException e) {
            ErrorMessage("Erro ao Inserir aluno.\n" + e);
        }
    }
    @Override
    public void AtualizaAluno(Aluno aluno) {

        String sql = "UPDATE ALUNO "
                + "SET RM_Aluno = ?,"
                + "Nome_Aluno = ?,"
                + "ID_Turma = ?,"
                + "ID_Grupo = ?,"
                + "Ativo_Aluno=?"
                + "WHERE ID_Aluno = ?";
        conexao = Connection.getConnection();
        ResultSet rs = null;
        PreparedStatement ps = null;
        Aluno retorno = new Aluno();

        try {

            ps = conexao.prepareStatement(sql);
            ps.setString(1, aluno.getRmAluno());
            ps.setString(2, aluno.getNomeAluno());
            ps.setInt(3, aluno.getTurma().getIdTurma());
            ps.setInt(4, aluno.getGrupo().getIdGrupo());
            ps.setBoolean(5, aluno.getAtivo());
            ps.setInt(6, aluno.getIdAluno());

            ps.executeUpdate();

        } catch (SQLException e) {
            ErrorMessage("Erro ao Atualizar aluno.\n" + e);
        }
    }
    @Override
    public void DeletaAluno(Aluno aluno) {

        String sql = "UPDATE ALUNO "
                + "Ativo_Aluno=?"
                + "WHERE ID_Aluno = ?";
        conexao = Connection.getConnection();
        ResultSet rs = null;
        PreparedStatement ps = null;
        try {

            ps = conexao.prepareStatement(sql);
            ps.setBoolean(1, aluno.getAtivo());
            ps.setInt(2, aluno.getIdAluno());

            ps.execute();

        } catch (SQLException e) {
            ErrorMessage("Erro ao Remover aluno.\n" + e);
        }
    }
}
