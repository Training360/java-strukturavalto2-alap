package composition.realestate;

public class Details {

    private String description;
    private Address address;
    private int squareMeter;
    private int areaOfSite;

    public Details(String description, Address address, int squareMeter, int areaOfSite) {
        this.description = description;
        this.address = address;
        this.squareMeter = squareMeter;
        this.areaOfSite = areaOfSite;
    }

    public String getDescription() {
        return description;
    }

    public Address getAddress() {
        return address;
    }

    public int getSquareMeter() {
        return squareMeter;
    }

    public int getAreaOfSite() {
        return areaOfSite;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setSquareMeter(int squareMeter) {
        this.squareMeter = squareMeter;
    }

    public void setAreaOfSite(int areaOfSite) {
        this.areaOfSite = areaOfSite;
    }

    @Override
    public String toString() {
        return "Details{" +
                "description='" + description + '\'' +
                ", address=" + address +
                ", squareMeter=" + squareMeter +
                ", areaOfSite=" + areaOfSite +
                '}';
    }
}
