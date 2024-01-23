package uea.aps.apipedido.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import uea.aps.apipedido.model.Endereco;

@Repository
public interface EnderecoRepository 
	extends JpaRepository<Endereco, Integer>  {

}
