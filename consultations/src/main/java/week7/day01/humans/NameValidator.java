package week7.day01.humans;

public class NameValidator {

    public boolean isNameValid(String name){
        if(!(name != null && name.indexOf(" ") > 0)){
            throw new IllegalArgumentException("Name is invalid");
        }
        return true;
    }

}
