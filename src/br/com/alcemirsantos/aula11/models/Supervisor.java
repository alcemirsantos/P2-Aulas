package br.com.alcemirsantos.aula11.models;

public class Supervisor extends Empregado{
	private Integer numProblemasIdentificados;
	
	public Supervisor(Integer identificados) {
		this.numProblemasIdentificados = identificados;
	}

	@Override
	public Double getSalario() {
		return salarioBase * (1 + numProblemasIdentificados/100.0);
	}
}