package loja.exceptions;

public class SituacaoException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	public SituacaoException(String mensagem) {
		super(mensagem);
	}

}
