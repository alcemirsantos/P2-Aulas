package br.com.alcemirsantos.aula06;

import java.util.ArrayList;
import java.util.Scanner;

import br.com.alcemirsantos.aula04.Aluno;

/**
 * Programa CRUD(Criar, Buscar, Atualizar e Remover). 
 * 
 * @author alcemirsantos
 *
 */
public class ExemplosAulaSeis {
	static Scanner sc = new Scanner(System.in);

	// Base de dados dos alunos.
	static ArrayList<Aluno> alunos = new ArrayList<Aluno>();

	public static void main(String[] args) {

		boolean quiserContinuar = true;
		while (quiserContinuar) {
			imprimirMenu();
			int opcao = coletarOpcao();
			switch (opcao) {
			case 0:
				quiserContinuar = querExecutar();
				break;
			case 1: // adicionar
				alunos.add(criarNovoAluno());
				break;
			case 2: // remover
				imprimirLista();
				opcao = coletarOpcao();
				alunos.remove(opcao);
				break;
			case 3: // alterar
				// posicao do aluno a alterar
				imprimirLista();
				opcao = coletarOpcao();
				alterarAluno(opcao);
				//
				break;
			case 4: //TODO buscar
				break;
			case 5: // imprimir lista
				imprimirLista();
				break;
			default:
				System.out.println("Escolha outra opção!");
				break;
			}
		}
		System.out.println("Obrigado por usar!");
		sc.close();
	}

	private static void imprimirLista() {
//		for(int i=0; i<alunos.size(); i++)
//			System.out.println(i+ ". Nome: "+alunos.get(i).getNome()+" Nota: "+alunos.get(i).getNota());
//		
		if (alunos.isEmpty())
			System.out.println("-> Lista Vazia!");
		else {
			int pos = 0;
			for (Aluno a : alunos) {
				System.out.println(pos + ". Nome: " + a.getNome() + " Nota: " + a.getNota());
				pos++;
			}
		}
	}

	/**
	 * pergunta dados so aluno e cria novo objeto de {@link Aluno}.
	 * 
	 * @return
	 */
	private static Aluno criarNovoAluno() {
		String nome = coletarNomeDoAluno();
		double nota = coletarNotaDoAluno();

		return new Aluno(nome, nota);
	}

	private static double coletarNotaDoAluno() {
		System.out.print("Digite nota do Aluno: ");
		double nota = Double.parseDouble(sc.nextLine());
		return nota;
	}

	private static String coletarNomeDoAluno() {
		System.out.print("Digite nome do Aluno: ");
		String nome = sc.nextLine();
		return nome;
	}

	/**
	 * pergunta dados so aluno e cria novo objeto de {@link Aluno}.
	 * 
	 * @return
	 */
	private static void alterarAluno(int posicao) {
		// o que que eu vou alterar?
		System.out.print("Alterar (1)nome, (2)nota, ou (3)ambos? ");
		int opcao = coletarOpcao();
		Aluno alterado = alunos.get(posicao);
		String novoNome;
		double novaNota;

		switch (opcao) {
		case 1: // nome
			novoNome = coletarNomeDoAluno();
			alterado.setNome(novoNome);
			break;
		case 2: // nota
			novaNota = coletarNotaDoAluno();
			alterado.setNota(novaNota);
			break;
		case 3: // ambos
			novoNome = coletarNomeDoAluno();
			novaNota = coletarNotaDoAluno();
			alterado.setNome(novoNome);
			alterado.setNota(novaNota);
			break;
		default:
			System.out.println("Escolha outra opção!");
			break;
		}

	}

	private static int coletarOpcao() {
		System.out.print("Digite sua Opção: ");
		int opcao = Integer.parseInt(sc.nextLine());
		return opcao;
	}

	private static void imprimirMenu() {
		StringBuilder sb = new StringBuilder();
		sb.append("MENU DO PROGRAMA!\n");
		sb.append("1) adicionar\n");
		sb.append("2) remover\n");
		sb.append("3) alterar\n");
		sb.append("4) buscar\n");
		sb.append("5) imprimir lista\n");
		sb.append("0) terminar\n");
		System.out.println(sb.toString());
	}

	/**
	 * 
	 * @return
	 */
	private static boolean querExecutar() {
		System.out.println("Deseja continuar? (Sim/Não): ");
		String resposta = sc.nextLine();
		return resposta.toLowerCase().equals("sim") ? true : false;
	}

}
