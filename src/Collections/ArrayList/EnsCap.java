package Collections.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class EnsCap {
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>();
        l.add(15);
        l.add(10);
        l.add(10);
        l.add(11);
        l.add(20);
        l.add(16);
        List<Integer> ll = new ArrayList<>();
        ll.add(45);
        ll.add(55);

        //l.set(15,200);
        l.addAll(2,ll);
        System.out.println(l);
        System.out.println(l.size());
        System.out.println(l.isEmpty());
        System.out.println(l.contains(11));
        l.set(1,25);
        System.out.println(l.get(5));
        System.out.println();
        System.out.println(l);
        l.remove(3);
        l.remove("20");
        System.out.println(l);
        /*Iterator itr = l.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }*/
        Object[] arr = l.toArray();
        System.out.println(arr);

    }
}
