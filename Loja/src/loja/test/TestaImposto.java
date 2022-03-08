package loja.test;

import java.math.BigDecimal;

import loja.Pedido;
import loja.imposto.CalculadoraDeImposto;
import loja.imposto.Icms;
import loja.imposto.Imposto;
import loja.imposto.Ipi;
import loja.imposto.Iss;

public class TestaImposto {
	
	public static void main(String[] args) {
		
		Pedido pedido = new Pedido(new BigDecimal(100));
		
		Imposto imposto = new Icms(new Ipi(new Iss(null)));
	
		CalculadoraDeImposto calculadoraDeImposto 
			= new CalculadoraDeImposto(imposto);
		
		BigDecimal valorDoimposto 
			= calculadoraDeImposto.calcular(pedido);
		System.out.println(valorDoimposto);
		
//		calculadoraDeImposto.setImposto(new Ipi());
//
//		imposto = calculadoraDeImposto.calcular(pedido);
//		System.out.println(imposto);
		
		//System.out.println(pedido.getTotalDeItens());

	}
	
}
