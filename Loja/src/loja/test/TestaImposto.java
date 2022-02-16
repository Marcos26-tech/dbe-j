package loja.test;

import java.math.BigDecimal;

import loja.Pedido;
import loja.imposto.CalculadoraDeImposto;
import loja.imposto.Icms;
import loja.imposto.Ipi;

public class TestaImposto {
	
	public static void main(String[] args) {
		
		Pedido pedido = new Pedido(new BigDecimal(500));
		CalculadoraDeImposto calculadoraDeImposto 
			= new CalculadoraDeImposto(new Icms());
		
		BigDecimal imposto 
			= calculadoraDeImposto.calcular(pedido);
		System.out.println(imposto);
		
		calculadoraDeImposto.setImposto(new Ipi());

		imposto = calculadoraDeImposto.calcular(pedido);
		System.out.println(imposto);
		
		System.out.println(pedido.getTotalDeItens());

	}
	
}
