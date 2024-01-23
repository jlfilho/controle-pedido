package uea.aps.apipedido.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import uea.aps.apipedido.model.Pagamento;

@Repository
public interface PagamentoRepository 
	extends JpaRepository<Pagamento, Integer>  {

}
