package SpaceCup.Entity.Entities;
import SpaceCup.Business.Filter.Message;
import java.sql.Date;
public class Projeto {
    private int IdProjeto;
    private String NomeProjeto;
    private Date DataInicio;
    private Date DataEntrega;
    private String DetalhesProjeto;
    private Grupo Grupo;
    
    
    public Projeto() {
    }
    public Projeto(int IdProjeto) {
        this.IdProjeto = IdProjeto;
    }
    public Projeto(int IdProjeto, String NomeProjeto, Date DataInicio, Date DataEntrega, String DetalhesProjeto,Grupo Grupo) {
        this.IdProjeto = IdProjeto;
        this.NomeProjeto = NomeProjeto;
        this.DataInicio = DataInicio;
        this.DataEntrega = DataEntrega;
        this.DetalhesProjeto = DetalhesProjeto;
        this.Grupo = Grupo;
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
    public Grupo getGrupo() {
        return Grupo;
    }
    public void setGrupo(Grupo Grupo) {
        this.Grupo = Grupo;
    }
    
    public void IsValid() throws Exception{
      Message error =  new Message();
      
        if (this.NomeProjeto.isEmpty()) {
            throw new Exception("Projeto - Nome Projeto é obrigatorio");
        }
        
        if(this.DataEntrega.before(DataInicio))
            throw new Exception("Projeto - Data de entrega invalida.");
        
        if(this.DetalhesProjeto.isEmpty())
            throw new Exception("Projeto - Não foi informado os detalhes do projeto");
        
    }
}
