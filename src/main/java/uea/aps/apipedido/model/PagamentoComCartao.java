package uea.aps.apipedido.model;

import uea.aps.apipedido.model.enums.EstadoPedido;

public class PagamentoComCartao extends Pagamento {
	private Integer numeroDeParcelas;

	public PagamentoComCartao() {
		super();
	}

	public PagamentoComCartao(Integer id, EstadoPedido estado, Integer numeroDeParcelas) {
		super(id, estado);
		this.numeroDeParcelas = numeroDeParcelas;
	}

	public Integer getNumeroDeParcelas() {
		return numeroDeParcelas;
	}

	public void setNumeroDeParcelas(Integer numeroDeParcelas) {
		this.numeroDeParcelas = numeroDeParcelas;
	}
	
}
