package br.com.alcemirsantos.aula13.models;

import br.com.alcemirsantos.aula07.Mamifero;

public abstract class Pessoa implements Mamifero {

	protected Documento d;

	public Documento getDocumento() {
		return d;
	}
	
	// Template method
	public void faa() {
		if(false) passo1();
		passo2();
		passo3();
	}

	protected abstract void passo1();

	protected void passo2() {
		System.out.print(true);
	};

	protected void passo4() {
		faa();
		System.out.print(true);
	};

	protected abstract void passo3();
	
	@Override
	public void mamar() {
		// TODO Auto-generated method stub
		
	}

}