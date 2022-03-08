package loja.situacao;

import loja.Pedido;

public class LogListener implements SituacaoListener {

	@Override
	public void update(Pedido pedido) {
		System.out.println("Log de mudança de situaçao do pedido "
					+ pedido + " no valor de " + pedido.getValor());	
	}

}
