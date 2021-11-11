package teahouse;

import java.time.LocalTime;

public class TeaHouseMain {

    public static void main(String[] args) {
        Tea firstTea = new Tea("A nagyi lekvárja", 1567, Sort.FRUIT_TEA);
        Tea secondTea = new Tea("Earl Grey", 1837, Sort.BLACK_TEA);
        Tea thirdTea = new Tea("Afrikai szavanna", 2431, Sort.ROOIBOS);

        System.out.println(secondTea); // Earl Grey: élénkítő hatású (1837 Ft)

        TeaHouse teaHouse = new TeaHouse("Vörös oroszlán",
                LocalTime.of(11, 0, 0), LocalTime.of(22, 0, 0));
        teaHouse.addTea(firstTea);
        teaHouse.addTea(secondTea);
        teaHouse.addTea(thirdTea);

        System.out.println(teaHouse.getName()); // Vörös oroszlán
        System.out.println(teaHouse.getTeas().get(2).getName()); // A nagyi lekvárja
        System.out.println(teaHouse.getTeas().get(1).getPrice()); // 1745
        System.out.println(teaHouse.getOpenTime()); // 11:00
        System.out.println(teaHouse.getCloseTime()); // 22:00
        System.out.println(teaHouse.getAveragePrice()); // 1767.2

        teaHouse.setActionPrices(Sort.FRUIT_TEA, 30);

        System.out.println(teaHouse.getTeas().get(1).getPrice()); // 1221
        System.out.println(teaHouse.getTeas().get(2).getPrice()); // 1096
        System.out.println(teaHouse.getAveragePrice()); // 1568.2
    }
}
