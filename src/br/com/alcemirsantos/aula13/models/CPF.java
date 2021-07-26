package br.com.alcemirsantos.aula13.models;

public class CPF extends Documento {

	public CPF(String cpf) {
		numero = validar() ? cpf: null;
	}

	@Override
	protected boolean validar() {
		// TODO regras de validar um cpf
		return (numero.length() == 11) ? true: false;
	}
	
	@Override
	public String toString() {
		return "CPF: "+numero;
	}

}
