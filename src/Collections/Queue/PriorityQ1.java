package Collections.Queue;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQ1 {
    public static void main(String[] args) {
        PriorityQueue q = new PriorityQueue(15, new MyComparator());
        q.offer("A");
        q.offer("Z");
        q.offer("L");
        q.offer("B");
        System.out.println(q);
    }
}
/*
Here, "Z" is the highest-priority element based on the comparator, and "A" has the lowest priority. However, the exact order of the remaining elements is not guaranteed when you print the entire queue. The PriorityQueue only guarantees that poll() or peek() will return the highest-priority element ("Z" in this case).
 */

class MyComparator implements Comparator {
    public int compare(Object o1, Object o2){
        String s1 = (String) o1;
        String s2 = o2.toString();
        return s2.compareTo(s1);
    }
}
