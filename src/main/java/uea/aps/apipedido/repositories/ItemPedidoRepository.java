package uea.aps.apipedido.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import uea.aps.apipedido.model.ItemPedido;
import uea.aps.apipedido.model.ItemPedidoPK;

@Repository
public interface ItemPedidoRepository 
	extends JpaRepository<ItemPedido, ItemPedidoPK>  {

}
