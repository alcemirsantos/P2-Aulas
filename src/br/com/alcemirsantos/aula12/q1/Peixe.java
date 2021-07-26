package br.com.alcemirsantos.aula12.q1;

public class Peixe extends Animal {

	private String habitat;

	public Peixe(String nomeDoPeixe, double pesoDoPeixe, String habitatDoPeixe) {
		super(nomeDoPeixe, pesoDoPeixe);
		setHabitat(habitatDoPeixe);
	}

	private void setHabitat(String habitatDoPeixe) {
		this.habitat = habitatDoPeixe;
	}
	

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("===\n");
		sb.append("Nome do Peixe: " + getNome() + ";\n");
		sb.append("Peso do Peixe: " + super.getPeso() + ";\n");
		sb.append("Habitat do Peixe: " + this.habitat + ".\n");
		sb.append("===\n");
		return sb.toString(); 
	}

	
}
