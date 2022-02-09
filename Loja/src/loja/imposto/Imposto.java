package loja.imposto;

import java.math.BigDecimal;

import loja.Pedido;

public interface Imposto {
	
	BigDecimal calcular(Pedido pedido);

}
