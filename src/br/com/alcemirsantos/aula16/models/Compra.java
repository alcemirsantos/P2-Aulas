package br.com.alcemirsantos.aula16.models;

import java.util.List;

import br.com.alcemirsantos.aula13.models.Pessoa;

public class Compra {
	private List<Livro> livros;
	private List<Caneta> canetas;
	private Pessoa comprador;

	public Compra(Pessoa comprador, List<Livro> livros, List<Caneta> canetas) {
		this.comprador = comprador;
		this.livros = livros;
		this.canetas = canetas;
	}

	@Override public String toString() {
		StringBuilder sb = new StringBuilder();
		
		sb.append("Lista de Compras da Pessoa: ("+this.comprador+")\n");
		for(Livro l: livros) {
			sb.append("\t"+l+"\n");
		}
		for(Caneta c: canetas) {
			sb.append("\t"+c+"\n");
		}
		
		return sb.toString();
	}
	
}
