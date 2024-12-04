package Trabalho_Factory;

public class Gerente extends Empregado{

	private double salario;
	
	public Gerente(String nome, String email, int anoContratacao) {
		super(nome, email, anoContratacao);
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public double ganha() {
		return salario;
	}
}
