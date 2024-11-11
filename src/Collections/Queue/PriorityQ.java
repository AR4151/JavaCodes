package Collections.Queue;

import java.util.PriorityQueue;

public class PriorityQ {
    public static void main(String[] args) {
        PriorityQueue q = new PriorityQueue();
        System.out.println(q.peek());
        //System.out.println(q.element());
        for(int i=0;i<10;i++){
            q.offer(i);
        }
        System.out.println(q);
        System.out.println(q.peek());
        System.out.println(q.element());
        System.out.println(q.poll());
        System.out.println(q.remove());
        System.out.println(q);
    }
}
