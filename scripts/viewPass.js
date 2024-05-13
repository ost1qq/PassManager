const sendRequest = require('./fetch');

const fbLogin = document.getElementById("fb-login-id");
const fbPassword = document.getElementById("fb-password-id");
const fbViewBtn = document.getElementById("fb-view-id");
const instLogin = document.getElementById("inst-login-id");
const instPassword = document.getElementById("inst-password-id");
const instViewBtn = document.getElementById("inst-view-id");
const googleLogin = document.getElementById("google-login-id");
const googlePassword = document.getElementById("google-password-id");
const googleViewBtn = document.getElementById("google-view-id");

async function getSocialMediaData() {
    try {
        const fbResponse = await sendRequest('GET', '');
        const fbData = await fbResponse.json();

        const instResponse = await sendRequest('GET', '');
        const instData = await instResponse.json();

        const googleResponse = await sendRequest('GET', '');
        const googleData = await googleResponse.json();

        return {
            facebook: fbData,
            instagram: instData,
            google: googleData
        };
    } catch (error) {
        console.error('Помилка отримання даних:', error);
        return null;
    }
}

window.onload = function() {
    getSocialMediaData().then(socialMediaData => {
        fillLoginInputs(socialMediaData);
        fbViewBtn.addEventListener("mousedown", function(event) {
            fillPassword(fbPassword, socialMediaData, 'facebook');
        });

        instViewBtn.addEventListener("mousedown", function(event) {
            fillPassword(instPassword, socialMediaData, 'instagram');
        });

        googleViewBtn.addEventListener("mousedown", function(event) {
            fillPassword(googlePassword, socialMediaData, 'google');
        });
    });
};

function fillLoginInputs(socialMediaData) {
    if (socialMediaData) {
        fbLogin.value = socialMediaData.facebook.login;
        instLogin.value = socialMediaData.instagram.login;
        googleLogin.value = socialMediaData.google.login;
    }
}

function fillPassword(inputElement, socialMediaData, platform) {
    if (socialMediaData && socialMediaData[platform]) {
        inputElement.value = socialMediaData[platform].password;
    }
}

module.exports = sendRequest;
