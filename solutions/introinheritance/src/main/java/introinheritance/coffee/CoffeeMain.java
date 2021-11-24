package introinheritance.coffee;

public class CoffeeMain {

    public static void main(String[] args) {
        Coffee coffee = new Coffee();
        coffee.setName("kávé");
        coffee.setPrice(450);

        System.out.println(coffee.getName());
        System.out.println(coffee.getPrice());

        Cappuccino cappuccino = new Cappuccino();
        cappuccino.setName("cappuccino");
        cappuccino.setPrice(700);

        System.out.println(cappuccino.getName());
        System.out.println(cappuccino.getPrice());
    }
}
