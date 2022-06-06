package br.espm.cambio;

import java.util.UUID;

public class Moeda {

    private UUID ID;
    private String nome;
    private String Simbolo;
    
    public Moeda(){

    }
    public UUID getID() {
        return ID;
    }
    public void setID(UUID iD) {
        ID = iD;
    }
    public Moeda(String nome, String Simbolo){
        this.nome=nome;
        this.Simbolo=Simbolo;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getSimbolo() {
        return Simbolo;
    }
    public void setSimbolo(String simbolo) {
        Simbolo = simbolo;
    }
}
