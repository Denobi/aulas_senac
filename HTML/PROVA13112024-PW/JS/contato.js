document.getElementById('contact-form').addEventListener('submit', function(event) {
    event.preventDefault();
  
    // Obter os valores dos campos do formulário
    const name = document.getElementById('name').value;
    const email = document.getElementById('email').value;
    const messageType = document.getElementById('message-type').value;
    const message = document.getElementById('message').value;
  
    // Criar um objeto de mensagem
    const contactMessage = {
      name: name,
      email: email,
      messageType: messageType,
      message: message,
      date: new Date().toLocaleString()
    };
  
    // Verificar se já existe algum contato salvo no LocalStorage
    let messages = JSON.parse(localStorage.getItem('contactMessages')) || [];
  
    // Adicionar a nova mensagem ao array
    messages.push(contactMessage);
  
    // Armazenar o array atualizado no LocalStorage
    localStorage.setItem('contactMessages', JSON.stringify(messages));
  
    // Exibir mensagem de confirmação
    document.getElementById('response-message').textContent = 'Sua mensagem foi enviada com sucesso!';
  
    // Limpar os campos do formulário
    document.getElementById('contact-form').reset();
  });