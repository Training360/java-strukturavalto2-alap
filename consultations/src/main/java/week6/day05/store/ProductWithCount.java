package week6.day05.store;

public class ProductWithCount {

    private Type type;

    private int count = 1;

    public ProductWithCount(Type type) {
        this.type = type;
    }


    public void incrementCount(){
        count++;
    }

    public Type getType() {
        return type;
    }

    public int getCount() {
        return count;
    }
}
