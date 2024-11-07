
import './App.css';
import CadastroFuncionario from './CadastroFuncionario';
import FuncionariodoMes from './FuncionariodoMes';

function App() {
  return (
    <div className="App">
      <h1>Votação Funcionario do Mês: </h1>
      <div className='divVotacao'>
        <FuncionariodoMes foto={"https://64.media.tumblr.com/61189dcca0d74132aca93e9b0b43bda4/tumblr_inline_pcw0660bLQ1qcd72q_400.gifv"} idFunc={"123"} idNomeFunc={"Padre Quemedo"} />
        <FuncionariodoMes foto={"https://64.media.tumblr.com/5a45eb477dde3e0e87280fdc0af00a97/tumblr_ny55wugPnY1sckol7o1_400.gifv"} idFunc={"234"} idNomeFunc={"Hermes e Renato"} />
        <FuncionariodoMes foto={"https://images.uncyc.org/pt/thumb/5/55/Dona_M%C3%A1xima.gif/250px-Dona_M%C3%A1xima.gif"} idFunc={"345"} idNomeFunc={"Dona Máxima"} />
      </div>
    </div>
  );
}

export default App;
