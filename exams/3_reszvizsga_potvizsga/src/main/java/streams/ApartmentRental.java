package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ApartmentRental {


    private List<Apartment> apartmentsForRent = new ArrayList<>();


    public void addApartment(Apartment apartment){
        apartmentsForRent.add(apartment);
    }


    public List<Apartment> findApartmentByLocation(String location){
        return apartmentsForRent.stream().
                filter(a->a.getLocation().equals(location))
                .toList();
    }

    public List<Apartment> findApartmentByExtras(String... extras){
        return apartmentsForRent.stream()
                .filter(a->a.getExtras().containsAll(Arrays.asList(extras)))
                .toList();
    }

    public boolean isThereApartmentWithBathroomType(BathRoomType bathRoomType){
        return apartmentsForRent.stream()
                .anyMatch(a->a.getBathRoomType() == bathRoomType);
    }

    public List<Integer> findApartmentsSize() {
        return apartmentsForRent.stream()
                .map(Apartment::getSize)
                .toList();
    }

    public List<Apartment> getApartmentsForRent() {
        return apartmentsForRent;
    }
}
