package br.com.treinamento.connection;

import br.com.treinamento.annotation.BancoTreinamento;

@BancoTreinamento
public class ConexaoBanco implements IConexao {
	
	public void conectar() {
		System.out.println("Banco comum");
	}

}
