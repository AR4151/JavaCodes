package Collections.Queue;

import java.util.concurrent.ArrayBlockingQueue;

public class ArrayBQ {
    public static void main(String[] args) {
        ArrayBlockingQueue ab = new ArrayBlockingQueue(2);
        ab.add(15);
        ab.add(10);
        System.out.println(ab);
        System.out.println(ab.offer(11));
        ab.add(11);
    }
}
