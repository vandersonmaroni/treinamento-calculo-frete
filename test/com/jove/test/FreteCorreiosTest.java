package com.jove.test;

import javax.swing.JOptionPane;

import org.junit.Assert;
import org.junit.Test;

public class FreteCorreiosTest {

	@Test
	public void calcularFrete() {
		String cepOrigem = JOptionPane.showInputDialog(null, "Informe o CEP de Origem");
		Assert.assertNotNull(cepOrigem);
		
		String cepDestino = JOptionPane.showInputDialog(null, "Informe o CEP de Destino");
		Assert.assertNotNull(cepDestino);
		
		// TODO Adicionar lógica e chamada de services para calcular o frete e exibir
	}
}