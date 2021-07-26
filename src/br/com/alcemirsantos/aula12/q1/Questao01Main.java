package br.com.alcemirsantos.aula12.q1;

public class Questao01Main {

	public static void main(String[] args) {
//		Animal a  = new Animal("bixano", 23.4);
		Animal p  = new Peixe("beta", 0.543, "ornamental");
		Cachorro c = new Cachorro("baleia", 15.45, "vira-lata");
		
		
		Bulldog b  = new Bulldog("baleia", 15.45, "vira-lata");
		System.out.println(b);
		System.out.println(p);
		System.out.println(c);
	}

}
