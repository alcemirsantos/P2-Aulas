package br.com.alcemirsantos.aula13.models;

import br.com.alcemirsantos.aula07.Mamifero;

public abstract class Pessoa implements Mamifero {

	protected Documento documento;

	public Documento getDocumento() {
		return documento;
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
	
	@Override
	public String toString() {
		return getDocumento().toString();
	}
	
	@Override
	public boolean equals(Object o) {
		if(o ==  null ) return false;
		if(!(o instanceof Pessoa)) return false;
		Pessoa pesssoaComparada = (Pessoa) o; // type cast
		
		return this.documento.equals(pesssoaComparada.documento);
	}

}