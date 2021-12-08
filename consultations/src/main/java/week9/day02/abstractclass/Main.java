package week9.day02.abstractclass;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Character archer = new Archer(new Point(0, 0), new Random());

        Character enemy = new Archer(new Point(1, 0), new Random());

        archer.secondaryAttack(enemy);

        System.out.println(enemy.getHitPoint());

    }
}
