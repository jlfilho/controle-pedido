package uea.aps.apipedido.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import uea.aps.apipedido.model.Cidade;

@Repository
public interface CidadeRepository 
	extends JpaRepository<Cidade, Integer>  {

}
