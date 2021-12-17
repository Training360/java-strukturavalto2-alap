package collectionsequalshash;

import java.util.ArrayList;
import java.util.List;

public class RegistryCourt {

    public static void main(String[] args) {
        List<Company> companies = new ArrayList<>();
        companies.add(new Company("Xyz Kft", "9876"));
        companies.add(new Company("Cég Kft", "1234"));
        companies.add(new Company("ABC Kft", "2345"));

        System.out.println(companies.contains(new Company("Cég Kft", "1234")));
    }
}
