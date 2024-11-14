// function register() {
//     const name = document.getElementById('register-name').value;
//     const email = document.getElementById('register-email').value;
//     const password = document.getElementById('register-password').value;
  
//     const user = { name, email, password };
//     localStorage.setItem(email, JSON.stringify(user));
//     alert('Cadastro realizado com sucesso!');
//   }
  
//   function login() {
//     const email = document.getElementById('login-email').value;
//     const password = document.getElementById('login-password').value;
  
//     const user = JSON.parse(localStorage.getItem(email));
//     if(email != "" && password !=""){
//       if (user.email === email && user.password === password) {
//         alert(`Bem-vindo, ${user.name}!`);
//         // Redirecionamento para página inicial
//         window.location.href = 'index.html';
//       } else {
//         alert('Credenciais incorretas!');
//       }
//     }else{
//       alert("Preencha o campo de Email e Senha")
//     }
    
//   }

document.addEventListener("DOMContentLoaded", function() {
  const registerForm = document.getElementById("register-form");
  const loginForm = document.getElementById("login-form");
  const toggleButton = document.createElement("div");
  
  toggleButton.classList.add("toggle-button");
  toggleButton.innerText = "Já tem uma conta? Faça login";
  document.getElementById("auth-forms").appendChild(toggleButton);

  toggleButton.addEventListener("click", function() {
      if (registerForm.style.display === "none" || registerForm.style.display === "") {
          registerForm.style.display = "block";
          loginForm.style.display = "none";
          toggleButton.innerText = "Já tem uma conta? Faça login";
      } else {
          registerForm.style.display = "none";
          loginForm.style.display = "block";
          toggleButton.innerText = "Não tem uma conta? Cadastre-se";
      }
  });

  // Inicializa o formulário de cadastro escondido
  registerForm.style.display = "none";

  // Função para registrar um novo usuário
  window.register = function() {
      const name = document.getElementById("register-name").value;
      const email = document.getElementById("register-email").value;
      const password = document.getElementById("register-password").value;

      if (name && email && password) {
          const user = { name, email, password };
          localStorage.setItem(email, JSON.stringify(user));
          alert("Cadastro realizado com sucesso!");
          registerForm.reset(); // Limpa o formulário
          loginForm.style.display = "block"; // Exibe o formulário de login
          toggleButton.innerText = "Não tem uma conta? Cadastre-se"; // Atualiza o texto do botão
      } else {
          alert("Por favor, preencha todos os campos.");
      }
  };

  // Função para fazer login
  window.login = function() {
      const email = document.getElementById("login-email").value;
      const password = document.getElementById("login-password").value;

      const user = JSON.parse(localStorage.getItem(email));

      if (user && user.password === password) {
          alert("Login realizado com sucesso!");
          window.location.href = 'index.html';
          // Aqui você pode redirecionar o usuário ou realizar outras ações
      } else {
          alert("E-mail ou senha incorretos.");
      }
  };
});