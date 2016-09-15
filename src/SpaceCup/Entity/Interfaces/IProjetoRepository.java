package SpaceCup.Entity.Interfaces;

import SpaceCup.Entity.Entities.Projeto;
import java.util.ArrayList;

public interface IProjetoRepository {

    ArrayList<Projeto> BuscarTodos();

    Projeto BuscarPorId(int id);

    Projeto BuscarPorId(Projeto projeto);

    void InsereProjeto(Projeto projeto);

    void AtualizaProjeto(Projeto projeto);

    void DeletaProjeto(Projeto projeto);
}
