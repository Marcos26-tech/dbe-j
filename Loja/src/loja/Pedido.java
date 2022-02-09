package loja;

import java.math.BigDecimal;

public class Pedido {

	//atributos
	private BigDecimal valor;

	//construtor
	public Pedido(BigDecimal valor) {
		super();
		this.valor = valor;
	}
	
	//get
	public BigDecimal getValor() {
		return valor;
	}
	
}
