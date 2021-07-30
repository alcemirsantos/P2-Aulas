package br.com.alcemirsantos.aula13.models;

public class CPF extends Documento {

	public CPF(String cpf) {
		numero = validar(cpf) ? cpf: null;
	}

	@Override
	protected boolean validar(String umValor) {
		// TODO regras de validar um cpf
		return (umValor.length() == 11) ? true: false;
	}
	
	@Override
	public String toString() {
		return "CPF: "+numero;
	}

}
