
package SpaceCup.Entity.Interfaces;

import SpaceCup.Entity.Entities.Lancamento;
import java.util.ArrayList;

public interface ILancamentoRepository {

    ArrayList<Lancamento> BuscarTodos();

    Lancamento BuscarPorId(int id);

    Lancamento BuscarPorId(Lancamento lancamento);

    void InsereLancamento(Lancamento lancamento);

    void AtualizaLancamento(Lancamento lancamento);

    void DeletaLancamento(Lancamento lancamento);

}
