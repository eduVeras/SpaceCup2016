package SpaceCup.Business.Repositories;

import SpaceCup.Business.Connection;
import SpaceCup.Entity.Entities.Grupo;
import SpaceCup.Entity.Entities.Lancamento;
import SpaceCup.Entity.Interfaces.ILancamentoRepository;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.time.Instant;
import java.util.Date;

public class LancamentoRepository implements ILancamentoRepository {

    private static java.sql.Connection conexao;

    @Override
    public ArrayList<Lancamento> BuscarTodos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Lancamento BuscarPorId(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Lancamento BuscarPorId(Lancamento lancamento) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void InsereLancamento(Lancamento lancamento) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void AtualizaLancamento(Lancamento lancamento) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void DeletaLancamento(Lancamento lancamento) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
