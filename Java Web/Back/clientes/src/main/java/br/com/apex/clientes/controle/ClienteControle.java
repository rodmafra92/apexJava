package br.com.apex.clientes.controle;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.apex.clientes.modelo.ClientModelo;
import br.com.apex.clientes.repositorio.RepositorioCliente;

/**
 * ClienteControle
 */
@RestController
public class ClienteControle {

    @Autowired
    private RepositorioCliente acoes;

    @GetMapping(value="")
    public String helloWorld(){
        return "Hello World";
    }

    @PostMapping(value="/api")
    public @ResponseBody ClientModelo cadastrar(@RequestBody ClientModelo cm){
        return acoes.save(cm);
    }

    @GetMapping(value="/api")
    public List<ClientModelo> listar(){
        return acoes.findAll();
    }

    @GetMapping(value="/api/nomes")
    public List<ClientModelo> listaPorNomes(){
        return acoes.findByOrderByNomeAsc();
    }

    @GetMapping(value="/api/{nome}/{cidade}")
    public ClientModelo operadorE(@PathVariable String nome, @PathVariable String cidade){
        return acoes.findByNomeAndCidade(nome, cidade);
    }

    @GetMapping(value="/api/contem/{termo}")
    public List<ClientModelo> contem(@PathVariable String termo){
        return acoes.findByNomeContains(termo);
    }
}