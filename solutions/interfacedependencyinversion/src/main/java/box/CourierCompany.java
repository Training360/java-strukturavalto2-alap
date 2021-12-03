package box;

public class CourierCompany {

    public static void main(String[] args) {
        Box small = new SmallBox();
        System.out.println(small.getSize());
        System.out.println(small.getPrice());

        Box medium = new MediumBox();
        System.out.println(medium.getSize());
        System.out.println(medium.getPrice());

        Box large = new LargeBox();
        System.out.println(large.getSize());
        System.out.println(large.getPrice());

        Box extraLarge = new ExtraLargeBox();
        System.out.println(extraLarge.getSize());
        System.out.println(extraLarge.getPrice());
    }
}
