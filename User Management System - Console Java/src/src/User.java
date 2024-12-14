package src;

public abstract class User {
    private static int idCounter = 0;
    private int userId;
    private String username;
    private String email;
    private String password;
    private int userType;

    public User() {
        this.userId = generateUniqueId();
    }

    private static synchronized int generateUniqueId() {
        return ++idCounter;
    }

    public int getUserId() {
        return userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getUserType() {
        return userType;
    }

    public void setUserType(int userType) {
        this.userType = userType;
    }

    public abstract void readFromFile(String filePath);
}
