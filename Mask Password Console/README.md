# Mask Password

A small project that allows users to securely input and mask their password using Java. The entered password is saved to a file without displaying it in the console.

## Features
- Password input is masked with `*` or hidden during typing (depending on implementation).
- Securely saves the password to a file.
- Lightweight and beginner-friendly.

## Prerequisites
- Java Development Kit (JDK) installed.
- A terminal or command prompt with a working console.

## How to Run
1. **Clone the repository** (or create the `MaskPassword.java` file in your working directory).
    ```bash
    git clone https://github.com/ridika-2004/my-development-tools
    cd <repository-folder>
    ```

2. **Compile the Java program**:
    ```bash
    javac MaskPassword.java
    ```

3. **Run the program**:
    ```bash
    java MaskPassword
    ```

4. **Enter your password**:
    - Type your password when prompted. It will be masked or hidden.
    - The password is saved in the file `passwords.txt`.

## File Structure
MaskPasswordProject/
├── MaskPasswordWithConsole.java
├── passwords.txt


## Notes
- If `System.console()` is not available, run the program in a terminal/command prompt.
- The saved passwords are in plain text. Consider hashing them for improved security.

## License
This project is for personal and educational use. Feel free to modify or share as needed.

