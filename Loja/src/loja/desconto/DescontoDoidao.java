package loja.desconto;

import java.math.BigDecimal;

import loja.Pedido;

public class DescontoDoidao extends Desconto {

	public DescontoDoidao(Desconto proximo) {
		super(proximo);
	}


	@Override
	protected BigDecimal aplicarDesconto(Pedido pedido) {
		return pedido.getValor();
	}

	@Override
	protected boolean deveAplicar(Pedido pedido) {
		return pedido.getTotalDeItens() % 2 == 0;
	}

}
