package Trabalho_Factory;

public class PorItem extends Empregado{
	
	private double valor_producao;
	private int quantidade;
	
	public PorItem(String nome, String email, int anoContratacao) {
		super(nome, email, anoContratacao);
	}

	public double getValor_producao() {
		return valor_producao;
	}

	public void setValor_producao(double valor_producao) {
		this.valor_producao = valor_producao;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public double ganha() {
		double salarioFinal = valor_producao * quantidade;
		return salarioFinal;
	}
}
