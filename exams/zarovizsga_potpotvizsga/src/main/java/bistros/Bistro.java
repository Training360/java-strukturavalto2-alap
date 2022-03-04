package bistros;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Bistro {

    private String name;
    private Address address;
    private List<MenuItem> menu = new ArrayList<>();

    public Bistro(String name, Address address) {
        this.name = name;
        this.address = address;
    }


    public void addMenuItem(MenuItem menuItem){
        menu.add(menuItem);
    }

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }

    public List<MenuItem> getMenu() {
        return new ArrayList<>(menu);
    }

    public boolean menuContainsItemByName(String menuItemName){
        return menu.stream()
                .anyMatch(m->m.getName().equals(menuItemName));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Bistro bistro = (Bistro) o;

        if (!Objects.equals(name, bistro.name)) return false;
        return Objects.equals(address, bistro.address);
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (address != null ? address.hashCode() : 0);
        return result;
    }
}
