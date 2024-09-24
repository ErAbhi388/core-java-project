package core_java.java8;

@FunctionalInterface
interface DemoInterface {

    public void say();
    public String toString();

}

public class Demo21 implements  DemoInterface{
    public void say() {
        System.out.println("this is hello method");
    }
}
