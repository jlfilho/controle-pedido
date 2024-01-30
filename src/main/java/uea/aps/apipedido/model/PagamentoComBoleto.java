package uea.aps.apipedido.model;

import java.time.Instant;

import jakarta.persistence.Entity;
import uea.aps.apipedido.model.enums.EstadoPedido;

@Entity
public class PagamentoComBoleto extends Pagamento {
	private Instant dataVencimento;
	private Instant dataPagamento;
	
	public PagamentoComBoleto() {
		super();
	}

	public PagamentoComBoleto(Integer id, EstadoPedido estado, Instant dataVencimento, Instant dataPagamento) {
		super(id, estado);
		this.dataVencimento = dataVencimento;
		this.dataPagamento = dataPagamento;
	}

	public Instant getDataVencimento() {
		return dataVencimento;
	}

	public void setDataVencimento(Instant dataVencimento) {
		this.dataVencimento = dataVencimento;
	}

	public Instant getDataPagamento() {
		return dataPagamento;
	}

	public void setDataPagamento(Instant dataPagamento) {
		this.dataPagamento = dataPagamento;
	}
	

}
