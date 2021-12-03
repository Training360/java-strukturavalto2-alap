package box;

public class MediumBox implements Box {

    @Override
    public Size getSize() {
        return Size.M;
    }

    @Override
    public int getPrice() {
        return 2000;
    }
}
