package br.com.treinamento.connection;

import br.com.treinamento.annotation.BancoSTF;

@BancoSTF
public class ConexaoBancoStf implements IConexao{
	
	public void conectar() {
		System.out.println("Conectado banco STF");
	}

}
