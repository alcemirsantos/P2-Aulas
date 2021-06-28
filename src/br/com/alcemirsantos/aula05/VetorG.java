package br.com.alcemirsantos.aula05;


public class VetorG<T> {

	private T[] dados;
	private int count;

	VetorG(T[] vetor) {
		dados = vetor;
		count = 0;
	}

	public int getTamanho() {
		return count;
	}
	
	/**
	 * Adiciona uma instância de {@link T} ao vetor.
	 * @param novo
	 * @return {@code true} se conseguir adicionar, {@code false}
	 *  caso contrário.
	 */
	public boolean adiciona(T novo) {
		if(count<1000) {
			dados[count] = novo;
			count=count+1;
			return true;
		}
		return false;
	}

	
	/**
	 * Busca uma instância de {@link T} no vetor.
	 * 
	 * @param posicao
	 * @return um instância de aluno se encontra ou 
	 * {@code null}, caso contrário.
	 * 
	 */
	public T busca(int posicao) {
		if(posicao >=0 && posicao < count) {
			return dados[posicao];
		}
		return null;
	}

	/**
	 * 
	 * @param posicao, do elemento a ser removido
	 */
	public boolean remover(int posicao) {
		if(posicao >=0 && posicao < count) {
			dados[posicao] = null;
			for(int i =posicao; i<(count-1); i++) {
				dados[posicao] = dados[i+1];
			}
			count--;
			return true;
		}
		return false;
	}

	/**
	 * 
	 * @param posicao
	 * @param novoT
	 * @return
	 */
	public boolean alterar(int posicao, T novoT) {
		if(posicao >=0 && posicao < count) {
			dados[posicao] = novoT;
			return true;
		}
		return false;
	}

//	public T[] getListaOcupada() {
//		T[] resultado = new T[count];
//		for (int i=0; i<count;i++){
//			resultado[i] = dados[i];
//		}
//		return resultado;
//	}
//	
	public T[] getListaCompleta() {
		return dados;
	}
	
	public void imprime() {
		
	}
}
