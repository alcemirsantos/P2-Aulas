package br.com.alcemirsantos.aula11.models;


public class Gerente extends Empregado{
	private Integer numProblemasResolvidos;
	private Integer qtdeHorasExtras;
	
	public Gerente(Integer pResolvidos, Integer horas) {
		this.numProblemasResolvidos = pResolvidos;
		this.qtdeHorasExtras = horas;
	}

	@Override
	public Double getSalario() {
		return (salarioBase * (1 + numProblemasResolvidos/100.0)) + qtdeHorasExtras;
	}
}