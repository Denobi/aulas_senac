const TMDB_API_KEY = "05eb09e1d40526586ab7c6583572ed11"; // Substitua pela sua chave de API do TMDB

// Função para buscar filmes e seus atores
function searchMovie() {
  const movieSearch = [
    "Inception", "The Dark Knight", "Interstellar", "Fight Club", 
    "Pulp Fiction", "Forrest Gump", "The Shawshank Redemption", 
    "The Godfather", "The Matrix", "Avengers: Endgame"
  ];

  let sliderIndex = 0;
  const movieSlider = document.getElementById('movie-slider');
  movieSlider.innerHTML = ''; // Limpar qualquer conteúdo existente no slider

  movieSearch.forEach(movieTitle => {
    const url = `https://api.themoviedb.org/3/search/movie?api_key=${TMDB_API_KEY}&query=${encodeURIComponent(movieTitle)}&language=pt-BR`;

    fetch(url)
      .then(response => response.json())
      .then(data => {
        if (data.results && data.results.length > 0) {
          data.results.forEach(movie => {
            if (movie.poster_path) {
              // Obter os detalhes do filme, incluindo os atores
              getMovieCredits(movie.id, sliderIndex++, movie);
            }
          });
        } else {
          document.getElementById('movie-results').innerHTML = "Filmes não encontrados.";
        }
      })
      .catch(error => console.error('Erro ao buscar filmes:', error));
  });
}

// Função para obter os créditos (atores) do filme
function getMovieCredits(movieId, index, movie) {
  const creditsUrl = `https://api.themoviedb.org/3/movie/${movieId}/credits?api_key=${TMDB_API_KEY}&language=pt-BR`;

  fetch(creditsUrl)
    .then(response => response.json())
    .then(creditsData => {
      const cast = creditsData.cast.slice(0, 5); // Limita os 5 primeiros atores
      displayBanner(movie, cast, index);
    })
    .catch(error => console.error('Erro ao buscar atores:', error));
}

// Função para exibir o banner com o filme e os atores no carrossel
function displayBanner(movie, cast, index) {
  const banner = document.getElementById('movie-slider');

  const carouselItem = document.createElement('div');
  carouselItem.classList.add('carousel-item');
  
  if (index === 0) {
    carouselItem.classList.add('active');
  }

  const posterUrl = `https://image.tmdb.org/t/p/w500${movie.poster_path}`; // URL do poster

  // Exibe o banner do filme, incluindo os atores
  carouselItem.innerHTML = `
    <img src="${posterUrl}" alt="${movie.title}">
    <div class="carousel-caption">
      <h3>${movie.title}</h3>
      <p><strong>Atores:</strong> ${cast.map(actor => actor.name).join(', ')}</p>
      <div class="rating">⭐Ano de Lançamento: ${movie.release_date.split('-')[0]}</div>
    </div>
  `;

  banner.appendChild(carouselItem);
}

// Função para buscar atores e exibi-los em um carrossel separado
function searchActors() {
  const movieSearch = [
    "Inception", "The Dark Knight", "Interstellar", "Fight Club", 
    "Pulp Fiction", "Forrest Gump", "The Shawshank Redemption", 
    "The Godfather", "The Matrix", "Avengers: Endgame"
  ];

  const actorSlider = document.getElementById('actor-slider');
  actorSlider.innerHTML = ''; // Limpa qualquer conteúdo anterior no slider

  movieSearch.forEach(movieTitle => {
    const url = `https://api.themoviedb.org/3/search/movie?api_key=${TMDB_API_KEY}&query=${encodeURIComponent(movieTitle)}&language=pt-BR`;

    fetch(url)
      .then(response => response.json())
      .then(data => {
        if (data.results && data.results.length > 0) {
          data.results.forEach(movie => {
            if (movie.poster_path) {
              // Obter os créditos (atores) do filme
              getMovieCreditsForActors(movie.id);
            }
          });
        } else {
          document.getElementById('actor-results').innerHTML = "Nenhum ator encontrado.";
        }
      })
      .catch(error => console.error('Erro ao buscar filmes para atores:', error));
  });
}

// Função para obter os créditos (atores) de um filme para o carrossel de atores
function getMovieCreditsForActors(movieId) {
  const creditsUrl = `https://api.themoviedb.org/3/movie/${movieId}/credits?api_key=${TMDB_API_KEY}&language=pt-BR`;

  fetch(creditsUrl)
    .then(response => response.json())
    .then(creditsData => {
      const cast = creditsData.cast.slice(0, 5); // Limita a exibição aos 5 primeiros atores
      displayActors(cast);
    })
    .catch(error => console.error('Erro ao buscar atores:', error));
}

// Função para exibir os atores no carrossel de atores
function displayActors(cast) {
  const actorSlider = document.getElementById('actor-slider');

  cast.forEach(actor => {
    const actorItem = document.createElement('div');
    actorItem.classList.add('carousel-item');
    
    // Verifica se é o primeiro item para adicionar a classe 'active'
    if (actorSlider.children.length === 0) {
      actorItem.classList.add('active');
    }

    // URL da imagem do ator
    const actorImageUrl = actor.profile_path 
      ? `https://image.tmdb.org/t/p/w200${actor.profile_path}` 
      : 'https://via.placeholder.com/200x300?text=No+Image'; // Imagem padrão caso não tenha foto

    // Adiciona o conteúdo do ator no carrossel
    actorItem.innerHTML = `
      <img src="${actorImageUrl}" alt="${actor.name}">
      <div class="carousel-caption">
        <h5>${actor.name}</h5>
      </div>
    `;

    actorSlider.appendChild(actorItem);
  });
}

// Chama as funções de busca assim que a página for carregada
document.addEventListener('DOMContentLoaded', () => {
  searchMovie();  // Buscar filmes e atores
  searchActors(); // Buscar atores e exibi-los no carrossel
});

