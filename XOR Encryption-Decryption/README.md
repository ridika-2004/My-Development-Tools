# XOR Encryption Web Application

## Description

This is a simple web-based XOR encryption tool, built with **HTML**, **CSS**, and **JavaScript**. It allows users to easily encrypt and decrypt text using XOR encryption, a basic yet powerful encryption method. The tool provides a clean and user-friendly interface to input text, choose a key, and get encrypted or decrypted results instantly.

## Features

- **Encrypt Text**: Enter plain text and a key to get the XOR-encrypted output.
- **Decrypt Text**: Input an encrypted string with the correct key to decrypt it back to the original message.
- **Simple and Fast**: Instant encryption and decryption with just a click of a button.
- **User-friendly Interface**: The minimalist design ensures easy navigation and use for everyone.

## How It Works

XOR encryption is a bitwise operation that operates on binary representations of text and a key. The text is XORed with a key byte by byte. The same operation is used to decrypt, making it a symmetric encryption method.

### XOR Encryption Process:
1. Convert each character of the text into binary.
2. Apply the XOR operation between the binary representation of the text and the key.
3. The result is the encrypted text. To decrypt, XOR the encrypted text with the same key.

## Usage Instructions

1. **Clone** or **Download** this repository to your local machine.
2. **Open** `index.html` in your web browser to access the XOR encryption tool.
3. **Enter your text** and a key in the respective fields.
4. Click **Encrypt** to encrypt your text, or **Decrypt** to convert encrypted text back to plain text.
5. **Enjoy** the simplicity and power of XOR encryption!

## Installation

This project doesn't require any external libraries or complicated setup. All you need to do is:

1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/xor-encryption.git
   
2. Open the `index.html` file in your browser, and you're good to go!

## Example
- Input the text **"Hello World"** and a key, say **"key"**.
- Click Encrypt to get the XOR-encrypted result.
- Copy the encrypted result, paste it in the **Decrypt** section, and provide the same key to get back **"Hello World"**.

## Screenshot

<p align="center">
<img src="https://github.com/user-attachments/assets/06799b07-f8cf-41d8-8b91-b809cddd6422"alt="XOR Encryption Decryption" width="250">
</p>

## License
This project is open-source and feel free to contribute or modify the code as per your needs.
