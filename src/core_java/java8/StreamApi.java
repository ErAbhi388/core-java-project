package core_java.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamApi {

    public static void main(String[] args) {
        List<String> l = Arrays.asList("Abhishek", "Mishra", "Anurag", "Mishra");
        List names = (List) l.stream().filter(name -> name.startsWith("A")).toList();
        IntStream.range(10, 50).forEach(System.out::println);
        //System.out.println(names);
    }

}
