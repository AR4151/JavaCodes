package Java8.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamException {
    public static void main(String[] args) {
        List<String> nameList = Arrays.asList("Dinesh", "Ross", "Kagiso", "Steyn");

        Stream<String> stream = nameList.stream();

        stream.forEach(System.out::println);

        stream.forEach(System.out::println);
    }
}
