package br.com.alcemirsantos.aula10;

public class Quadrado extends FormaGeometrica {

	private double lado;

	public Quadrado(double umValor, double outroValor) {
		super(outroValor);
		lado = umValor;
	}


	@Override
	public void foo() {
		super.foo();
		System.out.print("e funciona?");
	}
	
	@Override
	public double getLado() {
		return this.lado * super.getLado();
	}
	
	@Override
	public String toString() {
		return "lado do quadrado igual a " + this.lado;
	}

}
