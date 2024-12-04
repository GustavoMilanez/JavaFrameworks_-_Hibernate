package Trabalho_Factory;

import java.time.LocalDate;

public abstract class Empregado {
	
	private String nome;
	private String email;
	private int anoContratacao;

	public Empregado(String nome, String email, int anoContratacao) {
		super();
		this.nome = nome;
		this.email = email;
		this.anoContratacao = anoContratacao;
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
	
	public String toString() {
		return "Empregado [nome=" + nome + ", email=" + email + "]";
	}
	
	public abstract double ganha();
	
	public int tempoCasa() {
		LocalDate data_local = LocalDate.now();
		int anoAtual = data_local.getYear();
		int tempoCasa = anoAtual - anoContratacao;
		return tempoCasa;
	}
}
