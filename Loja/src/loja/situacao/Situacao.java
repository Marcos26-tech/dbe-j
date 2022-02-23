package loja.situacao;

import loja.Pedido;
import loja.exceptions.SituacaoException;

public abstract class Situacao {
	
	public abstract void abrirChamado();
	
	public void pagar(Pedido pedido) {
		throw new SituacaoException("Não pode transitar para Pago");
	}
	
	public void entregar(Pedido pedido) {
		throw new SituacaoException("Não pode transitar para Entregue");
	}
	
	public void cancelar(Pedido pedido) {
		throw new SituacaoException("Não pode transitar para Cancelado");
	}
	
	public void reabrir(Pedido pedido) {
		throw new SituacaoException("Não pode transitar para Aberto");
	}

}
