package SpaceCup.Business.Repositories;
import SpaceCup.Business.Connection;
import SpaceCup.Business.Filter.Message;
import SpaceCup.Entity.Entities.Grupo;
import SpaceCup.Entity.Entities.Projeto;
import SpaceCup.Entity.Interfaces.IGrupoRepository;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
public class GrupoRepository extends Message implements IGrupoRepository {
    private static java.sql.Connection conexao;
    @Override
    public ArrayList<Grupo> BuscarTodos() {
        String sql = "SELECT * "
                + "FROM GRUPO ";
        conexao = Connection.getConnection();
        ResultSet rs = null;
        PreparedStatement ps = null;
        ArrayList<Grupo> retorno = new ArrayList<>();
        try {

            ps = conexao.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                int IdGrupo = rs.getInt(1);
                String NomeGrupo = rs.getString(2);
                int IdProjeto = rs.getInt(1);
                retorno.add(new Grupo(IdGrupo, NomeGrupo, IdProjeto));
            }

        } catch (SQLException e) {
            ErrorMessage("Erro ao Buscar grupos.\n" + e);
        }
        return retorno;
    }
    @Override
    public Grupo BuscarPorId(int id) {
        String sql = "SELECT * "
                + "FROM GRUPO "
                + "WHERE ID_GRUPO = ?";
        conexao = Connection.getConnection();
        ResultSet rs = null;
        PreparedStatement ps = null;
        Grupo retorno = new Grupo();
        try {

            ps = conexao.prepareStatement(sql);
            ps.setInt(1, id);
            rs = ps.executeQuery();

            while (rs.next()) {
                int IdGrupo = rs.getInt(1);
                String NomeGrupo = rs.getString(2);
                int IdProjeto = rs.getInt(1);
                retorno = new Grupo(IdGrupo, NomeGrupo, IdProjeto);
            }

        } catch (SQLException e) {
            ErrorMessage("Erro ao Buscar grupo.\n" + e);
        }
        return retorno;
    }
    @Override
    public Grupo BuscarPorId(Grupo grupo) {
        String sql = "SELECT * "
                + "FROM GRUPO "
                + "WHERE ID_GRUPO = ?";
        conexao = Connection.getConnection();
        ResultSet rs = null;
        PreparedStatement ps = null;
        Grupo retorno = new Grupo();
        try {

            ps = conexao.prepareStatement(sql);
            ps.setInt(1, grupo.getIdGrupo());
            rs = ps.executeQuery();

            while (rs.next()) {
                int IdGrupo = rs.getInt(1);
                String NomeGrupo = rs.getString(2);
                int IdProjeto = rs.getInt(1);
                retorno = new Grupo(IdGrupo, NomeGrupo, IdProjeto);
            }

        } catch (SQLException e) {
            ErrorMessage("Erro ao Buscar grupo.\n" + e);
        }
        return retorno;
    }
    @Override
    public void InsereGrupo(Grupo grupo) {
        String sql = "INSERT INTO GRUPO (Nome_Grupo,ID_Projeto,Ativo_Grupo)"
                + "VALUES(?,?,?,?)";
        conexao = Connection.getConnection();
        ResultSet rs = null;
        PreparedStatement ps = null;

        try {

            ps = conexao.prepareStatement(sql);
            ps.setString(1, grupo.getNomeGrupo());
            ps.setInt(2, grupo.getIdProjeto());
            ps.setBoolean(3, grupo.getAtivo());
            ps.execute();

        } catch (SQLException e) {
            ErrorMessage("Erro ao Inserir grupo.\n" + e);
        }
    }
    @Override
    public void AtualizaGrupo(Grupo grupo) {
        String sql = "UPDATE GRUPO "
                + "SET Nome_Grupo = ? , "
                + "ID_Projeto = ? , "
                + "Ativo_Grupo = ?, ";
        conexao = Connection.getConnection();
        ResultSet rs = null;
        PreparedStatement ps = null;

        try {

            ps = conexao.prepareStatement(sql);
            ps.setString(1, grupo.getNomeGrupo());
            ps.setInt(2, grupo.getIdProjeto());
            ps.setBoolean(3, grupo.getAtivo());
            ps.execute();

        } catch (SQLException e) {
            ErrorMessage("Erro ao Atualizar grupo.\n" + e);
        }
    }
    @Override
    public void DeletaGrupo(Grupo grupo) {

        String sql = "UPDATE ALUNO "
                + "Ativo_Aluno=?"
                + "WHERE ID_Aluno = ?";
        conexao = Connection.getConnection();
        ResultSet rs = null;
        PreparedStatement ps = null;
        try {

            ps = conexao.prepareStatement(sql);
            ps.setBoolean(1, grupo.getAtivo());
            ps.setInt(2, grupo.getIdGrupo());

            ps.execute();

        } catch (SQLException e) {
            ErrorMessage("Erro ao Remover aluno.\n" + e);
        }
    }
}
