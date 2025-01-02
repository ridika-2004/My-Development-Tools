let name;
//name = window.prompt("What's your username?");

document.getElementById("mysubmit").onclick = function(){
    name = document.getElementById("mytext").value;
    //console.log(name);
    document.getElementById("myh1").textContent = `Hello ${name}`;
}