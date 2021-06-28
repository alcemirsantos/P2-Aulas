package br.com.alcemirsantos.aula05;

import br.com.alcemirsantos.aula04.Aluno;

public class Vetor {

	private Aluno[] alunos;
	private int count;

	Vetor() {
		alunos = new Aluno[1000];
		count = 0;
	}

	public int getTamanho() {
		return count;
	}
	
	/**
	 * Adiciona uma instância de {@link Aluno} ao vetor.
	 * @param novo
	 * @return {@code true} se conseguir adicionar, {@code false}
	 *  caso contrário.
	 */
	public boolean adiciona(Aluno novo) {
		if(count<1000) {
			alunos[count] = novo;
			count=count+1;
			return true;
		}
		return false;
	}

	
	/**
	 * Busca uma instância de {@link Aluno} no vetor.
	 * 
	 * @param posicao
	 * @return um instância de aluno se encontra ou 
	 * {@code null}, caso contrário.
	 * 
	 */
	public Aluno busca(int posicao) {
		if(posicao >=0 && posicao < count) {
			return alunos[posicao];
		}
		return null;
	}

	/**
	 * 
	 * @param posicao, do elemento a ser removido
	 */
	public boolean remover(int posicao) {
		if(posicao >=0 && posicao < count) {
			alunos[posicao] = null;
			for(int i =posicao; i<(count-1); i++) {
				alunos[posicao] = alunos[i+1];
			}
			count--;
			return true;
		}
		return false;
	}

	/**
	 * 
	 * @param posicao
	 * @param novoAluno
	 * @return
	 */
	public boolean alterar(int posicao, Aluno novoAluno) {
		if(posicao >=0 && posicao < count) {
			alunos[posicao] = novoAluno;
			return true;
		}
		return false;
	}

	public Aluno[] getListaOcupada() {
		Aluno[] resultado = new Aluno[count];
		for (int i=0; i<count;i++){
			resultado[i] = alunos[i];
		}
		return resultado;
	}
	
	public Aluno[] getListaCompleta() {
		return alunos;
	}
	
	public void imprime() {
		
	}
}
