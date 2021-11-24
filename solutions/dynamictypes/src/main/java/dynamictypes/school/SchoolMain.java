package dynamictypes.school;

public class SchoolMain {

    public static void main(String[] args) {
        School school = new School("iskola", 12);
        School primary = new PrimarySchool("Kossuth Lajos Általános Iskola", 8);
        School secondary = new SecondarySchool("József Attila Gimnázium", 4);

        System.out.println(school);
        System.out.println(primary);
        System.out.println(secondary);
    }
}
