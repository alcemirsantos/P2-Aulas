package br.com.alcemirsantos.aula05;

import java.util.ArrayList;

import br.com.alcemirsantos.aula04.Aluno;

public class ExemploAulaCinco {

	public static void main(String[] args) {
		Vetor baseDeDados = new Vetor();

		Aluno novoAluno = new Aluno("Alcemir", 7.0);
		Aluno outroAluno = new Aluno("Aécio", 8.0);
		baseDeDados.adiciona(novoAluno);
		baseDeDados.adiciona(new Aluno("Antonio", 9.0));
		boolean resultadoAdicao = baseDeDados.adiciona(outroAluno);
		boolean resultadoAlteracao = baseDeDados.alterar(0, outroAluno);
		Aluno resultadoBusca = baseDeDados.busca(1);
		boolean resultadoRemocao = baseDeDados.remover(0);
		Aluno[] listaOcupada = baseDeDados.getListaOcupada();

//		for(Aluno tmp: baseDeDados.getLista()) {
//			
//		}
		for (Aluno tmp : listaOcupada) {
			System.out.println("Nome: " + tmp.getNome() + ", Nota: " + tmp.getNota());
		}

		System.out.println("====");
		for (int i = 0; i < baseDeDados.getTamanho(); i++) {
			System.out.println("Nome: " + baseDeDados.getListaCompleta()[i].getNome() + ", Nota: "
					+ baseDeDados.getListaCompleta()[i].getNota());
		}

		VetorG<Aluno> baseAlunos = new VetorG<Aluno>(new Aluno[1000]);
		VetorG<Carro> baseCarro = new VetorG<Carro>(new Carro[1000]);
		VetorG<Professor> novaBase = new VetorG<Professor>(new Professor[1000]);

		Aluno[] alunos = baseAlunos.getListaCompleta();
		Carro[] carros = baseCarro.getListaCompleta();
		Professor[] professores = novaBase.getListaCompleta();

		ArrayList<Aluno> listaA = new ArrayList<Aluno>();
		ArrayList<Carro> lista = new ArrayList<Carro>();
		ArrayList<Professor> listaP = new ArrayList<Professor>();

		lista.add(new Carro("Ka", "azul", 1.5));
		lista.add(new Carro("Celta", "azul", 1.5));
		lista.add(new Carro("Clio", "azul", 1.5));
		lista.add(new Carro("Gol", "azul", 1.5));
		lista.add(new Carro("Cobalt", "azul", 1.5));
		lista.add(new Carro("Sandero", "azul", 1.5));
		
		Carro daPosicaoTres = lista.get(3);
		
		lista.remove(5);
		
		lista.add(2, new Carro("S10", "branca", 2.8));
		
		for (Carro c : lista) {
			System.out.println("Carro: " + c.getNome() + ", Cor: " + c.getCor());
		}

	}

	class Professor {
	}

}
