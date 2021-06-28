package br.com.alcemirsantos.aula04;

import java.util.Scanner;


public class ExemploAulaQuatro {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Aluno outro = new Aluno();
		Aluno maisUm = new Aluno("Doidim");
		Aluno maisOutro = new Aluno(0.0);
		Aluno bom = new Aluno("Alcemir", 10.0);
		
		outro.setNome("Ziraldo");
		maisOutro.setNota(2.3);
		
		String nomeDoAlunoMaisUm = sc.nextLine();
		outro.setNome(nomeDoAlunoMaisUm);
		double notaDoAlunoBom = bom.getNota();
		
		
		Aluno[] alunos = new Aluno[4];
		alunos[0] = outro;
		alunos[1] = maisOutro;
		alunos[2] = maisUm;
		alunos[3] = bom;
		
		int count=0;
		for(count =0; count< alunos.length; count++) {
			System.out.println(alunos[count].getNome());
		}
		
		for(Aluno tmp: alunos) {
			System.out.println(tmp.getNome());
		}
		
		count=0;
		while(count<alunos.length) {
			System.out.println(alunos[count].getNome());
			count++;
		}
		
		count=0;
		do{
			System.out.println(alunos[count].getNome());
			count++;
		}while(count<alunos.length);
		
	}

}
