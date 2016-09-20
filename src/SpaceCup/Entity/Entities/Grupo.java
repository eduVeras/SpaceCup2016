/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SpaceCup.Entity.Entities;

/**
 *
 * @author Shiftinc-Dev02
 */
public class Grupo {

    private int IdGrupo;
    private String NomeGrupo;
    private Projeto Projeto;

    public Grupo(){
        
    }
    
    public Grupo(int IdGrupo, String NomeGrupo, Projeto Projeto) {
        this.IdGrupo = IdGrupo;
        this.NomeGrupo = NomeGrupo;
        this.Projeto = Projeto;
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

    public Projeto getProjeto() {
        return Projeto;
    }

    public void setProjeto(Projeto Projeto) {
        this.Projeto = Projeto;
    }

    
}
