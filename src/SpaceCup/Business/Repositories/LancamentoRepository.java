package SpaceCup.Business.Repositories;

import SpaceCup.Business.Connection;
import SpaceCup.Business.Filter.Message;
import SpaceCup.Entity.Entities.*;
import SpaceCup.Entity.Interfaces.ILancamentoRepository;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LancamentoRepository extends Message implements ILancamentoRepository {

    private static java.sql.Connection conexao;

    @Override
    public void Insert(Lancamento obj) {
        String sql = "INSERT INTO LANCAMENTO (IdLancamento,DataLancamento,Grupo,DistanciaLancamento,"
                + "AnguloLancamento,VelocidadeVento,PesoFoguete,AltitudeMaxima ,VelocidadeMaxima ,"
                + "TempoPropulsao ,PicoAceleracao ,TempoApogeuDescida,TempoEjecao,AltitudeEjecao,"
                + "TaxaDescida,DuracaoVoo,Projeto_IdProjeto,AceleracaoMedia)"
                + "VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        conexao = Connection.getConnection();
        ResultSet rs = null;
        PreparedStatement ps = null;

        try {

            ps = conexao.prepareStatement(sql);
            ps.setInt(1, obj.getIdLancamento());
            ps.setDate(2, obj.getDataLancamento());
            ps.setInt(3, obj.getGrupo().getIdGrupo());
            ps.setDouble(4, obj.getDistanciaLancamento());
            ps.setDouble(5, obj.getAngulolancamento());
            ps.setDouble(6, obj.getVelocidadeVento());
            ps.setDouble(7, obj.getPesoFoguete());
            ps.setDouble(8, obj.getAltitudeMaxima());
            ps.setDouble(9, obj.getVelocidadeMaxima());
            ps.setDouble(10, obj.getTempoPropulsao());
            ps.setDouble(11, obj.getPicoAceleracao());
            ps.setDouble(12, obj.getTempoApogeuDescida());
            ps.setDouble(13, obj.getTempoEjecao());
            ps.setDouble(14, obj.getAltitudeEjecao());
            ps.setDouble(15, obj.getTaxaDescida());
            ps.setDouble(16, obj.getDuracaovoo());
            ps.setInt(17, obj.getProjeto().getIdProjeto());
            ps.setDouble(18, obj.getAceleracaoMedia());
            ps.execute();

        } catch (SQLException e) {
            ErrorMessage("Erro ao Inserir lançamento.\n" + e);
        }
    }

    @Override
    public Lancamento GetById(int id) {
        String sql = "SELECT * "
                + "FROM LANCAMENTO "
                + "WHERE IdLancamento = ?";
        conexao = Connection.getConnection();
        ResultSet rs = null;
        PreparedStatement ps = null;
        Lancamento retorno = new Lancamento();
        try {

            ps = conexao.prepareStatement(sql);
            ps.setInt(1, id);
            rs = ps.executeQuery();

            while (rs.next()) {
                retorno.setIdLancamento(rs.getInt("IdLancamento"));
                retorno.setDataLancamento(rs.getDate("DataLancamento"));
                retorno.setGrupo(new GrupoRepository().GetById(rs.getInt("Grupo")));
                retorno.setDistanciaLancamento(rs.getDouble("DistanciaLancamento"));
                retorno.setAngulolancamento(rs.getDouble("AnguloLancamento"));
                retorno.setVelocidadeVento(rs.getDouble("VelocidadeVento"));
                retorno.setPesoFoguete(rs.getDouble("PesoFoguete"));
                retorno.setAltitudeMaxima(rs.getDouble("AltitudeMaxima"));
                retorno.setVelocidadeMaxima(rs.getDouble("VelocidadeMaxima"));
                retorno.setTempoPropulsao(rs.getDouble("TempoPropulsao"));
                retorno.setPicoAceleracao(rs.getDouble("PicoAceleracao"));
                retorno.setTempoApogeuDescida(rs.getDouble("TempoApogeuDescida"));
                retorno.setTempoEjecao(rs.getDouble("TempoEjecao"));
                retorno.setAltitudeEjecao(rs.getDouble("AltitudeEjecao"));
                retorno.setTaxaDescida(rs.getDouble("TaxaDescida"));
                retorno.setDuracaovoo(rs.getDouble("DuracaoVoo"));
                retorno.setAceleracaoMedia(rs.getDouble("AceleracaoMedia"));
                retorno.setProjeto(new ProjetoRepository().GetById(rs.getInt("Projeto_IdProjeto")));

            }

        } catch (SQLException e) {
            ErrorMessage("Erro ao Buscar grupo.\n" + e);
        }
        return retorno;
    }

    @Override
    public void Update(Lancamento obj) {
        String sql = "UPDATE LANCAMENTO  "
                + "SET Projeto_IdProjeto = ?,"
                + " DataLancamento=?,"
                + " Grupo=?,"
                + " DistanciaLancamento=?,"
                + " AnguloLancamento=?,"
                + " VelocidadeVento=?,"
                + " PesoFoguete=?,"
                + " AltitudeMaxima =?,"
                + " VelocidadeMaxima =?,"
                + " TempoPropulsao =?,"
                + " PicoAceleracao =?,"
                + " TempoApogeuDescida=?,"
                + " TempoEjecao=?,"
                + " AltitudeEjecao=?,"
                + " TaxaDescida=?,"
                + " DuracaoVoo=?,"
                + " AceleracaoMedia = ?"
                + " WHERE IdLancamento = ?";
        conexao = Connection.getConnection();
        ResultSet rs = null;
        PreparedStatement ps = null;
        int x = 9999;
        try {
            obj.IsValid();
            ps = conexao.prepareStatement(sql);
            ps.setInt(1, obj.getProjeto().getIdProjeto());
            ps.setDate(2, (Date) obj.getDataLancamento());
            ps.setInt(3, obj.getGrupo().getIdGrupo());
            ps.setDouble(4, obj.getDistanciaLancamento());
            ps.setDouble(5, obj.getAngulolancamento());
            ps.setDouble(6, obj.getVelocidadeVento());
            ps.setDouble(7, obj.getPesoFoguete());
            ps.setDouble(8, obj.getAltitudeMaxima());
            ps.setDouble(9, obj.getVelocidadeMaxima());
            ps.setDouble(10, obj.getTempoPropulsao());
            ps.setDouble(11, obj.getPicoAceleracao());
            ps.setDouble(12, obj.getTempoApogeuDescida());
            ps.setDouble(13, obj.getTempoEjecao());
            ps.setDouble(14, obj.getAltitudeEjecao());
            ps.setDouble(15, obj.getTaxaDescida());
            ps.setDouble(16, obj.getDuracaovoo());
            ps.setDouble(17, obj.getAceleracaoMedia());
            ps.setInt(18, obj.getIdLancamento());
            ps.execute();

        } catch (SQLException e) {
            ErrorMessage("Erro ao Atualizar Lançamento.\n" + e);
        } catch (Exception ex) {
            Logger.getLogger(LancamentoRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.err.println(x);
    }

    @Override
    public void Delete(Lancamento obj) {
        String sql = "DELETE LANCAMENTO "
                + "WHERE IdLancamento = ?";
        conexao = Connection.getConnection();
        ResultSet rs = null;
        PreparedStatement ps = null;
        try {

            ps = conexao.prepareStatement(sql);
            ps.setInt(1, obj.getIdLancamento());

            ps.execute();

        } catch (SQLException e) {
            ErrorMessage("Erro ao Remover Lançamento.\n" + e);
        }
    }

    @Override
    public ArrayList<Lancamento> GetAll() {
        String sql = "SELECT * FROM LANCAMENTO";
        conexao = Connection.getConnection();
        ResultSet rs = null;
        PreparedStatement ps = null;
        ArrayList<Lancamento> lc = null;
        Lancamento retorno;
        try {

            ps = conexao.prepareStatement(sql);
            rs = ps.executeQuery();
            lc =  new ArrayList<Lancamento>();
            while (rs.next()) {
                retorno = new Lancamento();
                retorno.setIdLancamento(rs.getInt("IdLancamento"));
                retorno.setDataLancamento(rs.getDate("DataLancamento"));
                retorno.setGrupo(new GrupoRepository().GetById(rs.getInt("Grupo")));
                retorno.setDistanciaLancamento(rs.getDouble("DistanciaLancamento"));
                retorno.setAngulolancamento(rs.getDouble("AnguloLancamento"));
                retorno.setVelocidadeVento(rs.getDouble("VelocidadeVento"));
                retorno.setPesoFoguete(rs.getDouble("PesoFoguete"));
                retorno.setAltitudeMaxima(rs.getDouble("AltitudeMaxima"));
                retorno.setVelocidadeMaxima(rs.getDouble("VelocidadeMaxima"));
                retorno.setTempoPropulsao(rs.getDouble("TempoPropulsao"));
                retorno.setPicoAceleracao(rs.getDouble("PicoAceleracao"));
                retorno.setTempoApogeuDescida(rs.getDouble("TempoApogeuDescida"));
                retorno.setTempoEjecao(rs.getDouble("TempoEjecao"));
                retorno.setAltitudeEjecao(rs.getDouble("AltitudeEjecao"));
                retorno.setTaxaDescida(rs.getDouble("TaxaDescida"));
                retorno.setDuracaovoo(rs.getDouble("DuracaoVoo"));
                retorno.setProjeto(new ProjetoRepository().GetById(rs.getInt("Projeto_IdProjeto")));
                lc.add(retorno);
            }

        } catch (SQLException e) {
            ErrorMessage("Erro ao Buscar grupo.\n" + e);
        }
        return lc;
    }     
}
