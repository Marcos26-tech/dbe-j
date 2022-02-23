package loja.test;

import java.math.BigDecimal;

import loja.Pedido;
import loja.situacao.EmailListener;
import loja.situacao.LogListener;

public class TestaSituacao {
	
	public static void main(String[] args) {
		
		Pedido pedido = new Pedido(new BigDecimal(100));
		pedido.getHandlerSituacao().inscrever(new EmailListener());
		pedido.getHandlerSituacao().inscrever(new LogListener());
		
		pedido.abrirChamado();
		
		pedido.pagar();
		pedido.abrirChamado();
	
		pedido.entregar();
		pedido.abrirChamado();
		
		pedido.reabrir();
	}

}
