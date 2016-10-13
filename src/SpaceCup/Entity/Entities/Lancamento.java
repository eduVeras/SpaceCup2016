/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SpaceCup.Entity.Entities;

import SpaceCup.Business.Filter.Message;
import java.sql.Date;

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
    private Double PesoFoguete;
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

    public Lancamento(int IdLancamento) {
        this.IdLancamento = IdLancamento;
    }

    public Lancamento(int IdLancamento, Date DataLancamento, Grupo Grupo, Double DistanciaLancamento, Double Angulolancamento, Double VelocidadeVento, Double PesoFoguete, Double AltitudeMaxima, Double VelocidadeMaxima, Double TempoPropulsao, Double PicoAceleracao, Double AceleracaoMedia, Double TempoApogeuDescida, Double TempoEjecao, Double AltitudeEjecao, Double TaxaDescida, Double Duracaovoo, Projeto Projeto) {
        this.IdLancamento = IdLancamento;
        this.DataLancamento = DataLancamento;
        this.Grupo = Grupo;
        this.DistanciaLancamento = DistanciaLancamento;
        this.Angulolancamento = Angulolancamento;
        this.VelocidadeVento = VelocidadeVento;
        this.PesoFoguete = PesoFoguete;
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

    public Double getPesoFoguete() {
        return PesoFoguete;
    }

    public void setPesoFoguete(Double PesoFoguete) {
        this.PesoFoguete = PesoFoguete;
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

    public void IsValid() throws Exception {
        Message error = new Message();

        if (this.DistanciaLancamento.isNaN()) {
            throw new Exception("Lançamento - Distancia do lançamento inválida.");
        }

        if (this.Angulolancamento.isNaN()) {
            throw new Exception("Lançamento - Lançamento inválida.");
        }

        if (this.VelocidadeVento.isNaN()) {
            throw new Exception("Lançamento - Velocidade do lançamento inválida.");
        }
        if (this.PesoFoguete.isNaN()) {
            throw new Exception("Lançamento - Peso do Foquete inválida.");
        }
        if (this.TempoPropulsao.isNaN()) {
            throw new Exception("Lançamento - Tempo de propulsão do lançamento inválida.");
        }
        if (this.VelocidadeMaxima.isNaN()) {
            throw new Exception("Lançamento - Velocidade Maxima do lançamento inválida.");
        }
        if (this.PicoAceleracao.isNaN()) {
            throw new Exception("Lançamento - Pico aceleração do lançamento inválida.");
        }
        if (this.AceleracaoMedia.isNaN()) {
            throw new Exception("Lançamento - Aceleracao media do lançamento inválida.");
        }
        if (this.TempoApogeuDescida.isNaN()) {
            throw new Exception("Lançamento - Tempo Apogeu Descida do lançamento inválida.");
        }
        if (this.TempoEjecao.isNaN()) {
            throw new Exception("Lançamento - Tempo ejeção do lançamento inválida.");
        }
        if (this.AltitudeEjecao.isNaN()) {
            throw new Exception("Lançamento - Altitude ejção do lançamento inválida.");
        }
        if (this.TaxaDescida.isNaN()) {
            throw new Exception("Lançamento - Taxa de descida inválida.");
        }
        if (this.Duracaovoo.isNaN()) {
            throw new Exception("Lançamento - Duraçã do voo inválida.");
        }
    }
}
