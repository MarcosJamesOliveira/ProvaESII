package Teste;

import static org.junit.Assert.*;

import org.junit.Test;

import Classe.Imposto;

public class TesteImposto {

	@Test
	public void testaAliquotaPadrao(){
		Imposto i = new Imposto();
		
		i.setValor(100.00);
		i.setAliquota(120.00);
		
		boolean esperado = true;
		boolean atual = i.permitirAliquota();
		
		assertEquals(esperado, atual);
	}
	
	
	@Test
	public void testeImposto(){
		Imposto i = new Imposto();
		
		i.setValor(50.00);
		i.setAliquota(30);
		i.setCotacaoDolar(2.30);
		
		double esperado =34.5;
		double atual = i.calcularImposto();
		
		assertEquals(esperado, atual,0.0);
		
	}
}
