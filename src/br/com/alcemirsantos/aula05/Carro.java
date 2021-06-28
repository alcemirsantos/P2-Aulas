package br.com.alcemirsantos.aula05;

public class Carro {
	
	private String nome;
	private String cor;
	private double capacidade;
	
	
	public Carro(String nome, String cor, double capacidade) {
		super();
		this.nome = nome;
		this.cor = cor;
		this.capacidade = capacidade;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getCor() {
		return cor;
	}


	public void setCor(String cor) {
		this.cor = cor;
	}


	public double getCapacidade() {
		return capacidade;
	}


	public void setCapacidade(double capacidade) {
		this.capacidade = capacidade;
	}
	
	

}
