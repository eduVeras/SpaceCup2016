/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SpaceCup.Entity.Interfaces;

import SpaceCup.Entity.Entities.Aluno;

/**
 *
 * @author Shiftinc-Dev02
 */
public interface IAlunoRepository {
   
    Aluno  ValidarLogin(Aluno aluno);
    
}
