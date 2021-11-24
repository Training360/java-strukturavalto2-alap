package staticattrmeth.vet;

public class Dog {

    private String name;
    private int age;
    private Species species;
    private long codeNumber;

    public Dog(String name, int age, Species species) {
        this.name = name;
        this.age = age;
        this.species = species;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Species getSpecies() {
        return species;
    }

    public long getCodeNumber() {
        return codeNumber;
    }

    public void setCodeNumber(long codeNumber) {
        this.codeNumber = codeNumber;
    }
}
