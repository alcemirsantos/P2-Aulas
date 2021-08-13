package br.com.alcemirsantos.aula18.models;

public class Telefone {
	int ddd;
	String numero;

	public Telefone(int oDDD, String oNumero) {
		ddd = oDDD;
		numero = oNumero;
	}

	@Override
	public String toString() {
		return "(" + ddd + ") " + numero;
	}

}
