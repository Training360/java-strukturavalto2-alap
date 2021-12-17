package collectionsequalshash;

import java.util.Objects;

public class Company {

    private String name;
    private String taxNumber;

    public Company(String name, String taxNumber) {
        this.name = name;
        this.taxNumber = taxNumber;
    }

    public String getName() {
        return name;
    }

    public String getTaxNumber() {
        return taxNumber;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || getClass() != other.getClass()) {
            return false;
        }
        Company company = (Company) other;
        return name.equals(company.name) && taxNumber.equals(company.taxNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, taxNumber);
    }
}
