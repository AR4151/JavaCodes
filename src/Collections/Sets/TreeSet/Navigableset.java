package Collections.Sets.TreeSet;

import java.util.TreeSet;

public class Navigableset {
    public static void main(String[] args) {
        TreeSet t = new TreeSet();
        t.add(1000);
        t.add(2000);
        t.add(4000);
        t.add(3000);
        t.add(5000);
        t.add(7000);
        t.add(9000);
        System.out.println(t);
        System.out.println(t.floor(2500));
        System.out.println(t.lower(2500));
        System.out.println(t.ceiling(2500));
        System.out.println(t.higher(2500));
        System.out.println(t.pollFirst());
        System.out.println(t.pollLast());
        System.out.println(t.descendingSet());
        System.out.println(t);
    }
}
