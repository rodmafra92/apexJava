// importar modulo react
import React from 'react';

// Classe
class Contador extends React.Component{

    // Construtor
    constructor(props){
        super(props)

        this.state = {contador :0}
    }

    // Função Incrementar
    incrementar = () => {
        var valor = this.state.contador +1;
        this.setState({contador : valor})

    }

    // Função Decrementar
    decrementar = () => {
        var valor = this.state.contador -1;
        this.setState({contador: valor})
    }


    // Render
    render(){
        return(
            <div>
                <h1>{this.state.contador}</h1>
                <br />
                <button onClick={this.incrementar}>+1</button>
                <button onClick={this.decrementar}>-1</button>
            </div>
        )

    }

}

// Exportar
export default Contador;