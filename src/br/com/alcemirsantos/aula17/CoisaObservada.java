package br.com.alcemirsantos.aula17;

import java.util.Observable;

public class CoisaObservada extends Observable{

	// esta é a informação de interesse
	private Integer dado;
	
	public CoisaObservada() {
		dado = 0;
	}

	/*
	 * atualizado o dado de interesse
	 */
	public void  incremente() {
		dado++;
		setChanged();
		notifyObservers(dado);
	}
	/**
	 * atualizado o dado de interesse
	 */
	public void  decremente() {
		dado--;
		setChanged();
		notifyObservers(dado);
	}

}
