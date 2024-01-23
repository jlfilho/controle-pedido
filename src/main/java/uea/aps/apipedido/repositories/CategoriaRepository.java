package uea.aps.apipedido.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import uea.aps.apipedido.model.Categoria;

@Repository
public interface CategoriaRepository 
	extends JpaRepository<Categoria, Integer>  {

}
