package introexceptionthrow;

public class Patient {

    public static final int MIN_YEAR = 1900;

    private String name;
    private String socialSecurityNumber; // TAJ szám
    private int yearOfBirth;

    public Patient(String name, String ssn, int yearOfBirth) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Name must not be empty");
        }
        if (yearOfBirth <= MIN_YEAR) {
            throw new IllegalArgumentException("Invalid year of birth: " + yearOfBirth);
        }
        this.name = name;
        this.socialSecurityNumber = ssn;
        this.yearOfBirth = yearOfBirth;
    }

    public String getName() {
        return name;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public static void main(String[] args) {
        Patient firstPatient = new Patient("Kiss József", "123456788", 1954);

        System.out.println(firstPatient.getName());
        System.out.println(firstPatient.getSocialSecurityNumber());
        System.out.println(firstPatient.getYearOfBirth());

        Patient secondPatient = new Patient("", "123456788", 1954);

        System.out.println(secondPatient.getName());
        System.out.println(secondPatient.getSocialSecurityNumber());
        System.out.println(secondPatient.getYearOfBirth());

        Patient thirdPatient = new Patient("Kiss József", "123456788", 1888);

        System.out.println(thirdPatient.getName());
        System.out.println(thirdPatient.getSocialSecurityNumber());
        System.out.println(thirdPatient.getYearOfBirth());
    }
}
