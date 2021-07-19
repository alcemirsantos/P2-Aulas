package br.com.alcemirsantos.aula11.models;

public class Caixa extends Empregado{
	
	private Integer numPessoasAtendidas;
	
	
	/**
	 * @param exemplosAulaOnze
	 */
	public Caixa(Integer numPessoas) {
		this.numPessoasAtendidas = numPessoas;
	}
	
	@Override
	public Double getSalario() {
		return salarioBase * (1 + numPessoasAtendidas/1000.0);
	}
}