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
                Projeto proj=  new Projeto(IdProjeto);
                retorno.add(new Grupo(IdGrupo,NomeGrupo,proj));
            }

        } catch (SQLException e) {
            ErrorMessage( "Erro ao Buscar grupos.\nErro: " + e);
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
                Projeto proj=  new Projeto(IdProjeto);
                retorno = new Grupo(IdGrupo,NomeGrupo,proj);
            }

        } catch (SQLException e) {
            ErrorMessage( "Erro ao Buscar grupo.\nErro: " + e);
        }
        return retorno;
    }

    @Override
    public Grupo BuscarPorId(Grupo aluno) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void InsereGrupo(Grupo aluno) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void AtualizaGrupo(Grupo aluno) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void DeletaGrupo(Grupo aluno) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
