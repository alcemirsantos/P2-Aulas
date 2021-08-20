package br.com.alcemirsantos.aula20;

import java.io.EOFException;
import java.io.IOException;


public class ExemplosAulaVinte {

	public static void main(String[] args) {
		try {
			poo();
		} catch (NovaExcecao n) {
			System.err.println("n:" + n.getMessage());
		} catch (InterruptedException | EOFException f) {
			System.err.println("a:" + f.getMessage());
		} catch (IOException f) {
			System.err.println("b:" + f.getMessage());
		} catch (Exception h) {
			System.err.println("d:" + h.getMessage());
		}finally {
			System.out.println("");
		}
		
		
	}

	private static void poo() throws Exception {
		paa();
	}

	private static void paa() throws Exception {
		too();
	}

	private static void too() throws Exception {
		
		eoo();
	}

	private static void eoo() throws Exception {
		foo();
	}

	private static void foo() throws Exception {
		NovaExcecao n = new NovaExcecao("vc não pode fazer isso mininozinho! faça outra coisa!");
		
		throw n;
	}

//	void faa(){
//		Scanner s = new Scanner(System.in);
//		try {
//			int a = s.nextInt();
//			int b = s.nextInt();
//			float result = divisao(a,b);
//		}catch(ArithmeticException e) {
//			System.err.print("divisão por zero" + e.getMessage());
//		}
//	}
//
//	private static float divisao(int a, int b) {
//		return a/b;
//	}
//	

}
