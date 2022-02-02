package vehiclerental;

import java.time.LocalTime;

public interface Rentable extends Comparable<Rentable>{

    int calculateSumPrice(long minutes);
    LocalTime getRentingTime();
    void rent(LocalTime time);
    void closeRent();

    @Override
    default int compareTo(Rentable other){
        return getRentingTime().compareTo(other.getRentingTime());
    }

}
