/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SpaceCup.Entity.Entities;

import java.sql.Date;

/**
 *
 * @author Shiftinc-Dev02
 */
public class Projeto {

    private int IdProjeto;
    private String NomeProjeto;
    private Grupo IdGrupo;
    private Date DataInicio;
    private Date DataEntrega;
    private String DetalhesProjeto;

    public Projeto(int IdProjeto, String NomeProjeto, Grupo IdGrupo, Date DataInicio, Date DataEntrega, String DetalhesProjeto) {
        this.IdProjeto = IdProjeto;
        this.NomeProjeto = NomeProjeto;
        this.IdGrupo = IdGrupo;
        this.DataInicio = DataInicio;
        this.DataEntrega = DataEntrega;
        this.DetalhesProjeto = DetalhesProjeto;
    }

    public Projeto() {
    }

    public int getIdProjeto() {
        return IdProjeto;
    }

    public void setIdProjeto(int IdProjeto) {
        this.IdProjeto = IdProjeto;
    }

    public String getNomeProjeto() {
        return NomeProjeto;
    }

    public void setNomeProjeto(String NomeProjeto) {
        this.NomeProjeto = NomeProjeto;
    }

    public Grupo getIdGrupo() {
        return IdGrupo;
    }

    public void setIdGrupo(Grupo IdGrupo) {
        this.IdGrupo = IdGrupo;
    }

    public Date getDataInicio() {
        return DataInicio;
    }

    public void setDataInicio(Date DataInicio) {
        this.DataInicio = DataInicio;
    }

    public Date getDataEntrega() {
        return DataEntrega;
    }

    public void setDataEntrega(Date DataEntrega) {
        this.DataEntrega = DataEntrega;
    }

    public String getDetalhesProjeto() {
        return DetalhesProjeto;
    }

    public void setDetalhesProjeto(String DetalhesProjeto) {
        this.DetalhesProjeto = DetalhesProjeto;
    }

}
