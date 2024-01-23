package uea.aps.apipedido.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import uea.aps.apipedido.model.Cliente;

@Repository
public interface ClienteRepository 
	extends JpaRepository<Cliente, Integer>  {

}
