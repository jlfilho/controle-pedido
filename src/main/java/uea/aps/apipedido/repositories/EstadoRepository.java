package uea.aps.apipedido.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import uea.aps.apipedido.model.Estado;

@Repository
public interface EstadoRepository 
	extends JpaRepository<Estado, Integer>  {

}
