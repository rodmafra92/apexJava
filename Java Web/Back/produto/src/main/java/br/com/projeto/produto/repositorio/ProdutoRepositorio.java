package br.com.projeto.produto.repositorio;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import br.com.projeto.produto.modelo.ProdutoModelo;

public interface ProdutoRepositorio extends CrudRepository<ProdutoModelo, Integer> {

	// Cadastrar e Alterar
	ProdutoModelo save (ProdutoModelo pm);
	
	// Listar Produtos
	List<ProdutoModelo> findAll();
	
	// Pesquisa
	ProdutoModelo findByCodigo(int codigo);
	
	// Remover - Excluir
	void delete(ProdutoModelo pm);
	
}
