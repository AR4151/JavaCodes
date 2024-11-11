package Collections.Sets.TreeSet;

import java.util.TreeSet;

public class Example1 {
    public static void main(String[] args) {
        TreeSet t = new TreeSet();
        //t.add(null);
        t.add("a");
        t.add("A");
        t.add("H");
        t.add("Z");
        //t.add(10);
        //t.add(null);
        System.out.println(t);



    }
}
/*
  * TreeSet and TreeMap are the main data structures in the Java Collections Framework that maintain a default natural sorting order.
  * For other data structures, you need to explicitly sort them using Collections.sort() or List.sort().
 */
