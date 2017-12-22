package br.com.treinamento.service;

import javax.inject.Inject;

import br.com.treinamento.dao.PessoaDAO;

public class PessoaService {
	
	@Inject
	private PessoaDAO pessoaDAO;
	
	public String buscar() {
		return this.pessoaDAO.buscar();
	}

}
