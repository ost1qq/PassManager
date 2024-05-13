const sendRequest = require('./fetch');

const form = document.getElementById('authFormId');
const usernameInput = document.getElementById('usernameIdAuth');
const passwordInput = document.getElementById('passwordIdAuth');
const errorMessage = document.querySelector('.error-message');

const requestURL = '';

form.addEventListener('submit', function (event) {
    event.preventDefault();

    const body = {
        regLogin: usernameInput.value,
        regPassword: passwordInput.value,
    };

    sendRequest('POST', requestURL, body)
        .then(responseData => {
            if (responseData === null) {
                errorMessage.textContent = 'Логін або пароль неправильний. Спробуйте ще раз.';
                errorMessage.style.display = 'flex';
            } else {
                window.location.href = 'manager.html';

            }
        })
        .catch(error => {
            console.error('Помилка відправки запиту:', error);
            errorMessage.textContent = 'Сталася помилка при обробці запиту. Спробуйте ще раз пізніше.';
            errorMessage.style.display = 'flex';
        });
});
