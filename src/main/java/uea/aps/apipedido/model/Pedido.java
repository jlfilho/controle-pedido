package uea.aps.apipedido.model;

import java.time.Instant;
import java.util.Objects;

public class Pedido {
	private Integer id;
	private Instant dataPedido;
	
	public Pedido() {
		super();
	}

	public Pedido(Integer id, Instant dataPedido) {
		super();
		this.id = id;
		this.dataPedido = dataPedido;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Instant getDataPedido() {
		return dataPedido;
	}

	public void setDataPedido(Instant dataPedido) {
		this.dataPedido = dataPedido;
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
		Pedido other = (Pedido) obj;
		return Objects.equals(id, other.id);
	}
	

}
