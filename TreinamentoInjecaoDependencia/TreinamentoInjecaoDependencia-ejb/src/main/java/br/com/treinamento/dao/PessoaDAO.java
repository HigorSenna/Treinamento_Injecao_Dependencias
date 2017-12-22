package br.com.treinamento.dao;

import javax.inject.Inject;

import br.com.treinamento.connection.ConexaoBanco;

public class PessoaDAO {
	
	@Inject
	private ConexaoBanco conexaoBanco;
	
	public String buscar() {
		this.conexaoBanco.conectar();
		System.out.println("SELECT * FROM Pessoas ");
		return "SELECT * FROM Pessoas ";
	}
}
