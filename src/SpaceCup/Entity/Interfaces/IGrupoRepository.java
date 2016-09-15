/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SpaceCup.Entity.Interfaces;

import SpaceCup.Entity.Entities.Grupo;
import java.util.ArrayList;

/**
 *
 * @author Shiftinc-Dev02
 */
public interface IGrupoRepository {
    
    ArrayList<Grupo> BuscarTodos();
    Grupo BuscarPorId(int id);
    Grupo BuscarPorId(Grupo aluno);
    void InsereGrupo(Grupo aluno);
    void AtualizaGrupo(Grupo aluno);
    void DeletaGrupo(Grupo aluno);
    
}
