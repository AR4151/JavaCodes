package Collections.Sets.TreeSet;

import java.util.TreeSet;

public class StringSBSorting {
    public static void main(String[] args) {
        TreeSet t = new TreeSet();
        t.add("A");
        t.add("AA");
        t.add(new StringBuffer("ABC"));
        t.add(new StringBuffer("ABCD"));
        t.add("A");
        System.out.println(t);
    }
}
