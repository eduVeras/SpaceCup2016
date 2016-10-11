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
public class Lancamento {

    private int IdLancamento;
    private Date DataLancamento;
    private Grupo Grupo;
    private Double DistanciaLancamento;
    private Double Angulolancamento;
    private Double VelocidadeVento;
    private Double PesoFoquete;
    private Double AltitudeMaxima;
    private Double VelocidadeMaxima;
    private Double TempoPropulsao;
    private Double PicoAceleracao;
    private Double AceleracaoMedia;
    private Double TempoApogeuDescida;
    private Double TempoEjecao;
    private Double AltitudeEjecao;
    private Double TaxaDescida;
    private Double Duracaovoo;
    private Projeto Projeto;

    

    public Lancamento() {
    }

    public Lancamento(int IdLancamento, Date DataLancamento, Grupo Grupo, Double DistanciaLancamento, Double Angulolancamento, Double VelocidadeVento, Double PesoFoquete, Double AltitudeMaxima, Double VelocidadeMaxima, Double TempoPropulsao, Double PicoAceleracao, Double AceleracaoMedia, Double TempoApogeuDescida, Double TempoEjecao, Double AltitudeEjecao, Double TaxaDescida, Double Duracaovoo, Projeto Projeto) {
        this.IdLancamento = IdLancamento;
        this.DataLancamento = DataLancamento;
        this.Grupo = Grupo;
        this.DistanciaLancamento = DistanciaLancamento;
        this.Angulolancamento = Angulolancamento;
        this.VelocidadeVento = VelocidadeVento;
        this.PesoFoquete = PesoFoquete;
        this.AltitudeMaxima = AltitudeMaxima;
        this.VelocidadeMaxima = VelocidadeMaxima;
        this.TempoPropulsao = TempoPropulsao;
        this.PicoAceleracao = PicoAceleracao;
        this.AceleracaoMedia = AceleracaoMedia;
        this.TempoApogeuDescida = TempoApogeuDescida;
        this.TempoEjecao = TempoEjecao;
        this.AltitudeEjecao = AltitudeEjecao;
        this.TaxaDescida = TaxaDescida;
        this.Duracaovoo = Duracaovoo;
        this.Projeto = Projeto;
    }

    public int getIdLancamento() {
        return IdLancamento;
    }

    public void setIdLancamento(int IdLancamento) {
        this.IdLancamento = IdLancamento;
    }

    public Date getDataLancamento() {
        return DataLancamento;
    }

    public void setDataLancamento(Date DataLancamento) {
        this.DataLancamento = DataLancamento;
    }

    public Grupo getGrupo() {
        return Grupo;
    }

    public void setGrupo(Grupo Grupo) {
        this.Grupo = Grupo;
    }

    public Double getDistanciaLancamento() {
        return DistanciaLancamento;
    }

    public void setDistanciaLancamento(Double DistanciaLancamento) {
        this.DistanciaLancamento = DistanciaLancamento;
    }

    public Double getAngulolancamento() {
        return Angulolancamento;
    }

    public void setAngulolancamento(Double Angulolancamento) {
        this.Angulolancamento = Angulolancamento;
    }

    public Double getVelocidadeVento() {
        return VelocidadeVento;
    }

    public void setVelocidadeVento(Double VelocidadeVento) {
        this.VelocidadeVento = VelocidadeVento;
    }

    public Double getPesoFoquete() {
        return PesoFoquete;
    }

    public void setPesoFoquete(Double PesoFoquete) {
        this.PesoFoquete = PesoFoquete;
    }

    public Double getAltitudeMaxima() {
        return AltitudeMaxima;
    }

    public void setAltitudeMaxima(Double AltitudeMaxima) {
        this.AltitudeMaxima = AltitudeMaxima;
    }

    public Double getVelocidadeMaxima() {
        return VelocidadeMaxima;
    }

