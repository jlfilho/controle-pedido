package uea.aps.apipedido.model;

import java.util.Objects;

import uea.aps.apipedido.model.enums.EstadoPedido;

public class Pagamento {
	private Integer id;
	private EstadoPedido estado;
	
	private Pedido pedido;
	
	public Pagamento() {
		super();
	}

	public Pagamento(Integer id, EstadoPedido estado) {
		super();
		this.id = id;
		this.estado = estado;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public EstadoPedido getEstado() {
		return estado;
	}

	public void setEstado(EstadoPedido estado) {
		this.estado = estado;
	}

	public Pedido getPedido() {
		return pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pagamento other = (Pagamento) obj;
		return Objects.equals(id, other.id);
	}
	
}
