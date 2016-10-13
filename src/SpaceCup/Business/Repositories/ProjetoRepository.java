package SpaceCup.Business.Repositories;

import SpaceCup.Business.Connection;
import SpaceCup.Business.Filter.Message;
import SpaceCup.Entity.Entities.Grupo;
import SpaceCup.Entity.Entities.Projeto;
import SpaceCup.Entity.Entities.Turma;
import SpaceCup.Entity.Interfaces.IProjetoRepository;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ProjetoRepository extends Message implements IProjetoRepository {

    private static java.sql.Connection conexao;

    @Override
    public void Insert(Projeto obj) {
        Message msg = new Message();
        String sql = "INSERT INTO Projeto (NomeProjeto,DataInicio,DataEntrega,DetalhesProjeto,IdGrupo)"
                + "VALUES(?,?,?,?,?)";
        conexao = Connection.getConnection();
        ResultSet rs = null;
        PreparedStatement ps = null;

        try {

            ps = conexao.prepareStatement(sql);
            ps.setString(1, obj.getNomeProjeto());
            ps.setDate(2, obj.getDataInicio());
            ps.setDate(3, obj.getDataEntrega());
            ps.setString(4, obj.getDetalhesProjeto());
            ps.setInt(5, obj.getGrupo().getIdGrupo());
            ps.execute();

        } catch (SQLException e) {
            msg.ErrorMessage("Erro ao Inserir grupo.\n" + e);
        }
    }

    @Override
    public Projeto GetById(int id) {
        Message msg = new Message();
        String sql = "SELECT * "
                + "FROM PROJETO LEFT JOIN GRUPO "
                + "WHERE IdProjeto = ?";
        conexao = Connection.getConnection();
        ResultSet rs = null;
        PreparedStatement ps = null;
        Projeto retorno = new Projeto();
        Grupo Grupo = new Grupo();

        try {

            ps = conexao.prepareStatement(sql);
            ps.setInt(1, id);
            rs = ps.executeQuery();

            while (rs.next()) {
                int IdProjeto = rs.getInt(1);
                String NomeProjeto = rs.getString(2);
                Date DataInicio = rs.getDate(3);
                Date DataEntrega = rs.getDate(4);
                String DetalhesProjeto = rs.getString(5);
                int IdGrupo = rs.getInt(6);
                String NomeGrupo = rs.getString(7);
                boolean Ativo = rs.getBoolean(8);
                Grupo = new Grupo(IdGrupo, NomeGrupo, IdProjeto);
                retorno = new Projeto(IdProjeto, NomeProjeto, DataInicio, DataEntrega, DetalhesProjeto, Grupo);
            }

        } catch (SQLException e) {
            msg.ErrorMessage("Erro ao Buscar projeto.\n" + e);
        }
        return retorno;
    }

    @Override
    public void Update(Projeto obj) {
        Message msg = new Message();

        String sql = "UPDATE PROJETO "
                + "SET NomeProjeto = ?,"
                + "DataInicio = ?,"
                + "DataEntrega = ?,"
                + "DetalhesProjeto = ?,"
                + "WHERE IdProjeto = ?";
        conexao = Connection.getConnection();
        ResultSet rs = null;
        PreparedStatement ps = null;
        Projeto retorno = new Projeto();

        try {
            ps = conexao.prepareStatement(sql);
            ps.setString(1, obj.getNomeProjeto());
            ps.setDate(2, obj.getDataInicio());
            ps.setDate(3, obj.getDataEntrega());
            ps.setString(4, obj.getDetalhesProjeto());
            ps.executeUpdate();

        } catch (SQLException e) {
            msg.ErrorMessage("Erro ao Atualizar Turma.\n" + e);
        }
    }

    @Override
    public void Delete(Projeto obj) {

    }

    @Override
    public ArrayList<Projeto> GetAll() {
         String sql = "SELECT * FROM PROJETO ";

        conexao = Connection.getConnection();
        ResultSet rs = null;
        PreparedStatement ps = null;
        ArrayList<Projeto> retorno = new ArrayList<>();

        try {

            ps = conexao.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                int IdProjeto = rs.getInt(1);
                String NomeProjeto = rs.getString(2);
                int IdGrupo = rs.getInt(3);
                Date DataIncio = rs.getDate(4);
                Date DataEntrega = rs.getDate(5);
                String DetalhesProjeto = rs.getString(6);

                retorno.add(new Projeto(IdProjeto, NomeProjeto, DataIncio, DataEntrega, DetalhesProjeto, new Grupo()));
            }

        } catch (SQLException e) {
            ErrorMessage("Erro ao Buscar turmas.\n" + e);
        }
        return retorno;

        
    }

}
