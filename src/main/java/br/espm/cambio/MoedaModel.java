package br.espm.cambio;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Moeda")
public class MoedaModel {

    @Id
    @Column(name= "id_moeda")
    private String idMoeda;

    @Column(name= "tx_nome")
    private String txNome;
    
    @Column(name= "tx_simbolo")
    private String txSimbolo;

    public MoedaModel(){

    }

    public MoedaModel(Moeda moeda){
        this.idMoeda=moeda.getID().toString();
        this.txNome= moeda.getNome();
        this.txSimbolo = moeda.getSimbolo();
    }

    public Moeda to(){
        Moeda moeda= new Moeda();
        moeda.setID(UUID.fromString(this.idMoeda));
        moeda.setNome(this.txNome);
        moeda.setSimbolo(this.txSimbolo);
        return moeda;
    }
    
}
