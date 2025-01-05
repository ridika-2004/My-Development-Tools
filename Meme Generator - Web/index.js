const generatememebtn = document.querySelector(".meme-generator .generate-meme-btn");
const memeimage = document.querySelector(".meme-generator img");

const memetitle = document.querySelector(".meme-generator .meme-title");
const memeauthor = document.querySelector(".meme-generator .meme-author");

const updateDetails = (url,title,author) => {
    memeimage.setAttribute("src", url);
    memetitle.innerHTML = title;
    memeauthor.innerHTML = author;
}

const generatememe = () => {
    fetch("https://meme-api.com/gimme/wholesomememes")
    .then((response)=>response.json())
    .then(data=>{
        updateDetails(data.url, data.title, data.author);
    });
}

generatememebtn.addEventListener("click", generatememe);