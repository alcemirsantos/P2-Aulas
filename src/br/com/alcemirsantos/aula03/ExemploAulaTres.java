package br.com.alcemirsantos.aula03;

import java.util.Scanner;

public class ExemploAulaTres {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		calculaIMC();
	}

	/*
	 * Questão 1 dos slides da Aula 01.
	 */
	public static void questao01() {
		int i = 0;
		double media = 0;
		while (i < 3) {
			System.out.print("Digite uma nota: ");
			double nota = sc.nextDouble();
			media += nota;
			i++;
		}
		media /= i;
		System.out.println("Media: " + media);
	}

	/*
	 * Questão 30 da Lista 01 - adaptada; Calculo do IMC
	 * 
	 * 1. para sexo masculino: peso ideal = (72.7 * altura) - 58 2. para sexo
	 * feminino: peso ideal = (62.1 * altura) - 44.7
	 * 
	 */
	public static void calculaIMC() {
		String sexo;
		double altura, pesoIdeal = 0.0;

		System.out.print("Digite a altura da pessoa (em metros): ");
		altura = sc.nextDouble();

		System.out.print("Cálculo para Homem(H/h) ou (M/m)?: ");
		sexo = sc.next();
		if (ehHomem(sexo)) {
			pesoIdeal = (72.7 * altura) - 58;
		} else if (ehMulher(sexo)) {
			pesoIdeal = (62.1 * altura) - 44.7;
		} else {
			System.out.println("[ERRO] Você deve digitar (H/h) para" + " Homem ou (M/m) para mulher! ");
		}

		System.out.println("O pesso ideal da pessoa: " + pesoIdeal);
	}

	/**
	 * 
	 * .toUpperCase() qwer => QWER QweR => QWER
	 * 
	 * .toLowerCase() QWER => qwer QweR => qwer
	 * 
	 * @param sexo
	 * @return
	 */
	public static boolean ehHomem(String sexo) {
		String sexoMaiusculo = sexo.toUpperCase();
		boolean resultado = sexoMaiusculo.equals("H");
		return resultado;	
	}

	public static boolean ehMulher(String sexo) {
		String sexoMaiusculo = sexo.toUpperCase();
		boolean resultado = sexoMaiusculo.equals("M");
		return resultado;
	}

	

}
