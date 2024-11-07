import React, { useState } from 'react'


function FuncionariodoMes ({foto,idFunc,idNomeFunc}){
    const [likes, setLikes]=useState(0);
    const ChamarBotao = ()=>{
        setLikes(likes+1);
    }
    const ChamarBotaoDesc = ()=>{
        setLikes(likes-1);
    }
    return(

      <div>
        {

        <img src={foto}/>
        }
        {
            <h2>Matricula: {idFunc}</h2>
        }
        {
            <h3>Nome: {idNomeFunc}</h3>
        }
        {
            <button onClick={ChamarBotao}>Curtir</button>
        }
        {
            
            <button onClick={ChamarBotaoDesc}>Descurtir</button>
        }

        {
            <p>Total de Curtidas: {likes}</p>
        }
      </div>
    )
   
}


export default FuncionariodoMes
