package loja.situacao;

import java.util.ArrayList;
import java.util.List;

import loja.Pedido;

public class HandlerSituacao {
	
	private List<SituacaoListener> listeners;
	
	public HandlerSituacao() {
		listeners = new ArrayList<SituacaoListener>();
	}
	
	public void inscrever(SituacaoListener listener) {
		listeners.add(listener);
	}
	
	public void desinscrever(SituacaoListener listener) {
		listeners.remove(listener);
	}

	public void notificar(Pedido pedido) {
		listeners.forEach(listener -> listener.update(pedido));	
	}
	
	

}
