package br.com.alcemirsantos.aula12.q1;

public class Animal {

	protected String nome;
	protected double peso;

	public Animal(String nomeDoAnimal, double pesoDoAnimal) {
		setNome(nomeDoAnimal);
		setPeso(pesoDoAnimal);
	}

	public  void setPeso(double pesoDoAnimal) {
		this.peso = pesoDoAnimal;
	}

	public  void setNome(String nomeDoAnimal) {
		this.nome = nomeDoAnimal;
	}
	
	public  String getNome() {
		return this.nome;
	}

	public  double getPeso() {
		return this.peso;
	}

	protected void foo() {
		System.out.println("teste");
	}

}
