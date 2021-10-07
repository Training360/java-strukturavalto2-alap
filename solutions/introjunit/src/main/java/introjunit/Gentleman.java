package introjunit;

public class Gentleman {

//    public String sayHello(String name) {
//        return "Hello " + name;
//    }

    public String sayHello(String name) {
        if (name == null) {
            return "Hello Anonymous";
        } else {
            return "Hello " + name;
        }
    }
}
