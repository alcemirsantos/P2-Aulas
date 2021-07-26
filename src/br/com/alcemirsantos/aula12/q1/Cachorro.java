package br.com.alcemirsantos.aula12.q1;

public class Cachorro extends Animal {

	private String raca;

	public Cachorro(String nomeDoCachorro, double pesoDoCachorro, String racaDoCachorro) {
		super(nomeDoCachorro, pesoDoCachorro);
		setRaca(racaDoCachorro);
	}

	private void setRaca(String habitatDoCachorro) {
		this.raca = habitatDoCachorro;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("===\n");
		sb.append("Nome do Cachoro: " + getNome() + ";\n");
		sb.append("Peso do Cachorro: " + super.getPeso() + ";\n");
		sb.append("Raça do Cachorro: " + this.raca + ".\n");
		sb.append("===\n");
		return sb.toString(); 
	}
	

	
}
