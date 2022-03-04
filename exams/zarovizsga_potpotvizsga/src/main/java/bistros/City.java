package bistros;

import java.util.*;

public class City {

    private Set<Bistro> bistros = new LinkedHashSet<>();

    public void addBistro(Bistro bistro) {
        bistros.add(bistro);
    }

    public Set<Bistro> getBistros() {
        return bistros;
    }

    public Bistro findBistroByAddress(Address address){
        return bistros.stream()
                .filter(b->b.getAddress().equals(address))
                .findFirst().orElseThrow(()->new IllegalArgumentException("Cannot find Bistro!"));
    }


    public Bistro findLongestMenu(){
        return bistros.stream()
                .sorted(Comparator.comparingInt((Bistro b)->b.getMenu().size()).reversed())
                .findFirst().orElseThrow(()->new IllegalArgumentException("Cannot find Bistro!"));
    }


    public List<Bistro> findBistroWithMenuItem(String menuItemName){
        return bistros.stream()
                .filter(b->b.menuContainsItemByName(menuItemName))
                .toList();
    }
}
