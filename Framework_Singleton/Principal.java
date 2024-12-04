package Trabalho01_Singleton;

public class Principal {
	public static void main(String[] args) {
		
		Usuario user01 = new Usuario(1, "Jair Messias");
		Usuario user02 = new Usuario(2, "Luiz Inácio");
		Usuario user03 = new Usuario(3, "Gustavo Milanez");
		Usuario user04 = new Usuario(4, "Alexandre Flores");
		Usuario user05 = new Usuario(5, "Bernardo Enrico");
		Usuario user06 = new Usuario(6, "Carlinhos Dalva");
		
		FilaSingleton atendente_recepcionista = FilaSingleton.getInstancia();
		FilaSingleton atendente_01 = FilaSingleton.getInstancia();
		FilaSingleton atendente_02 = FilaSingleton.getInstancia();
		
		atendente_recepcionista.adicionarUsuario(user01);
		atendente_recepcionista.mostraFila();
		
		atendente_recepcionista.adicionarUsuario(user02);
		atendente_recepcionista.mostraFila();
		
		atendente_recepcionista.adicionarUsuario(user03);
		atendente_recepcionista.adicionarUsuario(user04);
		atendente_recepcionista.adicionarUsuario(user05);
		atendente_recepcionista.adicionarUsuario(user06);
		atendente_recepcionista.mostraFila();
		
		atendente_01.retiraUsuario(0);
		atendente_recepcionista.mostraFila();
		
		atendente_02.retiraUsuario(0);
		atendente_recepcionista.mostraFila();
	}
}
