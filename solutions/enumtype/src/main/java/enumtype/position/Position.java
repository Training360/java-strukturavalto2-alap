package enumtype.position;

public enum Position {

    EXECUTIVE_DIRECTOR(1_500_000, "car, phone, bonus"), OPERATIVE_DIRECTOR(1_000_000, "car, phone"),
    CUSTOMER_MANAGER(800_000, "phone"), OFFICE_MANAGER(600_000, "phone"),
    PRODUCT_MANAGER(800_000, "phone");

    private int salary;
    private String benefit;

    Position(int salary, String benefit) {
        this.salary = salary;
        this.benefit = benefit;
    }

    public int getSalary() {
        return salary;
    }

    public String getBenefit() {
        return benefit;
    }
}
