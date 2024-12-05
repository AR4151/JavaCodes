package Java8.LamdaFunction;

import java.util.*;
import java.util.stream.Collectors;

public class AlphaOrder1 {
    static Set<String> alphaOrder(Set<String> set) {
        // Sorting the set into a list, then collecting it back to a LinkedHashSet to preserve insertion order
        return set.stream()
                .sorted(String::compareToIgnoreCase)  // Method Reference
                .collect(Collectors.toCollection(LinkedHashSet::new)); // Use LinkedHashSet to preserve sorted order
    }

    public static void main(String[] args) {
        Set<String> str = new HashSet<>(List.of("Roshan", "rohan", "Ayush", "Shubham", "yash"));
        Set<String> colors = new HashSet<>(List.of("Red", "pink", "Yellow", "black", "Blue", "white", "Green", "violet"));

        System.out.println("Original Names Set:");
        System.out.println(str);

        System.out.println("Names Set after Sorting: ");
        System.out.println(alphaOrder(str));

        System.out.println("Original Colors Set:");
        System.out.println(colors);

        System.out.println("Colors Set after Sorting: ");
        System.out.println(alphaOrder(colors));
    }
}
