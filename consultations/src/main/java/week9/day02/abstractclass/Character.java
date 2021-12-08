package week9.day02.abstractclass;

import java.util.Random;

public abstract class Character {

    private static final int MAX_DAMAGE = 10;
    private static final int MAX_DEFENSE = 5;

    private Point position;
    private int hitPoint;
    private Random random;

    public Character(Point position, Random random) {
        this.position = position;
        this.random = random;
        hitPoint = 100;
    }


    public boolean isAlive() {
        if (hitPoint > 0) {
            return true;
        }
        return false;
    }

    protected int getActualPrimaryDamage() {
        return random.nextInt(MAX_DAMAGE) + 1;
    }

    protected int getActualDefense() {
        return random.nextInt(MAX_DEFENSE + 1);
    }

    protected void hit(Character enemy, int damage) {
        if (enemy.getActualDefense() < damage) {
            enemy.decreaseHitPoint(damage);
        }
    }

    private void decreaseHitPoint(int diff) {
        hitPoint -= diff;
    }

    public void primaryAttack(Character enemy){
        hit(enemy,getActualPrimaryDamage());
    }

    public Random getRandom() {
        return random;
    }

    public abstract void secondaryAttack(Character enemy);

    public int getHitPoint() {
        return hitPoint;
    }
}
