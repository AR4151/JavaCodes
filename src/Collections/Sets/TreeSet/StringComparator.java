package Collections.Sets.TreeSet;

//import org.jetbrains.annotations.NotNull;

import java.util.Comparator;
import java.util.TreeSet;



public class StringComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        String s1 = (String)o1;
        String s2 = (String)o2;
        return -s1.compareTo(s2);
    }
    public static void main(String[] args) {
        TreeSet t = new TreeSet(new StringComparator());
        t.add("A");
        t.add("B");
        t.add("C");
        t.add("D");
        t.add("Z");
        t.add("X");
        System.out.println(t);

    }




}
