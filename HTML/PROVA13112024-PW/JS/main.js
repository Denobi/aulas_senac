

  let currentIndex = 0;

    function showSlide(index) {
      const carousel = document.querySelector('.carousel');
      const totalItems = document.querySelectorAll('.carousel-item').length;

      if (index >= totalItems) {
        currentIndex = 0;
      } else if (index < 0) {
        currentIndex = totalItems - 1;
      } else {
        currentIndex = index;
      }

      carousel.style.transform = `translateX(-${currentIndex * 100}%)`;
    }

    function nextSlide() {
      showSlide(currentIndex + 1);
    }

    function prevSlide() {
      showSlide(currentIndex - 1);
    }

    function coments (){

      const messagesList = document.getElementById('messages-list');
      const messages = JSON.parse(localStorage.getItem('contactMessages')) || [];
  
      messages.forEach((message) => {
        const messageElement = document.createElement('div');
        messageElement.innerHTML = `
        <div class="card">
        <h2>${message.messageType.toUpperCase()}</h2>
        <p><strong>Nome:</strong> ${message.name}</p>
        <p><strong>Email:</strong> ${message.email}</p>
        <p><strong>Data:</strong> ${message.date}</p>
        <p><strong>Mensagem:</strong> ${message.message}</p>
        <hr>
        </div>
        `;
        messagesList.appendChild(messageElement);
      });
    }
