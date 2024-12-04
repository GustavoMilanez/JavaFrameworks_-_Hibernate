package Trabalho_Factory;

public class Principal {
	public static void main(String[] args) {
		
		int cargo;
		String nome;
		String email;
		int anoContratação;
		
		cargo = 1;
		nome = "Antonio Maciel";
		email = "antonio@gmail.com";
		anoContratação = 2005;
		
		Empregado emp1 = EmpregadoFactory.getEmpregado(cargo, nome, email, anoContratação);
		System.out.println(emp1.toString());
		
		cargo = 2;
		nome = "Jair Messias";
		email = "cap22@gmail.com";
		anoContratação = 2022;
		
		Empregado emp2 = EmpregadoFactory.getEmpregado(cargo, nome, email, anoContratação);
		System.out.println(emp2.toString());
		
		cargo = 3;
		nome = "Luiz Inácio";
		email = "pt13@gmail.com";
		anoContratação = 2013;
		
		Empregado emp3 = EmpregadoFactory.getEmpregado(cargo, nome, email, anoContratação);
		System.out.println(emp3.toString());
		
		cargo = 4;
		nome = "Carlinhos Dalva";
		email = "car69@gmail.com";
		anoContratação = 1969;
		
		Empregado emp4 = EmpregadoFactory.getEmpregado(cargo, nome, email, anoContratação);
		System.out.println(emp4.toString());
	}
}
