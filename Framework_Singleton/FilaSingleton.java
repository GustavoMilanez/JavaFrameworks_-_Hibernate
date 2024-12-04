package Trabalho01_Singleton;

import java.util.ArrayList;

public class FilaSingleton {
	
	private static FilaSingleton instancia;
	
	private FilaSingleton() {
		filaUsuario = new ArrayList<>();
	}
	
	public static FilaSingleton getInstancia() {
			
		if(instancia == null) {
			instancia = new FilaSingleton();
		}
			
		return instancia;
	}
	
	private ArrayList<Usuario> filaUsuario;
	
	public void adicionarUsuario(Usuario user) {
		filaUsuario.add(user);
	}
	
	public Usuario retiraUsuario(int cod) {
		System.out.println("Usuário atendido: " + filaUsuario.get(0));
		return filaUsuario.remove(cod);
	}
	
	public void mostraFila() {
		for(Usuario user : filaUsuario) {
			System.out.println(user.toString());
		}
	}
}
