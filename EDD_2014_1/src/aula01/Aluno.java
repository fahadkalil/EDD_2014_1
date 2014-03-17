package aula01;

import java.util.ArrayList;

public class Aluno {
	private String nome;
	private String email;
	private int idade;
	private boolean casado;
	
	public Aluno(String nome, String email, int idade, boolean casado) {
		this.nome = nome;
		this.email = email;
		this.idade = idade;
		this.casado = casado;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public boolean isCasado() {
		return casado;
	}
	public void setCasado(boolean casado) {
		this.casado = casado;
	}
	
	public static void main(String[] args) {
		// Cria objeto		
		Aluno aluno1 = new Aluno("Pedro","pedro@imed.edu.br", 25, false);
		
		// Mostra na tela
		System.out.println( "Nome do aluno: " + aluno1.getNome() );
		
		// Cria objeto
		Aluno aluno2 = new Aluno("João","joao@imed.edu.br", 45, true);
		
		// Cria um vetor de Aluno
		Aluno[] alunos = new Aluno[5];
		alunos[0] = aluno1;
		alunos[1] = aluno2;
		
		
		// Percorrer vetor (for each)		
		for (Aluno a : alunos) {
			if (a != null) {
				System.out.println( "Nome do aluno: " + a.getNome() );
			}
		}
	}
}
