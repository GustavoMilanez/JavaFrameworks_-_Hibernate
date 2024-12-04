package Trabalho_Factory;

public class PorHora extends Empregado{
	
	private double valor_hora;
	private double quant_horas;

	public PorHora(String nome, String email, int anoContratacao) {
		super(nome, email, anoContratacao);
	}

	public double getValor_hora() {
		return valor_hora;
	}

	public void setValor_hora(double valor_hora) {
		this.valor_hora = valor_hora;
	}

	public double getQuant_horas() {
		return quant_horas;
	}

	public void setQuant_horas(double quant_horas) {
		this.quant_horas = quant_horas;
	}

	public double ganha() {
		double salarioFinal = valor_hora * quant_horas;
		return salarioFinal;
	}
}
