package com.jovetecnologia.test;

import javax.swing.JOptionPane;

import org.junit.Test;
import static org.junit.Assert.*;

public class FreteCorreiosTest {

	@Test
	public void calcularFrete() {
		String cepOrigem = JOptionPane.showInputDialog(null, "Informe o CEP de Origem");
		assertTrue("Cep de origem foi preenchido", cepOrigem.length() > 0);
		
		String cepDestino = JOptionPane.showInputDialog(null, "Informe o CEP de Destino");
		assertTrue("Cep de destino foi preenchido", cepDestino.length() > 0);
		
		// TODO Adicionar lógica e chamada de services para calcular o frete e exibir
	}
}