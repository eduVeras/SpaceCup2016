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
    public void Insert(Lancamento obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Lancamento GetById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Update(Lancamento obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Delete(Lancamento obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Lancamento> GetAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
