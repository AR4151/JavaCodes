package Java8.LamdaFunction;

import java.util.List;

public class EvenOdd {
    static void  evenOdd(List<Integer> list){
        List<Integer> even = list.stream().filter(n->n%2==0).toList();
        List<Integer> odd = list.stream().filter(n->n%2!=0).toList();
        System.out.println("Even Number List:");
        System.out.println(even);
        System.out.println("Odd Number List:");
        System.out.println(odd);

    }

    public static void main(String[] args) {
        List<Integer> l = List.of(12,15,48,45,66,88,75,78,34,22,99);
        //System.out.println(evenOdd(l));
        evenOdd(l);
    }
}
