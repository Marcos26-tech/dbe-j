package loja;

import java.math.BigDecimal;

import loja.situacao.Aberto;
import loja.situacao.HandlerSituacao;
import loja.situacao.Situacao;

public class Pedido {

	//atributos
	private BigDecimal valor;
	private int totalDeItens;
	private Situacao situacao;
	private HandlerSituacao handlerSituacao;

	//construtores
	public Pedido(BigDecimal valor) {
		super();
		this.valor = valor;
		this.totalDeItens = 1;
		this.situacao = new Aberto();
		this.handlerSituacao = new HandlerSituacao();
		
		PedidoFacade.criarPedido(this);
		
	}
	
	public Pedido(BigDecimal valor, int totalDeItens) {
		super();
		this.valor = valor;
		this.totalDeItens = totalDeItens;
		this.situacao = new Aberto();
		this.handlerSituacao = new HandlerSituacao();
		
		PedidoFacade.criarPedido(this);
	}
	
	public void abrirChamado() {
		situacao.abrirChamado();
	}
	
	public void pagar() {
		situacao.pagar(this);
	}

	public void entregar() {
		situacao.entregar(this);
	}

	public void cancelar() {
		situacao.cancelar(this);
	}

	public void reabrir() {
		situacao.reabrir(this);
	}

	//get
	public BigDecimal getValor() {
//		try {
//			Thread.sleep(3000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
		return valor;
	}
	
	public int getTotalDeItens() {
		return totalDeItens;
	}
	
	public void setSituacao(Situacao situacao) {
		getHandlerSituacao().notificar(this);
		this.situacao = situacao;
	}

	public HandlerSituacao getHandlerSituacao() {
		return handlerSituacao;
	}
	
}
