package br.com.alcemirsantos.aula11;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import br.com.alcemirsantos.aula11.models.Caixa;
import br.com.alcemirsantos.aula11.models.Empregado;
import br.com.alcemirsantos.aula11.models.Gerente;
import br.com.alcemirsantos.aula11.models.Supervisor;

public class ExemplosAulaOnze {

	public static void main(String[] args) {

		List<Empregado> empregados = new ArrayList<Empregado>();
		List<Empregado> empregados2 = new LinkedList<Empregado>();
		
		empregados.add(new Empregado());
		empregados.add(new Caixa(10));
		empregados.add(new Supervisor(14));
		empregados.add(new Gerente(10, 10));

		for (Empregado i: empregados)
			System.out.println("Salário: " + i.getSalario());
		
//		for(int count = 0; count<empregados.size(); count++){
//			System.out.println("Salário: " + empregados.get(count).getSalario());
//		}

	}

}
