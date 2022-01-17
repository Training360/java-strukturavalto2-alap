package nestedclasses.memberinner;


public class Outer {

    private String message = "Hello";

    public class Inner {
        public String sayHello() {
            return message;
        }
    }

    public String saySomething() {
        return new Inner().sayHello();
    }
}
