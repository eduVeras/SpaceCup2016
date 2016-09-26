
package SpaceCup.Entity.Interfaces;

import SpaceCup.Entity.Interfaces.Base.IRepositoryBase;
import SpaceCup.Entity.Entities.Aluno;

public interface IAlunoRepository extends IRepositoryBase<Aluno,Integer>{
    Aluno ValidarLogin(Aluno aluno);
}
