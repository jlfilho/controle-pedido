package uea.aps.apipedido.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import uea.aps.apipedido.model.Produto;

@Repository
public interface ProdutoRepository 
	extends JpaRepository<Produto, Integer>  {

}
