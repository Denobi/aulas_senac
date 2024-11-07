import React from 'react'
import { useForm} from 'react-hook-form'

export default function CadastroFuncionario() {
    const {handleSubmit, reset} = useForm();
    const cadFunc = data =>{
        alert("CADASTRO EFETUADO COM SUCESSO")
        reset();
        
    }
  return (
    <form onSubmit={handleSubmit(cadFunc)}>
        <div>
            <label htmlFor='idFunc'>Code do Func: </label>
            <input id='idFunc' type='text'/>
        </div>
        <div>
            <label htmlFor='idNomeFunc'>Nome do Func: </label>
            <input id='idNomeFunc' type='text'/>
        </div>
        <div>
            
            <button type='submit'>Cadastrar</button>
        </div>
       
    </form>
  )
}

