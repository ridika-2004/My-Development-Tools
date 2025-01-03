window.alert(`This is an alert`);

document.getElementById("myh").textContent = `Hello`;
document.getElementById("myp").textContent = `I'm learning javascript`;

let name = "Ridika";
let isStudent = true;
let favLanguage = "C++";

document.getElementById("p1").textContent = `My name is ${name}`;
document.getElementById("p2").textContent = `Am I a student? ${isStudent}`;
document.getElementById("p3").textContent = `My favourite language for programming is ${favLanguage}`;

const pi = 3.1416;
let radius,circumference;

document.getElementById("mysubmit").onclick =  function(){
    radius = document.getElementById("mytext").value;
    radius = Number(radius);

    circumference =  2*radius*pi;

    document.getElementById("myh3").textContent = circumference + ` unit`;
}