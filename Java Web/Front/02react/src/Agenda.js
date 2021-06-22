// importar modulo react
import React from 'react';

// Importar CSS
import './estilos.css'

// Classe
class Agenda extends React.Component{

    // Render
    render(){
        return(
            <div>
                {/* FORMULÁRIO */}
                <form>
                    <input type='text' placeholder='Nome' className='form-control' />
                    <input type='text' placeholder='E-mail' className='form-control' />
                    <input type='text' placeholder='Cidade' className='form-control' />
                    <input type='button' value='Cadastrar' className='btn btn-primary' />
                </form>

                {/* TABELA PARA LISTAR */}

                <table className='table table-striped'>
                    <thead>
                        <tr>
                            <th>#</th>
                            <th>Nome</th>
                            <th>E-mail</th>
                            <th>Cidade</th>
                        </tr>
                    </thead>

                    <tbody>
                        <tr>
                            <td>1</td>
                            <td>Lucas</td>
                            <td>lucas.silva@gmail.com</td>
                            <td>Blumenau</td>
                        </tr>
                    </tbody>
                </table>

            </div>
        )
    }

}

// Exportar
export default Agenda;