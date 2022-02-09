package loja.test;

import java.math.BigDecimal;

import loja.Pedido;
import loja.imposto.Imposto;

public class Ipi implements Imposto {

	@Override
	public BigDecimal calcular(Pedido pedido) {
		return pedido.getValor().multiply(new BigDecimal(0.04));
	}

}
