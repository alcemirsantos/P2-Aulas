package br.com.alcemirsantos.aula09;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.com.alcemirsantos.aula04.Aluno;
import br.com.alcemirsantos.aula06.ExemplosAulaSeis;

public class ExemplosAulaNove {
	static public Somador[][] somadores = new Somador [10][10];
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {

		double pi = Math.pow(2, 4);
		ExemplosAulaSeis.alunos.add(new Aluno()); // NÃO FAZER
//		ExemplosAulaSeis.imprimirMenu();
//
//		Produto p = new Produto();
		somadores[0][0] = new Somador(); 

		Somador.foo(somadores);
		Somador s1 = new Somador(), s2 = new Somador(), s3 = new Somador(), s4 = new Somador();

		s1.increment();
		s2.increment();
		s3.increment();
		s4.increment();

		Somador.valor++;
		List<Somador> somadores = new  ArrayList<Somador>();
		somadores.add(s1);
		somadores.add(s2);
		for(Somador s: somadores) {
			System.out.println(s.valor);
		}
		
		System.out.println(Somador.valor);

	}
	
	
	

//	static class Produto {
//	}

}
