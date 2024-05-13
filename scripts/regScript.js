const sendRequest = require('./fetch');

const form = document.getElementById('regFromId');
const usernameInput = document.getElementById('usernameIdReg');
const passwordInput = document.getElementById('passwordIdReg');
const rePasswordInput = document.getElementById('rePasswordIdReg');
const errorMessage = document.querySelector('.error-message');

const requestURL = '';

const body = {
    regLogin: usernameInput.value,
    regPassword: passwordInput.value,
}


function sendRegistrationData() {
    sendRequest('POST', requestURL, body)
        .then(responseData => {
            console.log('Відповідь від сервера:', responseData);
        })
        .catch(error => {
            console.error('Помилка відправки запиту:', error);
        });
}

form.addEventListener('submit', function(event) {
    if (passwordInput.value !== rePasswordInput.value) {
        errorMessage.textContent = 'Паролі не співпадають! Повторіть введення.';
        errorMessage.style.display = 'flex';
        event.preventDefault();
        return;
    }

    const passwordRegex = /^(?=.*\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#$%^&*]).{8,}$/;
    if (!passwordRegex.test(passwordInput.value)) {
        errorMessage.textContent = 'Пароль повинен містити як мінімум одну цифру, одну маленьку та велику літеру, та один спеціальний символ, і бути не менше 8 символів у довжину.';
        errorMessage.style.display = 'flex';
        event.preventDefault();
        return;
    }

    errorMessage.textContent = ''; 
    errorMessage.style.display = 'none';
    sendRegistrationData();
});


