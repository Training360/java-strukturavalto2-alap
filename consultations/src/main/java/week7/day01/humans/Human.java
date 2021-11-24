package week7.day01.humans;


public class Human {


    private String name;
    private int yearOfBirth;

    public Human(String name, int yearOfBirth) {
        NameValidator nv = new NameValidator();
        YearOfBirthValidator yobv = new YearOfBirthValidator();
        if (yobv.isYearOfBirthValid(yearOfBirth) && nv.isNameValid(name)) {
            this.name = name;
            this.yearOfBirth = yearOfBirth;
        }
    }


    public String getName() {
        return name;
    }

    public int getYarOfBirth() {
        return yearOfBirth;
    }
}
