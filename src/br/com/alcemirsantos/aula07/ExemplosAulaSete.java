package br.com.alcemirsantos.aula07;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 
 * @author alcemirsantos
 *
 */
public class ExemplosAulaSete {

	/**
	 * asdf asf {@link Aluno}
	 * @param args
	 */
	public static void main(String[] args) {
		
		Mamifero um = new Boi();
		Mamifero dois = new Baleia();
		Mamifero tres = new Morcego();
	
		Mamifero[] vetor = new Mamifero[10];
		List<Mamifero> lista = new ArrayList<Mamifero>();
		List<Mamifero> lista2 = new LinkedList<Mamifero>();
		
		lista2.add(um);
		lista2.add(dois);
		lista2.add(um);
		lista2.add(dois);
		
		lista.add(tres);
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
