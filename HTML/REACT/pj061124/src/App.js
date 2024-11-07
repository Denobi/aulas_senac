
import './App.css';
import CadastroFuncionario from './CadastroFuncionario';
import FuncionariodoMes from './FuncionariodoMes';

function App() {
  return (
    <div className="App">
      <h1>Votação Funcionario do Mês: </h1>
     <FuncionariodoMes foto={"https://64.media.tumblr.com/61189dcca0d74132aca93e9b0b43bda4/tumblr_inline_pcw0660bLQ1qcd72q_400.gifv"}idFunc={"123"}idNomeFunc={"Padre Quemedo"}/>
     <FuncionariodoMes foto={"https://64.media.tumblr.com/61189dcca0d74132aca93e9b0b43bda4/tumblr_inline_pcw0660bLQ1qcd72q_400.gifv"}idFunc={"123"}idNomeFunc={"Padre Quemedo"}/>
     <FuncionariodoMes foto={"https://64.media.tumblr.com/61189dcca0d74132aca93e9b0b43bda4/tumblr_inline_pcw0660bLQ1qcd72q_400.gifv"}idFunc={"123"}idNomeFunc={"Padre Quemedo"}/>
    </div>
  );
}

export default App;
