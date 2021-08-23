package br.com.alcemirsantos.aula22;

public class Boliche {
	private int[] arremesos = new int[21];
	private int placarFinal = 0;
	private int rodadaAtual = 1;
	private int numArremessos = 0;
	private int primeiroArremesso;
	private int segundoArremesso;

	public int getPlacarFinal() {
		return placarFinal;
	}

	/**
	 * Contabilizar a quantidade de pinos derrubados pro arremesso.
	 * 
	 * @param numPinosDerrubados
	 */
	public void add(int numPinosDerrubados) {
		placarFinal += numPinosDerrubados;
		numArremessos++;
		if (numPinosDerrubados == 10 || numArremessos == 2) {
			rodadaAtual++;
			numArremessos = 0;
		}
	}

	public int getPlacarDaRodada(int numDaRodada) {

		if(numDaRodada == 0 ) return 0;
		/*
		 * se strike == 10 + primeiroArremesso + segundoArremesso; se spare == 10 +
		 * primeiroArremesso; senão arremessoUm + arremessoDois;
		 */
		int pontuacao = 0;
		if (ehStrike())
			pontuacao += 10 + primeiroArremesso + segundoArremesso;
		else if (ehSpare())
			pontuacao += 10 + primeiroArremesso;
		else
			pontuacao += primeiroArremesso + segundoArremesso;
		return pontuacao + getPlacarDaRodada(numDaRodada - 1);
	}

	private boolean ehStrike() {
		if (primeiroArremesso == 10)
			return true;
		return false;
	}

	private boolean ehSpare() {
		if (!ehStrike() && (primeiroArremesso + segundoArremesso == 10))
			return true;
		return false;
	}

	public int getRodadaAtual() {
		return rodadaAtual;
	}

}
