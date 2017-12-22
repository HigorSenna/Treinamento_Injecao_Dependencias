package br.com.treinamento.dao;

import javax.inject.Inject;

import br.com.treinamento.annotation.BancoTreinamento;
import br.com.treinamento.connection.IConexao;

public class PessoaDAO {
	
	@Inject
	@BancoTreinamento
	private IConexao conexao;
	
	public String buscar() {
		this.conexao.conectar();
		System.out.println("SELECT * FROM Pessoas ");
		return "SELECT * FROM Pessoas ";
	}
}
