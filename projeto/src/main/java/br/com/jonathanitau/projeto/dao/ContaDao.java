package br.com.jonathanitau.projeto.dao;

import org.springframework.data.repository.CrudRepository;

import br.com.jonathanitau.projeto.model.Conta;

/* A função extends amplia as características da classe, o que iremos utilizar para
 enviar ou trazer as informações do banco de dados */

public interface ContaDao extends CrudRepository<Conta,Integer>{

	
}
