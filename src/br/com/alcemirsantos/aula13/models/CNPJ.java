package br.com.alcemirsantos.aula13.models;

public class CNPJ extends Documento {

	public CNPJ(String cnpj) {
		numero = validar() ? cnpj: null;
	}

	@Override
	protected boolean validar() {
		// TODO regras de validar um cnpj
		return (numero.length() == 14) ? true: false;
	}

	@Override
	public String toString() {
		return "CNPJ: "+numero;
	}
}
