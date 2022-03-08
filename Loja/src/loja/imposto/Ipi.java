package loja.imposto;

import java.math.BigDecimal;

import loja.Pedido;

public class Ipi extends Imposto {

	public Ipi(Imposto outroImposto) {
		super(outroImposto);
	}

	@Override
	public BigDecimal calcular(Pedido pedido) {
		BigDecimal valorDoImposto = pedido.getValor().multiply(new BigDecimal(0.04));
		BigDecimal valorDoOutroImposto = BigDecimal.ZERO;
		
		if( outroImposto != null) {
			valorDoOutroImposto = outroImposto.calcular(pedido);
		}
		
		return valorDoImposto.add(valorDoOutroImposto); 
	}

}
