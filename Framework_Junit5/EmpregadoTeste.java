package Trabalho_Junit;

import org.junit.Assert;
import org.junit.Test;

public class EmpregadoTeste {
	
	@Test
	public void testeINSS() {
		
		Empregado emp = new Empregado(1000.00, 0);
		Assert.assertEquals(80.0, emp.calculaINSS(), 0.01);
		
		emp.setSalario(2500.00);
		Assert.assertEquals(275.0, emp.calculaINSS(), 0.01);
		
		emp.setSalario(5000.00);
		Assert.assertEquals(513.01, emp.calculaINSS(), 0.01);
		
		emp.setSalario(10000.00);
		Assert.assertEquals(513.01, emp.calculaINSS(), 0.01);
	}
	
	@Test
	public void testeIR() {
		
		Empregado emp = new Empregado(1000.00, 0);
		Assert.assertEquals(0.0, emp.calculaIR(), 0.01);
		
		emp.setSalario(2500.00);
		Assert.assertEquals(24.07, emp.calculaIR(), 0.01);
		
		emp.setSalario(5000.00);
		Assert.assertEquals(373.44, emp.calculaIR(), 0.01);
		
		emp.setSalario(10000.00);
		Assert.assertEquals(1739.56, emp.calculaIR(), 0.01);
	}
	
	@Test
	public void testeLiquido() {
		
		Empregado emp = new Empregado(1000.00, 0);
		Assert.assertEquals(920.00, emp.calculaLiquido(), 0.01);
		
		emp.setSalario(2500.00);
		Assert.assertEquals(2200.93, emp.calculaLiquido(), 0.01);
		
		emp.setSalario(5000.00);
		Assert.assertEquals(4113.54, emp.calculaLiquido(), 0.01);
		
		emp.setSalario(10000.00);
		Assert.assertEquals(7747.43, emp.calculaLiquido(), 0.01);
	}
}
