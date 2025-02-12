package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Method2 {
    public static void main(String[] args) {
        ArrayList<String> l = new ArrayList<>();
        l.add("A");
        l.add("Z");
        l.add("K");
        l.add("M");
        System.out.println("Before Sorting: " + l);
        //Yes, Collections.sort() and l.sort() also modifies the original list in place. It sorts the elements of the list according to
        // their natural order or according to a specified Comparator.
        Collections.sort(l);
        l.sort(new MyComp());
        System.out.println("Before Sorting: " + l);

/*        Comparable cmp = new Comparable() {
            @Override
            public int compareTo(@NotNull Object o) {
                String s1 = (String) o;
                return this.toString().compareTo(s1);
            }
        };
        Collections.sort(l,cmp);
    }
    You cannot use an anonymous class implementing Comparable for sorting with Collections.sort because Collections.
    sort requires a Comparator, not a Comparable. Comparable is used to define the natural ordering of objects, while
    Comparator is used to define an external ordering.  To sort the list in natural order, you should use Collections.
    sort directly on the list, as the elements in the list (Strings) already implement Comparable.
    */
    }
}
class MyComp implements Comparator<String> {
    public int compare(String s1, String s2){

        return s2.compareTo(s1);
    }
}
