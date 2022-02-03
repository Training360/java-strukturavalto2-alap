package contentsite;

import java.util.Objects;

public class User {

    private String userName;
    private int password;
    private boolean isPremiumMember;
    private boolean logIn;

    public User(String userName, String password) {
        this.userName = userName;
        this.password = (userName+password).hashCode();
    }

    public void setLogIn(boolean logIn){
        this.logIn = logIn;
    }

    public void upgradeForPremium(){
        isPremiumMember = true;
    }

    public String getUserName() {
        return userName;
    }

    public boolean isLogIn() {
        return logIn;
    }

    public boolean isPremiumMember() {
        return isPremiumMember;
    }

    public int getPassword() {
        return password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        return Objects.equals(userName, user.userName);
    }

    @Override
    public int hashCode() {
        return userName != null ? userName.hashCode() : 0;
    }
}
