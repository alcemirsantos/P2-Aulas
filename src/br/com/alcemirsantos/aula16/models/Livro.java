package br.com.alcemirsantos.aula16.models;

public class Livro {
	private String titulo; 

	public Livro(String tituloDoLivro) {
		this.titulo = tituloDoLivro;
	}
	
	@Override public String toString() {
		return "- Livro: " + this.titulo + ";";
	}
}
