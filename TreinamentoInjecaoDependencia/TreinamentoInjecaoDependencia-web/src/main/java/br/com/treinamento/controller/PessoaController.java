package br.com.treinamento.controller;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import br.com.treinamento.service.PessoaService;

@Path("/pessoas")
public class PessoaController {
	
	@Inject
	private PessoaService pessoaService;
	
	@GET
	public String buscar() {
		return this.pessoaService.buscar();
	}
}
