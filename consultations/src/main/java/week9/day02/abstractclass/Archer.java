package week9.day02.abstractclass;

import java.util.Random;

public class Archer extends Character {

    private static final int MAX_ARROWS = 100;
    private static final int MAX_SECONDARY_DAMAGE = 7;

    private int numberOfArrows;

    public Archer(Point position, Random random) {
        super(position, random);
        numberOfArrows = MAX_ARROWS;
    }


    public int getNumberOfArrows() {
        return numberOfArrows;
    }

    private int getActualSecondaryDamage() {
        return getRandom().nextInt(MAX_SECONDARY_DAMAGE)+1;
    }

    private void shootingAnArrow(Character enemy){
        numberOfArrows--;
        hit(enemy,getActualSecondaryDamage());
    }

    @Override
    public void secondaryAttack(Character enemy) {
        shootingAnArrow(enemy);
    }
}
