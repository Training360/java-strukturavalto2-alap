package composition.realestate;

public class RealEstate {

    private String title;
    private double price;
    private Details details;

    public RealEstate(String title, double price, Details details) {
        this.title = title;
        this.price = price;
        this.details = details;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    public Details getDetails() {
        return details;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDetails(Details details) {
        this.details = details;
    }

    @Override
    public String toString() {
        return "RealEstate{" +
                "title='" + title + '\'' +
                ", price=" + price +
                ", details=" + details +
                '}';
    }
}
