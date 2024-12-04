package Trabalho_Factory;

public class EmpregadoFactory {
	
	public static Empregado getEmpregado(int cargo, String nome, String email, int anoContratacao) {
		if(cargo == 1) {
			return new Gerente(nome, email, anoContratacao);
		}else if(cargo == 2) {
			return new PorComissao(nome, email, anoContratacao);
		}else if(cargo == 3) {
			return new PorHora(nome, email, anoContratacao);
		}else if(cargo == 4) {
			return new PorItem(nome, email, anoContratacao);
		}else{
			return null;
		}
	}
}
