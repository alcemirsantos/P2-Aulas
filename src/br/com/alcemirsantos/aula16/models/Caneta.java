package br.com.alcemirsantos.aula16.models;

public class Caneta {
	
	private Cor cor;
	
	public Caneta (Cor corDaCaneta) {
		this.cor = corDaCaneta;
	}
	
	@Override public String toString() {
		return "- Caneta: " + this.cor + ";";
	}

}
