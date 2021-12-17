package searching;

import java.time.LocalDate;
import java.util.Objects;

public class LostProperty implements Comparable<LostProperty> {

    private String regNumber;

    private String description;

    private LocalDate dateOfRegistration;

    public LostProperty(String description, LocalDate dateOfRegistration) {
        this.description = description;
        this.dateOfRegistration = dateOfRegistration;
    }

    public LostProperty(String regNumber, String description, LocalDate dateOfRegistration) {
        this.regNumber = regNumber;
        this.description = description;
        this.dateOfRegistration = dateOfRegistration;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public String getDescription() {
        return description;
    }

    public LocalDate getDateOfRegistration() {
        return dateOfRegistration;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LostProperty that = (LostProperty) o;
        return Objects.equals(description, that.description) && Objects.equals(dateOfRegistration, that.dateOfRegistration);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description, dateOfRegistration);
    }

    @Override
    public int compareTo(LostProperty other) {
        if (description.compareTo(other.description) == 0) {
            return dateOfRegistration.compareTo(other.dateOfRegistration);
        } else {
            return description.compareTo(other.description);
        }
    }
}
