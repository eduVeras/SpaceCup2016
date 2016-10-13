package SpaceCup.Business.Repositories;
import SpaceCup.Business.Connection;
import SpaceCup.Business.Filter.Message;
import SpaceCup.Entity.Entities.Grupo;
import SpaceCup.Entity.Interfaces.IGrupoRepository;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class GrupoRepository extends Message implements IGrupoRepository {
    private static java.sql.Connection conexao;
    
    @Override
    public void Insert(Grupo obj) {
         String sql = "INSERT INTO GRUPO (NomeGrupo,IDProjeto,Ativo)"
                + "VALUES(?,?,?,?)";
        conexao = Connection.getConnection();
        ResultSet rs = null;
        PreparedStatement ps = null;

        try {

            ps = conexao.prepareStatement(sql);
            ps.setString(1, obj.getNomeGrupo());
            ps.setInt(2, obj.getIdProjeto());
            ps.setBoolean(3, obj.getAtivo());
            ps.execute();

        } catch (SQLException e) {
            ErrorMessage("Erro ao Inserir grupo.\n" + e);
        }
    }

    @Override
    public Grupo GetById(int id) {
           String sql = "SELECT * "
                + "FROM GRUPO "
                + "WHERE IDGRUPO = ?";
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
    public Grupo GetGrupo(int idgrupo, String nomegrupo, int idprojeto) {
           
        String sql = "SELECT * "
                + "FROM GRUPO "
                + "WHERE ((IDGRUPO = ?) or nvl(?,0) = 0)"
                + "AND ((NOMEGRUPO = ?) or ? is null)"
                + "AND ((IDPROJETO = ?) or nvl(?,0) = 0)";
        conexao = Connection.getConnection();
        ResultSet rs = null;
        PreparedStatement ps = null;
        Grupo retorno = new Grupo();
        try {

            ps = conexao.prepareStatement(sql);
            ps.setInt(1, idgrupo);
            ps.setString(2,nomegrupo);
            ps.setInt(3, idprojeto);
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
    public void Update(Grupo obj) {
         String sql = "UPDATE GRUPO "
                + "SET NomeGrupo = ? , "
                + "IDProjeto = ? , "
                + "Ativo = ?,"
                 + "where IDGRUPO = ? ";
        conexao = Connection.getConnection();
        ResultSet rs = null;
        PreparedStatement ps = null;

        try {

            ps = conexao.prepareStatement(sql);
            ps.setString(1, obj.getNomeGrupo());
            ps.setInt(2, obj.getIdProjeto());
            ps.setBoolean(3, obj.getAtivo());
            ps.setInt(4, obj.getIdGrupo());
            ps.execute();

        } catch (SQLException e) {
            ErrorMessage("Erro ao Atualizar grupo.\n" + e);
        }
    }

    @Override
    public void Delete(Grupo obj) {
           String sql = "UPDATE Grupo "
                + "Ativo=?"
                + "WHERE IDGrupo = ?";
        conexao = Connection.getConnection();
        ResultSet rs = null;
        PreparedStatement ps = null;
        try {

            ps = conexao.prepareStatement(sql);
            ps.setBoolean(1, obj.getAtivo());
            ps.setInt(2, obj.getIdGrupo());

            ps.execute();

        } catch (SQLException e) {
            ErrorMessage("Erro ao Remover aluno.\n" + e);
        }
    }

    @Override
    public ArrayList<Grupo> GetAll() {
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

   
}
