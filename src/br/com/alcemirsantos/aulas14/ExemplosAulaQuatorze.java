package br.com.alcemirsantos.aulas14;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import br.com.alcemirsantos.aula13.models.Pessoa;
import br.com.alcemirsantos.aula13.models.PessoaFisica;

public class ExemplosAulaQuatorze {

	public static void main(String[] args) {
		
//		Pessoa p = new PessoaJuridica("12312312312312");
//		
//		if(p instanceof PessoaFisica) {
//			
//		}
//		
//		System.out.println(p);
		
//		Collection<String> c = new ArrayList<String>();
//		Collection<String> c = new HashSet<String>();
//		
//		c.add("um");
//		c.add("dois");
//		c.add("tres");
//		c.add("quatro");
//		
//		Iterator<String> i = c.iterator();
//		while(i.hasNext()) {
//			String s = i.next();
//			System.out.println(s);
//		}
		Map<Pessoa, List<Telefone>> telefonesDasPessoas = new HashMap<Pessoa, List<Telefone>>();
		
		List<Telefone> telefones = new ArrayList<Telefone>();
		telefones.add(new Telefone());
		telefones.add(new Telefone());
		telefones.add(new Telefone());
		telefones.add(new Telefone());
		
		Pessoa p = new PessoaFisica("12345678901");
		Pessoa sp = new PessoaFisica("12345678901");
		System.out.println(p.equals(sp));
		
		telefonesDasPessoas.put(p, telefones);
		
		List<Telefone> a = telefonesDasPessoas.get(p);
		
		// chaves
		Set<Pessoa> b = telefonesDasPessoas.keySet(); 
		// valores
		Collection<List<Telefone>> c = telefonesDasPessoas.values(); 
		
		
		Set<Entry<Pessoa, List<Telefone>>> ed = telefonesDasPessoas.entrySet();
		
		
		for(Entry<Pessoa, List<Telefone>> e: ed ) {
			Pessoa op = e.getKey();
			List<Telefone> l = e.getValue();
		}
		
		
	}
	
	
	

}
