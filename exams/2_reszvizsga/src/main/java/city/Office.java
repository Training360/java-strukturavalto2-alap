package city;

public class Office extends Building {

    private String company;
    private int numberOfTablesPerLevel;

    public Office(int area, int levels, Address address, String company, int numberOfTablesPerLevel) {
        super(area, levels, address);
        validateNumberOfTables(area, numberOfTablesPerLevel);
        this.company = company;
        this.numberOfTablesPerLevel = numberOfTablesPerLevel;
    }

    public String getCompany() {
        return company;
    }

    public int getNumberOfTablesPerLevel() {
        return numberOfTablesPerLevel;
    }

    @Override
    public int calculateNumberOfPeopleCanFit() {
        return numberOfTablesPerLevel * (getLevels() - 1);
    }

    private void validateNumberOfTables(int area, int numberOfTablesPerLevel) {
        if (area / (double) numberOfTablesPerLevel < 2.0 || area / (double) numberOfTablesPerLevel > 5.0) {
            throw new IllegalArgumentException("Number of tables is incorrect.");
        }
    }
}
