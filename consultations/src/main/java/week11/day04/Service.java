package week11.day04;

import java.time.LocalDate;

public class Service extends WebShopItem{

    public static final int DEFAULT_EXPIRATION = 1;


    public Service(String name, int price) {
        super(name, price);
    }

    @Override
    public WebShopItem copy() {
       Service service = new Service(getName(),getPrice());
       service.setExpirationDate(LocalDate.now().plusYears(DEFAULT_EXPIRATION));

       return service;
    }
}
