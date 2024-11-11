package Java8.Streams;

import java.util.ArrayList;
import java.util.function.Consumer;

public class MinMax {
    public static void main(String[] args) {
        ArrayList<Integer> l = new ArrayList<Integer>();
        l.add(15);
        l.add(25);
        l.add(5);
        l.add(2);
        l.add(105);
        int min =  l.stream().min((i1,i2)->i1.compareTo(i2)).get();
        int max =  l.stream().max((i1,i2)->i1.compareTo(i2)).get();
        int min1 =  l.stream().min((i1,i2)->i2.compareTo(i1)).get();
        int max1 =  l.stream().max((i1,i2)->i2.compareTo(i1)).get();
        /* Remember for min & max value doesn't matter.Matters only Sorting_Order.We need to pass Comparator.
        It works based on the sorting order of Comparator not on the Values*/
        System.out.println(min);
        System.out.println(max);
        System.out.println(min1);
        System.out.println(max1);
        System.out.println();

        //Print all Elements one by one -
        for(Integer i : l){
            System.out.println(i);
        }
        //By using Java8 -
        l.forEach(System.out::println);
        Consumer<Integer> f = i-> System.out.println("The Square of "+i+" is "+i*i+".");
        l.forEach(f);
        //Squaring all the elements-
        /*Function<Integer,Integer> f = i->{
                System.out.println(i*i);
                return i*i;

        };
        The code snippet you've provided is likely causing an error because the forEach() method in Java's Stream or
        Collection interface requires a consumer, not a function that returns a value.
        l.forEach(f);*/
    }
}
