package Ex01;

public class EmpregadoFactory {
	
	public static Empregado getEmpregado(String nome, String email, int anoContratacao, float salario, float comissao, int vendas, float valor_producao, int quantidade, float valor_hora, float quant_horas) {
		if(comissao == 0 && vendas == 0 && valor_producao == 0 && quantidade == 0 && valor_hora == 0 && quant_horas == 0 && salario != 0) {
			return new Gerente(nome, email, anoContratacao, salario);
		}else if(valor_producao == 0 && quantidade == 0 && valor_hora == 0 && quant_horas == 0 && salario != 0 && comissao != 0 && vendas != 0) {
			return new PorComissao(nome, email, anoContratacao, salario, comissao, vendas);
		}else if(salario == 0 && comissao == 0 && vendas == 0 && valor_hora == 0 && quant_horas == 0 && valor_producao != 0 && quantidade != 0) {
			return new PorItem(nome, email, anoContratacao, valor_producao, quantidade);
		}else if(valor_producao == 0 && quantidade == 0 && salario == 0 && comissao == 0 && vendas == 0 && valor_hora != 0 && quant_horas != 0) {
			return new PorHora(nome, email, anoContratacao, valor_hora, quant_horas);
		}else{
			return null;
		}
	}
}
