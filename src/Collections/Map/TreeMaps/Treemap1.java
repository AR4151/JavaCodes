package Collections.Map.TreeMaps;

import java.util.Comparator;
import java.util.TreeMap;

class MyComparator implements Comparator{

    @Override
    public int compare(Object o1, Object o2) {
        Integer s1 = (Integer) o1;
        Integer s2 = (Integer) o2;
        return -s1.compareTo(s2);
    }
}
public class Treemap1 {
    public static void main(String[] args) {
        MyComparator m = new MyComparator();
        TreeMap t = new TreeMap(m);
        t.put(100, "AAA");
        t.put(500, "BBB");
        t.put(300, "CCC");
        t.put(30, "CDC");
        System.out.println(t);
        System.out.println(t.floorKey(300));
        System.out.println(t.lowerKey(300));
    }
}