package filemanipulation;

public class User {

    private String userName;
    private int yearOfBirth;
    private String emailAddress;

    public User(String userName, int yearOfBirth, String emailAddress) {
        this.userName = userName;
        this.yearOfBirth = yearOfBirth;
        this.emailAddress = emailAddress;
    }

    public boolean isEmailAndUserMatches(){
        if(userName.equalsIgnoreCase(emailAddress.split("@")[0])){
            return true;
        }
        return false;
    }

    public String getUserName() {
        return userName;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    @Override
    public String toString() {
        return userName;
    }
}
