package br.com.alcemirsantos.aula09;

public class Somador {

	
	private static String URL_BASE = "www.google.com/"; 
	
	static int valor = 0;

	public void increment() {
		valor++;
		System.out.println(valor);
	}

	
	public String append(String endpoint) {
		return URL_BASE+endpoint;
	}
	
	public static void foo(Somador[][] matriz) {
		System.out.println(matriz[0][0]);
	}

}
