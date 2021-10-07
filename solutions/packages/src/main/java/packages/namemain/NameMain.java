package packages.namemain;

import packages.firstname.FirstName;
import packages.lastname.LastName;
import packages.prefix.Prefix;

public class NameMain {

    public static void main(String[] args) {

        Prefix pre = new Prefix("Mr.");
        FirstName first = new FirstName("John");
        LastName last = new LastName("Doe");

        String prefix = pre.getPrefix();
        String firstName = first.getFirstName();
        String lastName = last.getLastName();

        String wholeName = prefix + " " + firstName + " " + lastName;

        System.out.println(wholeName);
    }
}
