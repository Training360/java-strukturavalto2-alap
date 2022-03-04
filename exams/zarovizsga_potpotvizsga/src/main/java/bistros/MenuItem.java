package bistros;

public class MenuItem {

    private String name;
    private int price;
    private MenuItemType type;

    public MenuItem(String name, int price, MenuItemType type) {
        this.name = name;
        this.price = price;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price*((100+type.getTax())/100.0);
    }

    public MenuItemType getType() {
        return type;
    }
}
