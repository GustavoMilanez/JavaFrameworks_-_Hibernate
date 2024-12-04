package Ex01;

public class PorItem extends Empregado{
	
	private float valor_producao;
	private int quantidade;
	
	public PorItem(String nome, String email, int anoContratacao, float valor_producao, int quantidade) {
		super(nome, email, anoContratacao);
		this.valor_producao = valor_producao;
		this.quantidade = quantidade;
	}

	public float getValor_producao() {
		return valor_producao;
	}

	public void setValor_producao(float valor_producao) {
		this.valor_producao = valor_producao;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public double ganha() {
		float salarioFinal = valor_producao * quantidade;
		return salarioFinal;
	}
}
