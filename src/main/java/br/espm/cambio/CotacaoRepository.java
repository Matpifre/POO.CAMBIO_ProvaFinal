package br.espm.cambio;

import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface CotacaoRepository extends CrudRepository<CotacaoModel, String>{
    
    @Override
    Iterable<CotacaoModel> findAll();

    @Override
    Optional<CotacaoModel> findById(String s);

    // JQL Java querry language
    @Query("SELECT c from CotacaoModel c WHERE idMoeda = (SELECT idMoeda from MoedaModel WHERE UPPER(txSimbolo) = UPPER(:simbolo))")
    Iterable<CotacaoModel> findBySimbolo(@Param("simbolo") String simbolo);

}