package br.com.treinamento.service;

import javax.inject.Inject;
import javax.inject.Named;

import br.com.treinamento.dao.PessoaDAO;

public class PessoaService {
	
	@Inject
	@Named("produtorInject")
	private PessoaDAO pessoaDAO;
	
	public String buscar() {
		return this.pessoaDAO.buscar();
	}

}
