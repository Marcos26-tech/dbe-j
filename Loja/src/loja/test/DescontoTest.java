package loja.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigDecimal;
import java.math.RoundingMode;

import org.junit.jupiter.api.Test;

import loja.Pedido;
import loja.desconto.CalculadoraDeDesconto;

class DescontoTest {
	

	@Test
	void deveRetornarDescontoParaPedidosCaros() {
		Pedido pedido = new Pedido(new BigDecimal(600), 1);
		CalculadoraDeDesconto calculadoraDeDesconto = new CalculadoraDeDesconto();
		BigDecimal desconto = calculadoraDeDesconto.calcular(pedido);
		
		assertEquals(new BigDecimal("60.00"), desconto.setScale(2, RoundingMode.DOWN));
	}
	
	@Test
	void deveRetornarDescontoParaPedidosVolumosos() {
		Pedido pedido = new Pedido(new BigDecimal(100), 21);
		CalculadoraDeDesconto calculadoraDeDesconto = new CalculadoraDeDesconto();
		BigDecimal desconto = calculadoraDeDesconto.calcular(pedido);
		
		assertEquals(new BigDecimal("5.00"), desconto.setScale(2, RoundingMode.DOWN));
	}
	
	@Test
	void deveRetornarZero() {
		Pedido pedido = new Pedido(new BigDecimal(1), 1);
		CalculadoraDeDesconto calculadoraDeDesconto = new CalculadoraDeDesconto();
		BigDecimal desconto = calculadoraDeDesconto.calcular(pedido);
		
		assertEquals(new BigDecimal("0.00"), desconto.setScale(2, RoundingMode.DOWN));
	}
	
	@Test
	void deveRetornarDescontoDoido() {
		Pedido pedido = new Pedido(new BigDecimal(100), 2);
		CalculadoraDeDesconto calculadoraDeDesconto = new CalculadoraDeDesconto();
		BigDecimal desconto = calculadoraDeDesconto.calcular(pedido);
		
		assertEquals(new BigDecimal("100.00"), desconto.setScale(2, RoundingMode.DOWN));
	}

}
