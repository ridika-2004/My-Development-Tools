function xorCrypt() {
    let text = document.getElementById("input-text").value;
    let key = document.getElementById("xor-key").value;

    if (!text || !key) {
        alert("Please enter both text and XOR key.");
        return;
    }

    let result = xorOperation(text, key);
    document.getElementById("result-text").value = result;
}


function xorOperation(text, key) {
    let result = "";
    for (let i = 0; i < text.length; i++) {
        result += String.fromCharCode(text.charCodeAt(i) ^ key.charCodeAt(i % key.length));
    }
    return result;
}
