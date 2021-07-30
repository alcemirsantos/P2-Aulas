package br.com.alcemirsantos.aula13.models;

public class PessoaJuridica extends Pessoa {

	public PessoaJuridica(String numero) {
		documento = new CNPJ(numero);
	}

	@Override
	protected void passo1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void passo3() {
		// TODO Auto-generated method stub
		
	}
	



}
