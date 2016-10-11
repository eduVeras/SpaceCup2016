package SpaceCup.Entity.Entities;

import SpaceCup.Business.Filter.Message;

public class Grupo {
    private int IdGrupo;
    private String NomeGrupo;
    private int IdProjeto;
    private boolean Ativo;
    public boolean getAtivo() {
        return Ativo;
    }
    public void setAtivo(boolean Ativo) {
        this.Ativo = Ativo;
    }
    public Grupo() {

    }
    public Grupo(int IdGrupo, String NomeGrupo, int IdProjeto) {
        this.IdGrupo = IdGrupo;
        this.NomeGrupo = NomeGrupo;
        this.IdProjeto = IdProjeto;
    }
    public int getIdGrupo() {
        return IdGrupo;
    }
    public void setIdGrupo(int IdGrupo) {
        this.IdGrupo = IdGrupo;
    }
    public String getNomeGrupo() {
        return NomeGrupo;
    }
    public void setNomeGrupo(String NomeGrupo) {
        this.NomeGrupo = NomeGrupo;
    }
    public int getIdProjeto() {
        return IdProjeto;
    }
    public void setIdProjeto(int IdProjeto) {
        this.IdProjeto = IdProjeto;
    }
    
    public void IsValid(){
        //Isto é um exemplo de como validar na entidade direto
      Message error =  new Message();
      
        if (NomeGrupo.equalsIgnoreCase("")) {
            error.ErrorMessage("Nome Grupo é obrigatorio");
        }
    }
}