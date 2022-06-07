package br.espm.cambio;

import java.time.LocalDate;
import java.util.Date;
import java.util.UUID;

public class Cotacao {
    
    private UUID id;
    private UUID idMoeda;
    private LocalDate dt_Data;
    private double Valor;

    public Cotacao(){
    }

    public Cotacao(Double Valor){
        this.Valor = Valor;
    }
    
    public UUID getId() 
    {
        return id;
    }
    public void setId(UUID id) 
    {
        this.id = id;
    }

    public LocalDate getData() 
    {
        return dt_Data;
    }
    public void setData(LocalDate dt_Data) 
    {
        this.dt_Data = dt_Data;
    }

    public double getValor() 
    {
        return Valor;
    }
    public void setValor(double Valor) 
    {
        this.Valor = Valor;
    }

    public UUID getIdMoeda() 
    {
        return idMoeda;
    }
    public void setIdMoeda(UUID idMoeda) 
    {
        this.idMoeda = idMoeda;
    }
   
 
}