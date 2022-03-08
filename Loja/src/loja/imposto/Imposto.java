package loja.imposto;

import java.math.BigDecimal;

import loja.Pedido;

public abstract class Imposto {
	
	protected Imposto outroImposto;
	
	public Imposto(Imposto outroImposto) {
		super();
		this.outroImposto = outroImposto;
	}



	abstract BigDecimal calcular(Pedido pedido);

}
