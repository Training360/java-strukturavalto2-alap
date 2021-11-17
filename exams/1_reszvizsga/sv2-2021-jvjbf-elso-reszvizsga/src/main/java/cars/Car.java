package cars;

public class Car {

    private String brand;
    private double engineSize;
    private int price;
    private Color color;

    public Car(String brand, double engineSize,Color color, int price) {
        this.brand = brand;
        this.engineSize = engineSize;
        this.price = price;
        this.color = color;
    }


    public void decreasePrice(int percent){
        if(percent>=1 && percent<=99) {
            price = price * (100 - percent) / 100;
        }
    }

    public String getBrand() {
        return brand;
    }

    public double getEngineSize() {
        return engineSize;
    }

    public int getPrice() {
        return price;
    }

    public Color getColor() {
        return color;
    }
}
