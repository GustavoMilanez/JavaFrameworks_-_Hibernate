package Ex02;

public class ProxyFigura implements InterfaceFigura{

	Figura figura = new Figura();

	public double quadrado(double lado) {
		System.out.println("Calculando área do quadrado de lado:" + lado);
		figura.quadrado(lado);
		System.out.println("Calculo realizado");
		return figura.quadrado(lado);
	}

	public double retangulo(double base, double altura) {
		System.out.println("Calculando área do retangulo:" + base + altura);
		figura.retangulo(base, altura);
		System.out.println("Calculo realizado");
		return figura.retangulo(base, altura);
	}

	public double circulo(double raio) {
		System.out.println("Calculando área do círculo:" + raio);
		figura.circulo(raio);
		System.out.println("Calculo realizado");
		return figura.circulo(raio);
	}
}
