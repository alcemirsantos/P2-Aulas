package br.com.alcemirsantos.aula13;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import br.com.alcemirsantos.aula13.models.Documento;
import br.com.alcemirsantos.aula13.models.Pessoa;
import br.com.alcemirsantos.aula13.models.PessoaFisica;
import br.com.alcemirsantos.aula13.models.PessoaJuridica;

public class ExemplosAulaTreze {

	public static void main(String[] args) {
		String numero = "1231231233";

		Scanner sc = new Scanner(System.in);
		Pessoa pFisica = new PessoaFisica(sc.nextLine());
		Pessoa pJuridica = new PessoaJuridica(sc.nextLine());

		
		List<Pessoa> lista = new LinkedList<Pessoa>();
		lista.add(pJuridica);
		lista.add(pFisica);
		
		Documento c = pFisica.getDocumento(); // CPF
		Documento c2 = pJuridica.getDocumento(); // CNPJ

		
		for(Pessoa p: lista)
			System.out.println();
		
		pFisica.faa();
		pJuridica.faa();
		
		System.out.println(c);
		System.out.println(c2);

	}

}
