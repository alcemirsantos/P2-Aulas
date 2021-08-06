package br.com.alcemirsantos.aula16;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import br.com.alcemirsantos.aula13.models.Pessoa;
import br.com.alcemirsantos.aula13.models.PessoaFisica;
import br.com.alcemirsantos.aula13.models.PessoaJuridica;
import br.com.alcemirsantos.aula16.models.Caneta;
import br.com.alcemirsantos.aula16.models.Compra;
import br.com.alcemirsantos.aula16.models.Cor;
import br.com.alcemirsantos.aula16.models.Livro;

public class ExemplosAulaDezesseis {

	public static void main(String[] args) {
		exemploComMapa();
		exemploComLista();
	}

	static void exemploComMapa() {
		Map<Pessoa, List<Compra>> compras = new HashMap<Pessoa, List<Compra>>();

		Pessoa pf = new PessoaFisica("12331211399");
		Pessoa pj = new PessoaJuridica("12343452345123");

		List<Livro> livros = new ArrayList<Livro>();
		livros.add(new Livro("harry potter 1"));
		livros.add(new Livro("harry potter 2"));
		livros.add(new Livro("harry potter 3"));

		List<Caneta> canetas = new ArrayList<Caneta>();
		canetas.add(new Caneta(Cor.AZUL));
		canetas.add(new Caneta(Cor.PRETA));
		canetas.add(new Caneta(Cor.VERMELHA));

		Compra c1 = new Compra(pj, livros, canetas);
		Compra c2 = new Compra(pj, livros, canetas);
		Compra c3 = new Compra(pj, livros, canetas);
		Compra c4 = new Compra(pj, livros, canetas);
		Compra c5 = new Compra(pj, livros, canetas);
		Compra c6 = new Compra(pj, livros, canetas);
		Compra c7 = new Compra(pf, livros, canetas);
		Compra c8 = new Compra(pf, livros, canetas);
		Compra c9 = new Compra(pf, livros, canetas);
		Compra c10 = new Compra(pf, livros, canetas);

		List<Compra> comprasPF = new ArrayList<Compra>();
		comprasPF.add(c10);
		comprasPF.add(c9);
		comprasPF.add(c8);
		comprasPF.add(c7);

		List<Compra> comprasPJ = new ArrayList<Compra>();
		comprasPJ.add(c1);
		comprasPJ.add(c2);
		comprasPJ.add(c3);
		comprasPJ.add(c4);
		comprasPJ.add(c5);
		comprasPJ.add(c6);

		compras.put(pf, comprasPF);
		compras.put(pj, comprasPJ);

		for (Entry<Pessoa, List<Compra>> e : compras.entrySet()) {
			System.out.println("== Pessoa: " + e.getKey() + " ==");
			for (Compra c : e.getValue()) {
				System.out.println(c);
			}
		}

	}

	static void exemploComLista() {
		Pessoa pf = new PessoaFisica("12331211399");
		Pessoa pj = new PessoaJuridica("12343452345123");

		List<Livro> livros = new ArrayList<Livro>();
		livros.add(new Livro("harry potter 1"));
		livros.add(new Livro("harry potter 2"));
		livros.add(new Livro("harry potter 3"));

		List<Caneta> canetas = new ArrayList<Caneta>();
		canetas.add(new Caneta(Cor.AZUL));
		canetas.add(new Caneta(Cor.PRETA));
		canetas.add(new Caneta(Cor.VERMELHA));

		Compra c1 = new Compra(pj, livros, canetas);
		Compra c2 = new Compra(pj, livros, canetas);
		Compra c3 = new Compra(pj, livros, canetas);
		Compra c4 = new Compra(pj, livros, canetas);
		Compra c5 = new Compra(pj, livros, canetas);
		Compra c6 = new Compra(pj, livros, canetas);
		Compra c7 = new Compra(pf, livros, canetas);
		Compra c8 = new Compra(pf, livros, canetas);
		Compra c9 = new Compra(pf, livros, canetas);
		Compra c10 = new Compra(pf, livros, canetas);

		List<Compra> listaDeCompras = new ArrayList<Compra>();
		listaDeCompras.add(c10);
		listaDeCompras.add(c1);
		listaDeCompras.add(c2);
		listaDeCompras.add(c3);
		listaDeCompras.add(c4);
		listaDeCompras.add(c5);
		listaDeCompras.add(c6);
		listaDeCompras.add(c7);
		listaDeCompras.add(c8);
		listaDeCompras.add(c9);

		for (Compra c : listaDeCompras) {
			System.out.println(c);
		}

	}

}
