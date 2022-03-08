package loja.test;

import java.math.BigDecimal;

import loja.Pedido;
import loja.PedidoProxy;
import loja.situacao.EmailListener;
import loja.situacao.LogListener;

public class TestaProxy {
	
	public static void main(String[] args) {
		// cache
		
		Pedido pedido = new PedidoProxy( new Pedido(new BigDecimal(100)) );
		pedido.getHandlerSituacao().inscrever(new EmailListener());
		pedido.getHandlerSituacao().inscrever(new LogListener());
		
		System.out.println(pedido.getValor());
		
		pedido.pagar();
		
		pedido.entregar();
		
	}

}
