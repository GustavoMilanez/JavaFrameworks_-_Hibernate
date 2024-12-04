package AulaPratica07_Proxy_parte3;

import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		ProxyBuscaLivro proxy = new ProxyBuscaLivro();

		ArrayList<Livro> resultadoBusca = new ArrayList<>();
		Livro livro = new Livro();
		
		System.out.println("Busca 1 - por autor");
		resultadoBusca = proxy.buscaPorAutor("Dan Brown");
		for (Livro listaLivro : resultadoBusca) {
			System.out.println(listaLivro.toString());
		}

		System.out.println("");
		System.out.println("Busca 2 - por autor");
		resultadoBusca = proxy.buscaPorAutor("Clarice Lispector");
		for (Livro listaLivro : resultadoBusca) {
			System.out.println(listaLivro.toString());
		}	
		
		System.out.println("");
		System.out.println("Busca 3 - por titulo");
		resultadoBusca = proxy.buscaPorTitulo("Dom Casmurro");
		for (Livro listaLivro : resultadoBusca) {
			System.out.println(listaLivro.toString());
		}
		
		System.out.println("");
		System.out.println("Busca 4 - por titulo");
		resultadoBusca = proxy.buscaPorTitulo("Capitães da Areia");
		for (Livro listaLivro : resultadoBusca) {
			System.out.println(listaLivro.toString());
		}
		
		System.out.println("");
		System.out.println("Busca 5 - por ISBN");
		livro = proxy.buscaPorISBN(326457);
		System.out.println(livro.toString());

		
		System.out.println("");
		System.out.println("Busca 6 - por ISBN");
		livro = proxy.buscaPorISBN(111111);	
		System.out.println(livro.toString());
	}
}
