/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SpaceCup.Entity.Entities;

import SpaceCup.Business.Filter.Message;

/**
 *
 * @author Shiftinc-Dev02
 */
public class Aluno {

    private int IdAluno;
    private String RmAluno;
    private String NomeAluno;
    Turma Turma;
    Grupo Grupo;
    private String Password;
    private boolean Ativo;

    public Aluno() {

        this.Turma = new Turma();
        this.Grupo = new Grupo();
    }

    public Aluno(int IdAluno, String RmAluno, String NomeAluno, Turma turma, Grupo grupo, String Password,boolean Ativo) {
        this.IdAluno = IdAluno;
        this.RmAluno = RmAluno;
        this.NomeAluno = NomeAluno;
        this.Turma = turma;
        this.Grupo = grupo;
        this.Password = Password;
        this.Ativo = Ativo;
    }

    public Turma getTurma() {
        return Turma;
    }

    public void setTurma(Turma turma) {
        this.Turma = turma;
    }

    public Grupo getGrupo() {
        return Grupo;
    }

    public void setGrupo(Grupo grupo) {
        this.Grupo = grupo;
    }

    public int getIdAluno() {
        return IdAluno;
    }

    public void setIdAluno(int IdAluno) {
        this.IdAluno = IdAluno;
    }

    public String getRmAluno() {
        return RmAluno;
    }

    public void setRmAluno(String RmAluno) {
        this.RmAluno = RmAluno;
    }

    public String getNomeAluno() {
        return NomeAluno;
    }

    public void setNomeAluno(String NomeAluno) {
        this.NomeAluno = NomeAluno;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public boolean getAtivo() {
        return Ativo;
    }

    public void setAtivo(boolean Ativo) {
        this.Ativo = Ativo;
    }
    
    public void IsValid(){
      Message error =  new Message();
      
        if (RmAluno.isEmpty()) 
            error.ErrorMessage("Aluno - Rm não foi preenchido");
        
        if(this.NomeAluno.isEmpty())
            error.ErrorMessage("Aluno - Nome não foi preenchido");
        
        if(this.Password.isEmpty())
            error.ErrorMessage("Aluno - Senha não foi preenchida");
    }
}
