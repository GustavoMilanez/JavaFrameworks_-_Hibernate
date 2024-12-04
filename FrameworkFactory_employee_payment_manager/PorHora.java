package Ex01;

public class PorHora extends Empregado{
	
	private float valor_hora;
	private float quant_horas;

	public PorHora(String nome, String email, int anoContratacao, float valor_hora, float quant_horas) {
		super(nome, email, anoContratacao);
		this.valor_hora = valor_hora;
		this.quant_horas = quant_horas;
	}

	public float getValor_hora() {
		return valor_hora;
	}

	public void setValor_hora(float valor_hora) {
		this.valor_hora = valor_hora;
	}

	public float getQuant_horas() {
		return quant_horas;
	}

	public void setQuant_horas(float quant_horas) {
		this.quant_horas = quant_horas;
	}

	public double ganha() {
		float salarioFinal = valor_hora * quant_horas;
		return salarioFinal;
	}
}
