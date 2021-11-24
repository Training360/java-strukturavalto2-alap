package methodchain;

public class Grasshopper {

    private int position;

    public int getPosition() {
        return position;
    }

    public Grasshopper hopOnce(Direction direction) {
        if (direction == Direction.POSITIVE) {
            position++;
        } else {
            position--;
        }
        return this;
    }

    public void moveFromZeroToThreeWithFiveHops() {
        this.hopOnce(Direction.POSITIVE).hopOnce(Direction.POSITIVE).hopOnce(Direction.NEGATIVE)
                .hopOnce(Direction.POSITIVE).hopOnce(Direction.POSITIVE);
    }
}
