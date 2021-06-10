package br.com.cellrocket.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import br.com.cellrocket.model.ConsertoCelular;
import br.com.cellrocket.repository.ConsertoCelularRepository;

@Repository
public class ConsertoCelularDao {
	
	@Autowired
	private ConsertoCelularRepository repository;
	
	public void cadastrarConsertoCelular(ConsertoCelular consertoCelular) {
		repository.save(consertoCelular);
	}
}
