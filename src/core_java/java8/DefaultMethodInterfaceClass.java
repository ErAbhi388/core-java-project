package core_java.java8;

interface DefaultMethodInterface {
    void display();
    default void defaultMethod() {
        System.out.println("This is default method");
    }

    default void defaultMethod2() {
        System.out.println("This is default method");
    }

    static void staticMethod() {
        System.out.println("this is static method");
    }

    static void staticMethod2() {
        System.out.println("this is static method");
    }
}

public class DefaultMethodInterfaceClass implements DefaultMethodInterface{

    @Override
    public void display() {
        System.out.println("This is default method");
    }

    public static void main(String[] args) {
        DefaultMethodInterface.staticMethod();
        DefaultMethodInterface d = new DefaultMethodInterface() {
            @Override
            public void display() {
                System.out.println("display in main method");
            }
        };
        d.display();
    }


}
