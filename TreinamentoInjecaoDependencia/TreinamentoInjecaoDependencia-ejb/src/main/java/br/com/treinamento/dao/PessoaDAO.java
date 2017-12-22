package br.com.treinamento.dao;

import javax.enterprise.inject.Produces;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.treinamento.annotation.BancoTreinamento;
import br.com.treinamento.connection.IConexao;
@Named
public class PessoaDAO {
	
	@Inject
	@BancoTreinamento
	private IConexao conexao;
	
	private String a;
	
//	@Inject
//	public PessoaDAO(PessoaFisicaDAO pessoaFisicaDAO,PessoaFisicaDAO pfDAO) {
//		pessoaFisicaDAO.buscar();
//		pfDAO.buscar();
//	}
	
//	public PessoaDAO() {
//	}
	
	public String buscar() {
		this.conexao.conectar();
		System.out.println("SELECT * FROM Pessoas ");
		return "SELECT * FROM Pessoas ";
	}
	
	@Produces
	@Named("produtorInject")
	public PessoaDAO produzir() {
		a = "Produzida";
		System.out.println(a);
		return this;
	}
}
