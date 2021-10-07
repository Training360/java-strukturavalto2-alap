package university;

public class Student {

    private Person person;
    private String neptunCode;
    private String educationalId;
    private String cardNumber;

    public Student(Person person, String neptunCode, String educationalId) {
        this.person = person;
        this.neptunCode = neptunCode;
        this.educationalId = educationalId;
    }

    public Person getPerson() {
        return person;
    }

    public String getNeptunCode() {
        return neptunCode;
    }

    public String getEducationalId() {
        return educationalId;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public void setNeptunCode(String neptunCode) {
        this.neptunCode = neptunCode;
    }

    public void setEducationalId(String educationalId) {
        this.educationalId = educationalId;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }
}
