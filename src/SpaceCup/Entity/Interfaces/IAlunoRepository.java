
package SpaceCup.Entity.Interfaces;

import SpaceCup.Entity.Entities.Aluno;
import java.util.ArrayList;

public interface IAlunoRepository {

    Aluno ValidarLogin(Aluno aluno);

    ArrayList<Aluno> BuscarTodos();

    Aluno BuscarPorId(int id);

    Aluno BuscarPorId(Aluno aluno);

    void InsereAluno(Aluno aluno);

    void AtualizaAluno(Aluno aluno);

    void DeletaAluno(Aluno aluno);

}
