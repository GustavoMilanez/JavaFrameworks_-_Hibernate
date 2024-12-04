package AulaPratica07_Proxy_parte3;

import java.util.ArrayList;

public class ProxyBuscaLivro implements BuscaLivroInterface{
	
	BuscaLivro busca = new BuscaLivro();
	
	public ArrayList<Livro> buscaPorAutor(String autor){
		ArrayList<Livro> listaPorAutor = new ArrayList<>();
		
		if(autor == "Dan Brown") {
			listaPorAutor.add(new Livro("Dan Brown", "Origem", 12345));
			listaPorAutor.add(new Livro("Dan Brown", "Codigo Da Vinci", 53654));
			listaPorAutor.add(new Livro("Dan Brown", "Inferno", 256487));
		}else {
			listaPorAutor = busca.buscaPorAutor(autor);
		}
		return listaPorAutor;
	}
	
	public ArrayList<Livro> buscaPorTitulo(String titulo){
		ArrayList<Livro> listaPorTitulo = new ArrayList<>();
		
		if(titulo == "Dan Brown") {
			listaPorTitulo.add(new Livro("Jair Messias", "Capitânicos", 222217));
		}else {
			listaPorTitulo = busca.buscaPorTitulo(titulo);
		}
		return listaPorTitulo;
	}
	
	public Livro buscaPorISBN(int isbn){
		
		Livro livro = new Livro();
		
		if(isbn == 326457) {
			livro = new Livro("José de Alencar", "O Guarani", 326457);
		}else {
			livro = busca.buscaPorISBN(isbn);
		}
		return livro;
	}
}
