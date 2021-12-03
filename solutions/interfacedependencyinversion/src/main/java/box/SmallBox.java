package box;

public class SmallBox implements Box {

    @Override
    public Size getSize() {
        return Size.S;
    }

    @Override
    public int getPrice() {
        return 1000;
    }
}
