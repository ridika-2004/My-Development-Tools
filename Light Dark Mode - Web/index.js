const lightMode = document.getElementById('lightmode');
const darkMode = document.getElementById('darkmode');

function applyTheme() {
    if (lightMode.checked) {
        document.body.style.backgroundColor = "white";
        document.body.style.color = "black";
    } else if (darkMode.checked) {
        document.body.style.backgroundColor = "black";
        document.body.style.color = "white";
    }
}

lightMode.addEventListener('change', applyTheme);
darkMode.addEventListener('change', applyTheme);

applyTheme();