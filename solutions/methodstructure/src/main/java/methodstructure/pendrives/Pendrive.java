package methodstructure.pendrives;

public class Pendrive {

    private String name;
    private int capacity;
    private int price;

    public Pendrive(String name, int capacity, int price) {
        this.name = name;
        this.capacity = capacity;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Pendrive{" +
                "name='" + name + '\'' +
                ", capacity=" + capacity +
                ", price=" + price +
                '}';
    }

    public void risePrice(int percent) {
        this.price += this.price * (percent / 100.0);
    }

    public int comparePricePerCapacity(Pendrive other) {
        double ppc = getPricePerCapacity();
        double otherPpc = other.getPricePerCapacity();
        if (ppc > otherPpc) {
            return 1;
        }
        if (ppc < otherPpc) {
            return -1;
        }
        return 0;
    }

    public boolean isCheaperThan(Pendrive other) {
        return this.price < other.price;
    }

    private double getPricePerCapacity() {
        return (double) price / capacity;
    }
}
