package SpaceCup.Business.Repositories;

import SpaceCup.Entity.Entities.Projeto;
import SpaceCup.Entity.Interfaces.IProjetoRepository;
import java.util.ArrayList;

public class ProjetoRepository implements IProjetoRepository {

    private static java.sql.Connection conexao;

    @Override
    public ArrayList<Projeto> BuscarTodos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Projeto BuscarPorId(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Projeto BuscarPorId(Projeto projeto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void InsereProjeto(Projeto projeto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void AtualizaProjeto(Projeto projeto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void DeletaProjeto(Projeto projeto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
