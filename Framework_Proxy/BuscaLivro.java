package AulaPratica07_Proxy_parte3;

import java.util.ArrayList;

public class BuscaLivro implements BuscaLivroInterface{

	public ArrayList<Livro> buscaPorAutor(String autor){
		ArrayList<Livro> listaPorAutor = new ArrayList<>();
		
		System.out.println("INICIANDO PROCESSO DE BUSCA NO BANCO DE DADOS");
		listaPorAutor.add(new Livro("Clarice Lispector", "A hora da estrela", 56987));
		listaPorAutor.add(new Livro("Clarice Lispector", "Felicidade Clandestina", 211156));
		listaPorAutor.add(new Livro("Clarice Lispector", "Laços de família", 333256));
		System.out.println("ENCERRANDO PROCESO DE BUSCA NO) BANCO DE DADOS");
		
		return listaPorAutor;
	}
	
	public ArrayList<Livro> buscaPorTitulo(String titulo){
		ArrayList<Livro> listaPorTitulo = new ArrayList<>();
		
		System.out.println("INICIANDO PROCESSO DE BUSCA NO BANCO DE DADOS");
		listaPorTitulo.add(new Livro("Jorge Amado", "Capitães da Areia", 98875));
		System.out.println("ENCERRANDO PROCESO DE BUSCA NO) BANCO DE DADOS");
		
		return listaPorTitulo;
	}
	
	public Livro buscaPorISBN(int isbn) {
		
		System.out.println("INICIANDO PROCESSO DE BUSCA NO BANCO DE DADOS");
		Livro livro = new Livro("Carlos Drumond Andrade", "Poemas", 111111);
		System.out.println("ENCERRANDO PROCESO DE BUSCA NO) BANCO DE DADOS");
		
		return livro;
	}
}
