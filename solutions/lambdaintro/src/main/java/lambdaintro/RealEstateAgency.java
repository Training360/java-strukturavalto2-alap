package lambdaintro;

import java.util.List;
import java.util.function.Predicate;

public class RealEstateAgency {

    private List<Flat> flats;

    public RealEstateAgency(List<Flat> flats) {
        this.flats = flats;
    }

    public Flat findFirstCheaperFlat(int minPrice) {
        Flat result = findFirst(flat -> flat.getPrice() < minPrice);
        return result;
    }

    public Flat findFirstGreaterFlat(double maxArea) {
        Flat result = findFirst(flat -> flat.getArea() > maxArea);
        return result;
    }

    public Flat findFirstFlatInSameTown(String town) {
        Flat result = findFirst(flat -> flat.getAddress().startsWith(town));
        return result;
    }

    private Flat findFirst(Predicate<Flat> condition) {
        for (Flat f : flats) {
            if (condition.test(f)) {
                return f;
            }
        }
        throw new IllegalArgumentException("No such flat.");
    }
}
