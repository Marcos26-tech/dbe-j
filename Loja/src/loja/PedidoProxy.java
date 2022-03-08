package loja;

import java.math.BigDecimal;

public class PedidoProxy extends Pedido {

	private Pedido pedido;
	private BigDecimal valor; //cache

	public PedidoProxy(Pedido pedido) {
		super(pedido.getValor(), pedido.getTotalDeItens());
		this.pedido = pedido;
	}

	@Override
	public BigDecimal getValor() {
		if(valor == null) {
			valor = pedido.getValor();
		}
		return valor;
	}
	
	

}
