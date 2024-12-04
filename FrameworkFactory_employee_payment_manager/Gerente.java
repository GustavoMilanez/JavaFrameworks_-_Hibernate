package Ex01;

public class Gerente extends Empregado{

	private float salario;
	
	public Gerente(String nome, String email, int anoContratacao, float salario) {
		super(nome, email, anoContratacao);
		this.salario = salario;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

	public double ganha() {
		return salario;
	}
}
