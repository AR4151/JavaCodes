package Java8.Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ParallelStream {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();

        names.add("David");

        names.add("Johnson");

        names.add("Samontika");

        names.add("Brijesh");

        names.add("John");

//Normal Execution

        names.stream().filter((String name) -> name.length() > 5).skip(2).forEach(System.out::println);
        names.stream().filter((String name) -> name.length() > 5).skip(2).forEach(System.out::println);

//Parallel Execution

        names.parallelStream().filter((String name) -> name.length() > 5).skip(2).forEach(System.out::println);
        List<String> nameList = Arrays.asList("Dinesh", "Ross", "Kagiso", "Steyn");

        Stream<String> stream = nameList.stream();

        stream.forEach(System.out::println);

        //stream.forEach(System.out::println); --> Stream has already been linked or consumed
        //Exception in thread "main" java.lang.IllegalStateException: stream has already been operated upon or closed


    }
}
