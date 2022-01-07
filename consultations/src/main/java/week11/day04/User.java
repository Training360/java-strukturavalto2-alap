package week11.day04;

import java.util.ArrayList;
import java.util.List;

public class User {

    private String userName;
    private List<WebShopItem> boughtItems = new ArrayList<>();
    private int money;

    public User(String userName, int money) {
        this.userName = userName;
        this.money = money;
    }


    public void buy(WebShopItem item){
        if(item instanceof Product && money>= 3 * item.getPrice()){
            ((Product) item).addExtraGuarantee(3);
            money-=item.getPrice()*1.1;
        }
        money-=item.getPrice();
        boughtItems.add(item);
    }


    public String getUserName() {
        return userName;
    }

    public List<WebShopItem> getBoughtItems() {
        return boughtItems;
    }

    public int getMoney() {
        return money;
    }
}
