package br.com.alcemirsantos.aula17;

import java.util.Observable;
import java.util.Observer;

public class Fuxiqueiro implements Observer {

	public Fuxiqueiro() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void update(Observable o, Object arg) {
		Integer novoDado = (Integer) arg;
		System.out.println("===\nFuxiqueiro descobriu o novo dado: " + novoDado);
	}

}
