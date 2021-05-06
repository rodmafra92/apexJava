//JSON
var pessoas = []

// Veririficar se existe dados no LocalStorage
window.onload = function(){
if(localStorage.getItem("dados") != null){

    pessoas = JSON.parse(localStorage.getItem("dados"))
    listar()
    }

}

//Função de Cadastro
function cadastrar(){

    //obter objetos
    var nome = document.getElementById("nome")
    var idade = document.getElementById("idade")
    var alerta = document.getElementById("alerta")

    //Remover as classes alert-danger e alert-success

    alerta.classList.remove("alert-danger")
    alerta.classList.remove("alert-success")

    //Validar campos
    if(nome.value == ""){
        alerta.classList.add ("alert-danger")
        alerta.innerHTML ="Favor informar o nome."
        return false
    }

    if(idade.value == ""){
        alerta.classList.add ("alert-danger")
        alerta.innerHTML="Favor informar a idade."
        return false
    }

    //Adicionar a classe alert-success
    alerta.classList.add("alert-success")
    alerta.innerHTML="Inserido com sucesso!"

    //Cadastrar no JSON
    pessoas.push({"nome":nome.value, "idade":idade.value})

    //Console
    // console.table(pessoas)

    //limpar campos
    nome.value = ""
    idade.value = ""

    //cursor no campo nome
    nome.focus()

    // Atualizar Tabela
    listar() 

    //Adicionar no localstorage
    adicionarLocalStorage()
}

//  Função de listagem
function listar(){

    //Obter o elemento Tabela
    var tabela = document.getElementById("tabela")

    //limpar a tabela
    tabela.innerHTML = ""

    //Laço
    for(var indice = 0; indice< pessoas.length; indice ++){

        //criar linha
        var linha = tabela.insertRow(-1)

        //criar colunas
        var colunaCodigo = linha.insertCell(0)
        var colunaNome = linha.insertCell(1)
        var colunaIdade = linha.insertCell(2)
        var colunaRemover = linha.insertCell(3)

        //Valores
        colunaCodigo.innerHTML = indice+1
        colunaNome.innerHTML = pessoas[indice].nome
        colunaIdade.innerHTML = pessoas[indice].idade
        colunaRemover.innerHTML = "<button class='btn btn-danger' onClick='remover("+indice+")'>Remover</button>"
    }
}

//função de remoção
function remover(posicao){

    //remover do JSON
    pessoas.splice(posicao, 1)

    // Removeros dados no LocalStorage
    localStorage.removeItem("dados")

    // Enviar o JSON atualizado para o LocalStorage
    localStorage.setItem("dados",JSON.stringify(pessoas))

    //atualizar a tabela
    listar()
}

// Adicionar ao localstorage
function adicionarLocalStorage(){

    localStorage.setItem("dados", JSON.stringify(pessoas))

}