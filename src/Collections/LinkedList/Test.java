package Collections.LinkedList;

import java.util.LinkedList;

public class Test {
    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        System.out.println(l);
        l.add("Roshan");
        l.add(2000);
        l.add("Alte");
        l.add("2000");
        l.add("2000");
        System.out.println(l);
        System.out.println(l.remove());
        System.out.println(l);
        l.set(0,"Roshan");
        System.out.println(l);
        l.add(0,"Roshan");
        System.out.println(l);
        l.forEach(System.out::println);



    }
    /*
    * Autoboxing: Java automatically converts a primitive type (int, double, char, etc.) to its corresponding
    * wrapper class (Integer, Double, Character, etc.) when it needs to be used as an object. This feature was introduced in Java 5.

     l.add(2000);: Here, 2000 is initially a primitive int, but Java auto-boxes it to an Integer object before adding it to
*    the LinkedList, which can only hold objects.*/
}
