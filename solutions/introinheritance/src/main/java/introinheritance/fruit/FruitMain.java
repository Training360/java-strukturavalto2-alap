package introinheritance.fruit;

public class FruitMain {

    public static void main(String[] args) {
        Fruit fruit = new Fruit();
        fruit.setName("gyümölcs");
        fruit.setWeight(2.1);

        System.out.println(fruit.getName());
        System.out.println(fruit.getWeight());

        Grape grape = new Grape();
        grape.setName("szőlő");
        grape.setWeight(3.2);
        grape.setType("csabagyöngye");

        System.out.println(grape.getName());
        System.out.println(grape.getWeight());
        System.out.println(grape.getType());

        Apple apple = new Apple();
        apple.setName("alma");
        apple.setWeight(1.5);
        apple.setPieces(8);

        System.out.println(apple.getName());
        System.out.println(apple.getWeight());
        System.out.println(apple.getPieces());

        GoldenDelicious golden = new GoldenDelicious();
        golden.setName("golden alma");
        golden.setWeight(1.2);
        golden.setPieces(6);

        System.out.println(golden.getName());
        System.out.println(golden.getWeight());
        System.out.println(golden.getPieces());
        System.out.println(golden.getColour());

        Starking starking = new Starking();
        starking.setName("starking alma");
        starking.setWeight(1.8);
        starking.setPieces(10);

        System.out.println(starking.getName());
        System.out.println(starking.getWeight());
        System.out.println(starking.getPieces());
        System.out.println(starking.getColour());
    }
}
