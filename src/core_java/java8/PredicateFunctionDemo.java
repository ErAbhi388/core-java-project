package core_java.java8;

import java.util.function.Function;
import java.util.function.Predicate;

public class PredicateFunctionDemo {

    public static void main(String[] args) {
        Predicate<Integer> p = i -> i%2==0;
        Function<Integer, Integer> f = i -> i*i;
        System.out.println(p.test(5));
        System.out.println(f.apply(5));
    }


}
