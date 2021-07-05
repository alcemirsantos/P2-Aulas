package br.com.alcemirsantos.aula07;

import java.util.LinkedList;
import java.util.List;

public class ExemplosAulaSete {

	public static void main(String[] args) {
		
		Mamifero um = new Boi();
		Mamifero dois = new Baleia();
		Mamifero tres = new Morcego();
		
//		List<Mamifero> lista =  new LinkedList<Mamifero>();
		List<Mamifero> lista =  new LinkedList<Mamifero>();
		
		lista.add(um);
		lista.add(dois);
		lista.add(tres);
		
		
		for (Mamifero m: lista)
			m.mamar();
		
		System.out.println("");
		Mamifero s = lista.get(0);
		s.mamar();
	}

}
