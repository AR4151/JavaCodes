package Collections.Sets.HashSets;

//import java.util.HashSet;
//import java.util.Set;
//
//public class Example {
//    public static void main(String[] args) {
//        HashSet h = new HashSet();
//        h.add(10);
//        h.add("R");
//        h.add("Z");
//        h.add(null);
//        h.add("20");
//        h.add("r");
//        h.add("z");
//        System.out.println(h);
        import java.util.HashSet;
import java.util.Set;

        public class RetainAllExample {
            public static void main(String[] args) {
                Set<Integer> set1 = new HashSet<>();
                Set<Integer> set = new HashSet<>();

                // Adding elements to set1
                set1.add(62);
                set1.add(32);
                set1.add(82);
                //set1.add(22);

                // Adding elements to set
                set.add(62);
                set.add(32);
                set.add(82);
                set.add(22);

                // Retain only the elements from set1 that are present in set
                System.out.println("Before retainAll: set1 = " + set1);

                boolean result = set1.retainAll(set);

                // Output the result of retainAll
                System.out.println("After retainAll: set1 = " + set1);
                System.out.println("Was set1 modified? " + result);
            }
        }


