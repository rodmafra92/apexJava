
 // JSON  local
var pokemons = []

// Variáveis globais
var lista, modais;

// Após carregar todo o HTML e CSS
window.onload = function(){

// Obtendo o elemento Lista
lista = document.getElementById("lista")

// Obter o local onde serão criados os modais
modais = document.getElementById("modais")

// Realizar uma consulta via API
fetch("https://pokeapi.co/api/v2/pokemon?limit=151")
    .then(dados => dados.json())
    .then(dados => pokemons = dados.results)
    .then(pokemons => {
        for(var i=0;i<pokemons.length;i++){

            // CARD
            var linha = '<div class="col-xl-2 col-sm-6">';
                linha += '<div class="card">'
                    linha += '<img src="https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/'+(i+1)+'.png">'
                    linha += '<p>'+pokemons[i].name+'</p>'
                    linha +='<a href="#" class="btn btn-secondary" data-bs-toggle="modal" data-bs-target="#modal'+i+'">Informações</a>'
                linha += '</div>';
                linha += '</div>'

            lista.innerHTML += linha

            // MODAL
             var modal = '<div class="modal fade" id="modal'+i+'" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">';
                    modal += '<div class="modal-dialog modal-xl">'
                        modal += '<div class="modal-content">'
                            modal +='<div class="modal-header">'
                                modal +='<h1>'+pokemons[i].name+'</h1>'
                                modal +='<button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>'
                            modal += '</div>'

                        modal += '<div class="modal-body">'

                            modal +='<div class="row">'

                                modal += '<div class="col-lg-3 col-md-6">'
                                    modal += '<img src="https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/'+(i+1)+'.png">'
                                    modal+= '<p>Dianteira</p>'
                                modal +='</div>'
                               
                                modal += '<div class="col-lg-3 col-md-6">'
                                    modal += '<img src="https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/back/'+(i+1)+'.png">'
                                    modal+= '<p>Traseira</p>'
                                modal +='</div>'

                                modal+= '<div class="col-lg-3 col-6">'
                                    modal+= '<img src="https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/shiny/'+(i+1)+'.png">'
                                    modal+= '<p>Dianteira - Shining</p>'
                                modal+= '</div>'

                                modal+= '<div class="col-lg-3 col-6">'
                                    modal+= '<img src="https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/back/shiny/'+(i+1)+'.png">'
                                    modal+= '<p>Traseira - Shining</p>'
                                modal+= '</div>'

                            modal +='</div>'
                        modal +='</div>'
                    modal +='</div>'
                modal +='</div>'

            modais.innerHTML += modal
        }
    })

}


// Função de pesquisar
function pesquisar(texto){

    // Limpar lista
    lista.innerHTML = ""

    // Filtrar
    for(var i=0; i<pokemons.length; i++){

        // Extrai o nome do JSON
        var nomePokemon = pokemons[i].name;

        // Caso não encontre aquele termo, retorna -1. Todos os nomes diferente de -1 serão exibidos
        if(nomePokemon.indexOf(texto) != -1){
       
            // CARD
            var linha = '<div class="col-xl-2 col-sm-4">'
                    linha += '<a href="#" class="card" data-bs-toggle="modal" data-bs-target="#modal'+i+'">'
                        linha += '<img src="https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/'+(i+1)+'.png">'
                        linha += '<p>'+pokemons[i].name+'</p>'
                        linha += '<button class="btn btn-secondary">Informações</button>'
                    linha += '</a>'
                linha += '</div>'

            lista.innerHTML += linha
          
        }
    }

}
