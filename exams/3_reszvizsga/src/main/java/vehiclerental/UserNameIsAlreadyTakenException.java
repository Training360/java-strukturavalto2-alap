package vehiclerental;

public class UserNameIsAlreadyTakenException extends RuntimeException{

    public UserNameIsAlreadyTakenException(String message){
        super(message);
    }
}
