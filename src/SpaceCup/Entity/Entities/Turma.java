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
    private Date DataInicio;

    public Turma() {
    }
     public Turma(int IdTurma) {
          this.IdTurma = IdTurma;
    }

    public Turma(int IdTurma, String NomeCurso, Date DataInicio) {
        this.IdTurma = IdTurma;
        this.NomeCurso = NomeCurso;
        this.DataInicio = DataInicio;
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

    public Date getDataInicio() {
        return DataInicio;
    }

    public void setDataInicio(Date DataInicio) {
        this.DataInicio = DataInicio;
    }
    
    public void IsValid() throws Exception{      
        if (this.NomeCurso.isEmpty()) {
            throw new Exception("Turma - nome do curso não informado");
        }
    }

}
