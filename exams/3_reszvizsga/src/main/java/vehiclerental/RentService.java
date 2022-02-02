package vehiclerental;

import java.time.LocalTime;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class RentService {

    private static final long MAX_RENT_MINUTE = 180;
    private Set<User> users = new HashSet<>();
    private Set<Rentable> rentables = new HashSet<>();
    private Map<Rentable, User> actualRenting = new TreeMap<>();


    public void registerUser(User user) {
        if (isUserNameTake(user.getUserName())) {
            throw new UserNameIsAlreadyTakenException("Username is taken!");
        }
        users.add(user);
    }

    public void addRentable(Rentable rentable){
        rentables.add(rentable);
    }

    private boolean isUserNameTake(String name) {
        return users.stream()
                .map(User::getUserName)
                .anyMatch(s -> s.equals(name));
    }

    public void rent(User user, Rentable rentable, LocalTime time){
        if(rentable.getRentingTime()!=null || user.getBalance()<rentable.calculateSumPrice(MAX_RENT_MINUTE)){
            throw new IllegalStateException("Rentable is taken or low money!");
        }
        rentable.rent(time);
        actualRenting.put(rentable,user);
    }

    public void closeRent(Rentable rentable, int minutes){
        if(!actualRenting.containsKey(rentable)){
            throw new IllegalStateException("Rentable is not taken!");
        }

        User user = actualRenting.get(rentable);
        user.minusBalance(rentable.calculateSumPrice(minutes));
        actualRenting.remove(rentable);
        rentable.closeRent();

    }

    public Set<User> getUsers() {
        return users;
    }

    public Set<Rentable> getRentables() {
        return rentables;
    }

    public Map<Rentable, User> getActualRenting() {
        return actualRenting;
    }
}
