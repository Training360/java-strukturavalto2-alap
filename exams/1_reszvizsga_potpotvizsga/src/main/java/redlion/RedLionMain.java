package redlion;

import java.time.LocalTime;

public class RedLionMain {

    public static void main(String[] args) {
        Cup firstCup = new Cup("A nagyi lekvárja", 1567, Sort.FRUIT_TEA);
        Cup secondCup = new Cup("Earl Grey", 1837, Sort.BLACK_TEA);
        Cup thirdCup = new Cup("Afrikai szavanna", 2431, Sort.ROOIBOS);

        System.out.println(secondCup); // Earl Grey: élénkítő hatású (1837 Ft)

        RedLion redLion = new RedLion("Vörös oroszlán",
                LocalTime.of(11, 0, 0), LocalTime.of(22, 0, 0));
        redLion.addCup(firstCup);
        redLion.addCup(secondCup);
        redLion.addCup(thirdCup);

        System.out.println(redLion.getName()); // Vörös oroszlán
        System.out.println(redLion.getTeas().get(2).getName()); // A nagyi lekvárja
        System.out.println(redLion.getTeas().get(1).getPrice()); // 1745
        System.out.println(redLion.getOpenTime()); // 11:00
        System.out.println(redLion.getCloseTime()); // 22:00
        System.out.println(redLion.getAveragePrice()); // 1767.2

        redLion.setActionPrices(Sort.FRUIT_TEA, 30);

        System.out.println(redLion.getTeas().get(1).getPrice()); // 1221
        System.out.println(redLion.getTeas().get(2).getPrice()); // 1096
        System.out.println(redLion.getAveragePrice()); // 1568.2
    }
}
