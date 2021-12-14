package filemanipulation;

public class Human {

    private String name;
    private String identityNumber;

    public Human(String name, String identityNumber) {
        this.name = name;
        this.identityNumber = identityNumber;
    }

    public String getName() {
        return name;
    }

    public String getIdentityNumber() {
        return identityNumber;
    }

    @Override
    public String toString() {
        return name + ";" + identityNumber;
    }

    public boolean isMale() {
        if (identityNumber.startsWith("1") || identityNumber.startsWith("3")) {
            return true;
        }
        return false;
    }
}
