package ConcurrentCollections;

import java.util.ArrayList;

public class ConModExp {
    static ArrayList<Integer> l = new ArrayList<>();
    public static void main(String[] args) throws InterruptedException {

        l.add(15);
        l.add(11);
        l.add(18);
        l.add(10);
        //System.out.println(l);
        //l.forEach(System.out::println);
        Runnable r = ()-> {
            //Thread.sleep(50);
            l.add(35);
        };
        Thread t = new Thread(r);
        t.start();
        for (Integer i : l) {
            //Thread.sleep(10);
            System.out.println(i);
        }
        l.forEach(System.out::println);
    }


}
