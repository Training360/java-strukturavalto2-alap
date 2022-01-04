package week11.day01;

public class AdminUser implements User{


    private String email;
    private String password;

    public AdminUser(String email, String password) {
        this.email = email;
        this.password = password;
    }

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public String getPassword() {
        return "*".repeat(password.length());
    }
}
