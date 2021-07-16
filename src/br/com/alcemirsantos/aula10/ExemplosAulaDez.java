package br.com.alcemirsantos.aula10;

import java.util.ArrayList;
import java.util.List;

public class ExemplosAulaDez {

	public static void main(String[] args) {

		List<Quadrado> list = new ArrayList<Quadrado>();

		Quadrado q = new Quadrado(10, 20);

		System.out.println(q);
		System.out.println(q.getLado());
		q.foo();

	}

}
