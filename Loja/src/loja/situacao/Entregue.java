package loja.situacao;

import loja.Pedido;

public class Entregue extends Situacao {

	@Override
	public void abrirChamado() {
		System.out.println("Abrir chamado para POS-VENDA");		
	}
	
	@Override
	public void cancelar(Pedido pedido) {
		pedido.setSituacao(new Cancelado());
	}
}
