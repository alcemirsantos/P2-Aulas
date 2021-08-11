package br.com.alcemirsantos.aula17;

import java.util.Observable;
import java.util.Observer;

public class Falador implements Observer {

	public Falador() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void update(Observable o, Object arg) {
		Integer novoDado = (Integer) arg;
		System.out.println("---\nFalador descobriu o novo dado: "
		+ novoDado + " da classe " + o.getClass());
	}

}
