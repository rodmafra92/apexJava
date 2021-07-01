package br.com.apex.clientes.repositorio;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.apex.clientes.modelo.ClientModelo;

/*
    Repository - Ações base de banco de dados (SELECT, INSERT, UPDATE e DELETE)

    CrudRepository - Além de funções CRUD, podemos trabalhar com: AND, OR, LIKE, BETWEEN, IN e WHERE

    JpaRepository - Trabalha com todas as funções do Repository e CrudRepository, alem de paginação.
*/

@Repository
public interface RepositorioCliente  extends CrudRepository<ClientModelo, Integer>{

    // Cadastrar
    <Cli extends ClientModelo> Cli save(ClientModelo cm);
    
    // Listar
    List<ClientModelo> findAll();

    // Ordenar listagem (ASC = Crescente ou DESC = Decrescente)
    List<ClientModelo> findByOrderByNomeAsc();

    // Operadores lógicos (E - AND, OU - OR)
    ClientModelo findByNomeAndCidade(String nome, String cidade);

    // Contêm determinado termo (LIKE)
    List<ClientModelo> findByNomeContains(String termo);
}
