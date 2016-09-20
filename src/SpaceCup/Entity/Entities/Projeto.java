/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SpaceCup.Entity.Entities;

import java.sql.Date;

public class Projeto {

    private int IdProjeto;
    private String NomeProjeto;
    private Date DataInicio;
    private Date DataEntrega;
    private String DetalhesProjeto;

    public Projeto() {
    }

    public Projeto(int IdProjeto) {
        this.IdProjeto = IdProjeto;
    }

    public Projeto(int IdProjeto, String NomeProjeto, Date DataInicio, Date DataEntrega, String DetalhesProjeto) {
        this.IdProjeto = IdProjeto;
        this.NomeProjeto = NomeProjeto;
        this.DataInicio = DataInicio;
        this.DataEntrega = DataEntrega;
        this.DetalhesProjeto = DetalhesProjeto;
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
