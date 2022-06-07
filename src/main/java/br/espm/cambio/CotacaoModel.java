package br.espm.cambio;

import java.time.LocalDate;
import java.util.Date;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cotacao")

public class CotacaoModel {

    @Id
    @Column(name = "id_cotacao")
    private String idCotacao;

    @Column(name = "id_moeda")
    private String idMoeda;

    @Column(name = "dt_Data")
    private LocalDate dt_Data;
    
    @Column(name = "vr_valor")
    private double valor;

    

    public CotacaoModel() {

    }
    public CotacaoModel(Cotacao cotacao) 
    {
        this.idCotacao = cotacao.getId().toString();
        this.idMoeda = cotacao.getIdMoeda().toString();
        this.dt_Data = cotacao.getData();
        this.valor=cotacao.getValor();
    }

    public Cotacao to() 
    {
        Cotacao cotacao = new Cotacao();
        cotacao.setId(UUID.fromString(this.idCotacao));
        cotacao.setIdMoeda(UUID.fromString(this.idMoeda));
        cotacao.setValor(this.valor);
        cotacao.setData(this.dt_Data);
        return cotacao;
    }
    
}