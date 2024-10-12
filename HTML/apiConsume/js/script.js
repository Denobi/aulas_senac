
const CEPInput = document.getElementById("txtCEP");

const formCapture = document.getElementById('frmCEP');


const txtRua = document.getElementById("txtRua");
const txtBairro = document.getElementById("txtBairro");
const txtCidade = document.getElementById("txtCidade");
const txtUF = document.getElementById("txtUF");
window.onload = function () {
    
    CEPInput.addEventListener('blur', function () {
        if (CEPInput.value.length === 8) {
            const CEPV = CEPInput.value;
            const url = `https://viacep.com.br/ws/${CEPV}/json/`;
            

            fetch(url)
                .then(response => response.json())
                .then(data => {
                   txtRua.value = data.logradouro;
                   txtBairro.value =data.bairro;
                   txtCidade.value =data.localidade;
                   txtUF.value =data.uf;
                })
                .catch(error => {
                    console.error('Erro:', error);
                });
        }
        if (CEPInput.value.length > 8) {
            alert('TAMANHO DE CEP INVÁLIDO');
        }
    });


}

