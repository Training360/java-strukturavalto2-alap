package box;

public class ExtraLargeBox implements Box {

    @Override
    public Size getSize() {
        return Size.XL;
    }

    @Override
    public int getPrice() {
        return 5000;
    }
}
