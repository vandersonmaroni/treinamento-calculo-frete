package com.jove.test;

import javax.swing.JOptionPane;

import org.junit.Assert;
import org.junit.Test;

public class FreteCorreiosTest {

	@Test
	public void calcularFrete() {
		String cepOrigem = JOptionPane.showInputDialog(null, "Informe o CEP de Origem");
		Assert.assertTrue("CEP de Origem não informado", !cepOrigem.isEmpty());
		
		String cepDestino = JOptionPane.showInputDialog(null, "Informe o CEP de Destino");
		Assert.assertTrue("CEP de Destino não informado", !cepDestino.isEmpty());
		
		// TODO Adicionar lógica e chamada de services para calcular o frete e exibir
	}
}