package introexceptionthrow;

public class AdultContent {

    public static void main(String[] args) {
        Adult adult = new Adult("Kiss József", 26);

        System.out.println(adult.getName());
        System.out.println(adult.getAge());

        Adult child = new Adult("Nagy Béla", 17);

        System.out.println(child.getName());
        System.out.println(child.getAge());
    }
}
