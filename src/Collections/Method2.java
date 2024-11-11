package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Method2 {
    public static void main(String[] args) {
        ArrayList l = new ArrayList();
        l.add("A");
        l.add("Z");
        l.add("K");
        l.add("M");
        System.out.println("Before Sorting: "+l);
        Collections.sort(l,new MyComp());
        System.out.println("Before Sorting: "+l);
    }
}
class MyComp implements Comparator{
    public int compare(Object o1, Object o2){
        String s1 = (String) o1;
        String s2 = (String) o2;
        return s2.compareTo(s1);
    }
}