package shipping;

public interface Transportable {

    String DESTINATION_COUNTRY = "Hungary";

    int getWeight();

    boolean isBreakable();

    int calculateShippingPrice();

    default String getDestinationCountry() {
        return DESTINATION_COUNTRY;
    }
}
