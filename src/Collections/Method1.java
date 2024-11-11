package Collections;

import java.util.ArrayList;
import java.util.Collections;

// Default Natural Sorting Order
public class Method1 {
    public static void main(String[] args) {
        ArrayList l = new ArrayList();
        l.add("A");
        l.add("Z");
        l.add("K");
        l.add("M");
        System.out.println("Before Sorting: "+l);
        Collections.sort(l);
        System.out.println("Before Sorting: "+l);
    }
}
