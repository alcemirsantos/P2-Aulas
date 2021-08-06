package br.com.alcemirsantos.aula16.models;

public enum Cor {

	AZUL("Azul"), PRETA("Preta"), VERMELHA("Preta");
	
	String descricao;
	
	Cor(String descricaoDaCor) {
		this.descricao  = descricaoDaCor;
	}
	
	@Override public String toString() {
		return "(Cor " + this.descricao+ ")";
	}
	
}
