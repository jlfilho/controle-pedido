package uea.aps.apipedido;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import uea.aps.apipedido.model.Categoria;
import uea.aps.apipedido.model.Produto;

@SpringBootApplication
public class ApiPedidoApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ApiPedidoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Categoria c1 = new Categoria(1, "Informática");
		Categoria c2 = new Categoria(2, "Eletromomésticos");
		
		Produto p1 = new Produto(1, "Mouse", 75.00);
		p1.getCategorias().add(c1);
		System.out.println(p1.getCategorias().get(0).getNome());
		
		
		Produto p2 = new Produto(2, "Teclado", 140.00);
		Produto p3 = new Produto(3, "Monitor", 1800.00);
		
		/*c1.getProdutos().add(p1);
		c1.getProdutos().add(p2);
		c1.getProdutos().add(p3);*/
		
		//System.out.println(c1.getId()+" - " + c1.getNome());
		//System.out.println(c2.getId()+" - " + c2.getNome());
		
		//System.out.println(p1.getId()+" - " + p1.getNome() + " -" + p1.getPreco());
		//System.out.println(p2.getId()+" - " + p2.getNome() + " -" + p2.getPreco());
		
		System.out.println(c1.getId()+" - " + c1.getNome());
		
		/*for (Produto p : c1.getProdutos()) {
			System.out.println("\t" + p.getId()+" - " 
		+ p.getNome() + " -" + p.getPreco());
		}*/
		
		
	}

}
