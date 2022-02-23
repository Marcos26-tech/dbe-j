package loja.situacao;

import loja.Pedido;

public class Cancelado extends Situacao {

	@Override
	public void abrirChamado() {
		System.out.println("Abrir chamado para COMERCIAL");
	}
	
	@Override
	public void reabrir(Pedido pedido) {
		pedido.setSituacao(new Aberto());
	}

}
