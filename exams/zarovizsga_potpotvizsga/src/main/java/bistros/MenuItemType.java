package bistros;

public enum MenuItemType {

    FOOD(20), DRINK(27);

    private int tax;

    MenuItemType(int tax) {
        this.tax = tax;
    }

    public int getTax() {
        return tax;
    }
}
