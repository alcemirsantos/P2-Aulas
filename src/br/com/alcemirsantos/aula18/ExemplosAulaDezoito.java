package br.com.alcemirsantos.aula18;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.com.alcemirsantos.aula18.models.Telefone;
import br.com.alcemirsantos.aula18.models.Contato;

public class ExemplosAulaDezoito {
	static Scanner sc = new Scanner(System.in);
	

	public static void main(String[] args) {
		
		Contato c = new Contato("Fulano");
		Contato c1 = new Contato("Beltrano");
		Contato c2 = new Contato("Cigano");
		Contato c3 = new Contato("Alimano");
		
//		System.out.println(c);
		
		List<Telefone> osTelefones = new ArrayList<Telefone>();
		Telefone novo = new Telefone(coletarDDD(), coletarNumero());
		osTelefones.add(novo);
		osTelefones.add(new Telefone(86, "23423434"));
		osTelefones.add(new Telefone(86, "235675674234"));
		osTelefones.add(new Telefone(86, "2342754"));
		
		c.addTelefone(novo);
//		System.out.println(c);
		
		
		c.addTodosOsTelefones(osTelefones);
		
//		c1.addTodosOsTelefones(osTelefones);
		c2.addTodosOsTelefones(osTelefones);
//		c3.addTodosOsTelefones(osTelefones);
		
		List<Contato> osContatinhos = new ArrayList<Contato>();
		osContatinhos.add(c);
		osContatinhos.add(c1);
		osContatinhos.add(c2);
		osContatinhos.add(c3);
		
		osTelefones.add(2, new Telefone(56, "567675675") );
		
		for(Contato w : osContatinhos)
//			for(Telefone z : w.getTelefones())
				System.out.println(w);
		
	}
	
	private static int coletarDDD() {
		System.out.print("Digite DDD: ");
		int ddd = Integer.parseInt(sc.nextLine());
		return ddd;
	}
	
	private static String coletarNumero() {
		System.out.print("Digite Numero: ");
		return sc.nextLine();
	}


}
