package Ex02;

public class Principal {
	
	public static void main(String[] args) {
		
	   ProxyFigura figura = new ProxyFigura();
	   
	   System.out.println(figura.quadrado(10));
	   System.out.println(figura.retangulo(5, 2));
	   System.out.println(figura.circulo(1));
		
	}

}
