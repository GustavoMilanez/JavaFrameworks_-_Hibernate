package Ex01;

public class PorComissao extends Empregado{
	
	private float salario;
	private float comissao;
	private int vendas;
	
	public PorComissao(String nome, String email, int anoContratacao, float salario, float comissao, int vendas) {
		super(nome, email, anoContratacao);
		this.salario = salario;
		this.comissao = comissao;
		this.vendas = vendas;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

	public float getComissao() {
		return comissao;
	}

	public void setComissao(float comissao) {
		this.comissao = comissao;
	}

	public int getVendas() {
		return vendas;
	}

	public void setVendas(int vendas) {
		this.vendas = vendas;
	}

	public double ganha() {
		float salarioFinal = salario + comissao * vendas;
		return salarioFinal;
	}
}