    public void setVelocidadeMaxima(Double VelocidadeMaxima) {
        this.VelocidadeMaxima = VelocidadeMaxima;
    }

    public Double getTempoPropulsao() {
        return TempoPropulsao;
    }

    public void setTempoPropulsao(Double TempoPropulsao) {
        this.TempoPropulsao = TempoPropulsao;
    }

    public Double getPicoAceleracao() {
        return PicoAceleracao;
    }

    public void setPicoAceleracao(Double PicoAceleracao) {
        this.PicoAceleracao = PicoAceleracao;
    }

    public Double getAceleracaoMedia() {
        return AceleracaoMedia;
    }

    public void setAceleracaoMedia(Double AceleracaoMedia) {
        this.AceleracaoMedia = AceleracaoMedia;
    }

    public Double getTempoApogeuDescida() {
        return TempoApogeuDescida;
    }

    public void setTempoApogeuDescida(Double TempoApogeuDescida) {
        this.TempoApogeuDescida = TempoApogeuDescida;
    }

    public Double getTempoEjecao() {
        return TempoEjecao;
    }

    public void setTempoEjecao(Double TempoEjecao) {
        this.TempoEjecao = TempoEjecao;
    }

    public Double getAltitudeEjecao() {
        return AltitudeEjecao;
    }

    public void setAltitudeEjecao(Double AltitudeEjecao) {
        this.AltitudeEjecao = AltitudeEjecao;
    }

    public Double getTaxaDescida() {
        return TaxaDescida;
    }

    public void setTaxaDescida(Double TaxaDescida) {
        this.TaxaDescida = TaxaDescida;
    }

    public Double getDuracaovoo() {
        return Duracaovoo;
    }

    public void setDuracaovoo(Double Duracaovoo) {
        this.Duracaovoo = Duracaovoo;
    }

    public Projeto getProjeto() {
        return Projeto;
    }

    public void setProjeto(Projeto Projeto) {
        this.Projeto = Projeto;
    }
    
    public void IsValid() {
        Message error = new Message();

        if (this.DistanciaLancamento.isNaN()) {
            error.ErrorMessage("Lançamento - Distancia do lançamento inválida.");
        }

        if (this.Angulolancamento.isNaN()) {
            error.ErrorMessage("Lançamento - Lançamento inválida.");
        }

        if (this.VelocidadeVento.isNaN()) {
            error.ErrorMessage("Lançamento - Velocidade do lançamento inválida.");
        }
        if (this.PesoFoquete.isNaN()) {
            error.ErrorMessage("Lançamento - Peso do Foquete inválida.");
        }
        if (this.TempoPropulsao.isNaN()) {
            error.ErrorMessage("Lançamento - Tempo de propulsão do lançamento inválida.");
        }
        if (this.VelocidadeMaxima.isNaN()) {
            error.ErrorMessage("Lançamento - Velocidade Maxima do lançamento inválida.");
        }
        if (this.PicoAceleracao.isNaN()) {
            error.ErrorMessage("Lançamento - Pico aceleração do lançamento inválida.");
        }
        if (this.AceleracaoMedia.isNaN()) {
            error.ErrorMessage("Lançamento - Aceleracao media do lançamento inválida.");
        }
        if (this.TempoApogeuDescida.isNaN()) {
            error.ErrorMessage("Lançamento - Tempo Apogeu Descida do lançamento inválida.");
        }
        if (this.TempoEjecao.isNaN()) {
            error.ErrorMessage("Lançamento - Tempo ejeção do lançamento inválida.");
        }
        if (this.AltitudeEjecao.isNaN()) {
            error.ErrorMessage("Lançamento - Altitude ejção do lançamento inválida.");
        }
        if (this.TaxaDescida.isNaN()) {
            error.ErrorMessage("Lançamento - Taxa de descida inválida.");
        }
        if (this.Duracaovoo.isNaN()) {
            error.ErrorMessage("Lançamento - Duraçã do voo inválida.");
        }
    }
}
