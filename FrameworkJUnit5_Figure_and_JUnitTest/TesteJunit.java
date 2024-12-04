package Ex03;

import org.junit.Assert;
import org.junit.Test;

public class TesteJunit {

	@Test
	public void testeQuadrado() {
		
		Quadrado quad = new Quadrado(4);
		Assert.assertEquals(16.0, quad.quadrado(), 0);
		
		Quadrado quad2 = new Quadrado(2.5);
		Assert.assertEquals(6.25, quad2.quadrado(), 0);
	}
	
	@Test
	public void testeRetangulo() {
		
		Retangulo ret = new Retangulo(4.0, 5.0);
		Assert.assertEquals(20.0, ret.retangulo(), 0);
		
		Retangulo ret2 = new Retangulo(3.2, 4.5);
		Assert.assertEquals(14.4, ret2.retangulo(), 0);
	}
	
	@Test
	public void testeCirculo() {
		
		Circulo cir = new Circulo(2.0);
		Assert.assertEquals(12.56, cir.circulo(), 0);
		
		Circulo cir2 = new Circulo(3.5);
		Assert.assertEquals(38.48, cir2.circulo(), 0);
	}
	
	@Test
	public void testeTriangulo() {
		
		Triangulo tri = new Triangulo(5.0, 2.0);
		Assert.assertEquals(5.0, tri.triangulo(), 0);
		
		Triangulo tri2 = new Triangulo(3.5, 4.1);
		Assert.assertEquals(7.17, tri2.triangulo(), 0);
	}
}
