package Collections.Map;

import java.util.TreeMap;

public class NavigableM {
    public static void main(String[] args) {
        TreeMap t = new TreeMap();
        t.put(1000,"A");
        t.put(2000,"B");
        t.put(4000,"D");
        t.put(3000,"J");
        t.put(5000,"y");
        t.put(3500,"I");
        t.put(9000,"D");
        System.out.println(t);
        System.out.println(t.floorKey(2500));
        System.out.println(t.lowerKey(2500));
        System.out.println(t.ceilingKey(2500));
        System.out.println(t.higherKey(2500));
        System.out.println();
        System.out.println(t.floorKey(2000));
        System.out.println(t.lowerKey(2000));
        System.out.println(t.ceilingKey(2000));
        System.out.println(t.higherKey(2000));
        System.out.println(t.firstKey());
        System.out.println(t.lastKey());
        System.out.println(t.descendingMap());
        System.out.println(t);
    }
}
