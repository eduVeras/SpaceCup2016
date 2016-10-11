/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SpaceCup.Entity.Entities;

import SpaceCup.Business.Filter.Message;
import java.util.Date;

/**
 *
 * @author Shiftinc-Dev02
 */
public class Turma {

    private int IdTurma;
    private String NomeCurso;
    private Date DataIncio;

    public Turma() {
    }

    public Turma(int IdTurma, String NomeCurso, Date DataIncio) {
        this.IdTurma = IdTurma;
        this.NomeCurso = NomeCurso;
        this.DataIncio = DataIncio;
    }

    public int getIdTurma() {
        return IdTurma;
    }

    public void setIdTurma(int IdTurma) {
        this.IdTurma = IdTurma;
    }

    public String getNomeCurso() {
        return NomeCurso;
    }

    public void setNomeCurso(String NomeCurso) {
        this.NomeCurso = NomeCurso;
    }

    public Date getDataIncio() {
        return DataIncio;
    }

    public void setDataIncio(Date DataIncio) {
        this.DataIncio = DataIncio;
    }
    
    public void IsValid(){
      Message error =  new Message();
      
        if (this.NomeCurso.isEmpty()) {
            error.ErrorMessage("Turma - nome do curso não informado");
        }
    }

}
