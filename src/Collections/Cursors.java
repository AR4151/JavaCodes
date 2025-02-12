package Collections;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class Cursors {

    public static void main(String[] args) {
        Vector<Integer> v = new Vector<>();
        v.add(15);
        v.add(55);
        v.add(95);
        v.add(85);
        System.out.println(v);

        Enumeration<Integer> e = v.elements();
        while(e.hasMoreElements()){
            System.out.println(e.nextElement());

        }
        System.out.println(e);

        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(59);
        arr.add(98);
        arr.add(48);
        arr.add(65);
        System.out.println();

        Iterator<Integer> itr = arr.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.println(itr);
    }



}
