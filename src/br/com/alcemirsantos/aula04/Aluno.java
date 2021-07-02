package br.com.alcemirsantos.aula04;

public class Aluno { // Bean, Plain Old Java Object (POJO), Entidade
	
	private String nome;
	private double nota;
	
	public Aluno(String nome, double nota){
		setNome(nome);
		setNota(nota);
	}
	
	public Aluno(String nome){
		setNome(nome);
		setNota(0.0);
	}
	
	public Aluno(double umaNota){
		setNome("Fulano");
		setNota(umaNota);
	}

	public Aluno() {
		this(0.0);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}
}
