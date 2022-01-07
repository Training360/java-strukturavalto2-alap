package week11.day04;

import java.time.LocalDate;

public class Product extends  WebShopItem{

    public static final int DEFAULT_GUARANTEE = 3;

    public Product(String name, int price) {
        super(name, price);
    }

    @Override
    public WebShopItem copy() {
        Product product = new Product(this.getName(),this.getPrice());
        product.setExpirationDate(LocalDate.now().plusMonths(DEFAULT_EXPIRE));

        return product;
    }

    public void addExtraGuarantee(int years){
        setExpirationDate(LocalDate.now().plusYears(years));
    }
}
