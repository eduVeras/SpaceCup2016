
package SpaceCup.Entity.Interfaces;

import SpaceCup.Entity.Entities.Turma;
import java.util.ArrayList;


public interface ITurmaRepository {

    ArrayList<Turma> BuscarTodos();

    Turma BuscarPorId(int id);

    Turma BuscarPorId(Turma turma);

    void InsereTurma(Turma turma);

    void AtualizaTurma(Turma turma);

    void DeletaTurma(Turma turma);
}
