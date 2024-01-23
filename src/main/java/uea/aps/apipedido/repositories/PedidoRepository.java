package uea.aps.apipedido.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import uea.aps.apipedido.model.Pedido;

@Repository
public interface PedidoRepository 
	extends JpaRepository<Pedido, Integer>  {

}
