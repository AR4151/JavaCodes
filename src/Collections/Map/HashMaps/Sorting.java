package Collections.Map.HashMaps;

import java.util.*;

class MyComp implements Comparator{
    /*
    Yes, when implementing the compare method from the Comparator interface, you must accept parameters of type Object
    and then cast them to the appropriate type (e.g., Integer) within the method.
    @Override
    public int compare(Integer i,Integer j){
        Integer s1 = i;
        Integer s2 = j;
        return s1.compareTo(s2);
    }*/

    @Override
    public int compare(Object o1, Object o2) {
        Integer s1 = (Integer) o1;
        Integer s2 = (Integer) o2;
        return s1.compareTo(s2);
    }
}
public class Sorting {
    public static void main(String[] args) {
        Map<Integer,String> hashSorting = new HashMap<Integer, String>();
        hashSorting.put(100,"AAA");
        hashSorting.put(500,"BBB");
        hashSorting.put(300,"CCC");
        hashSorting.put(30,"CDC");
        hashSorting.put(330,"XYZ");
        hashSorting.put(540,"XXX");
        hashSorting.put(3060,"CCC");
        System.out.println("Before Sorting:");
        System.out.println(hashSorting);
        // Using TreeMap
        Map<Integer,String> hashSorting1 = new TreeMap<Integer,String >((new MyComp()));
        hashSorting1.putAll(hashSorting);
        System.out.println("After Sorting: ");
        System.out.println(hashSorting1);
        // Using TreeMap and Collections class reverse method
        Map<Integer,String> hashTree = new TreeMap<>(Collections.reverseOrder());
        hashTree.putAll(hashSorting);
        System.out.println("Reverse Sorting: ");
        System.out.println(hashTree);
    }
}
