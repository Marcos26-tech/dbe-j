package loja;

import java.math.BigDecimal;

public class Pedido {

	//atributos
	private BigDecimal valor;
	private int totalDeItens;

	//construtores
	public Pedido(BigDecimal valor) {
		super();
		this.valor = valor;
		this.totalDeItens = 1;
	}
	
	public Pedido(BigDecimal valor, int totalDeItens) {
		super();
		this.valor = valor;
		this.totalDeItens = totalDeItens;
	}

	//get
	public BigDecimal getValor() {
		return valor;
	}
	
	public int getTotalDeItens() {
		return totalDeItens;
	}
	
}
