package Trabalho_Junit;

public class Empregado {
	
	private double Salario;
	private int numFilhos;
	
	public Empregado(double Salario, int numFilhos) {
		this.Salario = Salario;
		this.numFilhos = numFilhos;
	}

	public double getSalario() {
		return Salario;
	}

	public void setSalario(double Salario) {
		this.Salario = Salario;
	}

	public int getNumFilhos() {
		return numFilhos;
	}

	public void setNumFilhos(int numFilhos) {
		this.numFilhos = numFilhos;
	}
	
	public double calculaINSS() {
		
		if(Salario <= 1399.12) {
            return Salario * 0.08;
        } else if(Salario <= 2331.88) {
            return Salario * 0.09;
        } else if(Salario <= 4663.75) {
            return Salario * 0.11;
        } else {
            return 513.01;
        }
	}
	
	public double calculaIR() {
		double INSS = Salario - calculaINSS(), calculaIr = INSS - (numFilhos * 189.59);

        if(calculaIr <= 1903.98) {
            return 0;
        } else if(calculaIr <= 2826.65) {
            return (calculaIr * 0.075) - 142.80;
        } else if(calculaIr <= 3751.05) {
            return (calculaIr * 0.15) - 354.80;
        } else if(calculaIr <= 4664.68) {
            return (calculaIr * 0.225) - 636.13;
        } else {
            return (calculaIr * 0.275) - 869.36;
        }
	}
	
	public double calculaLiquido() {
		return Salario - calculaINSS() - calculaIR();
	}
}
