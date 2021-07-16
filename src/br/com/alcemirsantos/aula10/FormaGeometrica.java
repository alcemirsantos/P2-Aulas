package br.com.alcemirsantos.aula10;

public class FormaGeometrica {

	protected double lado = 0;

	public FormaGeometrica(double i) {
		this.lado = i;
	}

	public void foo() {
		System.out.print("humm...");
	}

	
	public double getLado() {
		return this.lado;
	}
	@Override
	public String toString() {
		return "lado da forma geometrica igual a " + this.lado;
	}

}
