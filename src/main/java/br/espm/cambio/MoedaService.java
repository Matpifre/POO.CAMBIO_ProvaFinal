package br.espm.cambio;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//Esse e o microservico de moeda

@Component
public class MoedaService {

    @Autowired
    private MoedaRepository moedaRepository;

    public List<Moeda> listAll(){
        
        return StreamSupport
            // Trasforma de iteravel para lista
            .stream(moedaRepository.findAll().spliterator(), false)
            .collect(Collectors.toList())
            //Trasforma de Model para Objeto
            .stream().map(MoedaModel::to)
            .collect(Collectors.toList());

    }

    public Moeda create(Moeda vo){
        vo.setID(UUID.randomUUID());
       return moedaRepository.save(new MoedaModel(vo)).to();
    }

    public Moeda findbySibolo(String simbolo){
        return moedaRepository.findyBysimbolo(simbolo)
            .map(MoedaModel::to)
            .orElse(null);

    }
   
    public Moeda findBy(UUID id) {
        return moedaRepository.findById(id.toString())
                    .map(MoedaModel::to)
                    .orElse(null);
    }

    public void delete(String id){
        moedaRepository.deleteById(id);
    }
    
    public void deleteBySimbolo(String simbolo){
        moedaRepository.deleteBySimbolo(simbolo);
    }
    
}
