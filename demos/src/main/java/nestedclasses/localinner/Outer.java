package nestedclasses.localinner;

public class Outer {

    public String saySomething() {
        class Inner {
            public String sayHello() {
                return "Hello";
            }
        }
        return new Inner().sayHello();
    }
}
