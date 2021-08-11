package br.com.alcemirsantos.aula17;

public class ExemploAulaDezesete {
	
	
	public static void main(String[] args) {
		System.out.println("iniciou...");
		
		CoisaObservada co = new CoisaObservada();
		
		Fuxiqueiro fu = new Fuxiqueiro();
		Falador fa = new Falador();
		
		co.addObserver(fu);
		co.addObserver(fa);
		
		co.incremente();
		co.decremente();
		
		System.out.println("...terminou.");
		
	} 

}
