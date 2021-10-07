package stringconcat.nameconcat;

public class NameMain {

    public static void main(String[] args) {
        System.out.println(new Name("Smith", "G", "John", Title.MR).concatNameWesternStyle());
        System.out.println(new Name("Smith", "G", "John", null).concatNameWesternStyle());
        System.out.println(new Name("Smith", "", "John", Title.MR).concatNameWesternStyle());
        System.out.println(new Name("Smith", null, "John", Title.MR).concatNameWesternStyle());

        System.out.println(new Name("Smith", "G", "John", Title.MR).concatNameHungarianStyle());
        System.out.println(new Name("Smith", "G", "John", null).concatNameHungarianStyle());
        System.out.println(new Name("Smith", "", "John", Title.MR).concatNameHungarianStyle());
    }
}
