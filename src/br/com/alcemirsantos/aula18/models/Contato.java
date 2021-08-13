package br.com.alcemirsantos.aula18.models;

import java.util.ArrayList;
import java.util.List;

public class Contato {

	String nome;
	List<Telefone> telefones;
	
	public Contato(String oNome, List<Telefone> osTelefones) {
		this.nome = oNome;
		this.telefones = osTelefones;
	}
	
	public Contato(String oNome) {
		this.nome = oNome;
		this.telefones = new ArrayList<Telefone>();
	}

	

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Nome: "+nome+ "\n");
		sb.append("Contatos:\n");
		
		if(telefones.isEmpty())
			sb.append("\t<Nenhum telefone>\n");
		else
			for(Telefone t : telefones)
				sb.append("\t"+t+"\n");
		return sb.toString();
	}

	public void addTelefone(Telefone novo) {
		telefones.add(novo);
	}

	public void addTodosOsTelefones(List<Telefone> osNovosTelefones) {
		// substitui a lista
//		telefones = osNovosTelefones;
		// incrementa a lista
		telefones.addAll(osNovosTelefones);
	}

	public List<Telefone> getTelefones() {
		return telefones;
	}

}
