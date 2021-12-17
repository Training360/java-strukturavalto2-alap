package collectionslist;

import java.util.ArrayList;
import java.util.List;

public class Postman {

    private List<String> addresses = new ArrayList<>();

    public List<String> getAddresses() {
        return new ArrayList<>(addresses);
    }

    public void addAddress(String address) {
        addresses.add(address);
    }

    public void removeAddress(String address) {
        int index = addresses.indexOf(address);
        addresses.remove(index);
    }
}
