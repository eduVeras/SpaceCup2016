package SpaceCup.Entity.Interfaces;

import SpaceCup.Entity.Entities.Grupo;
import java.util.ArrayList;


public interface IGrupoRepository {

    ArrayList<Grupo> BuscarTodos();

    Grupo BuscarPorId(int id);

    Grupo BuscarPorId(Grupo grupo);

    void InsereGrupo(Grupo grupo);

    void AtualizaGrupo(Grupo grupo);

    void DeletaGrupo(Grupo grupo);

}
