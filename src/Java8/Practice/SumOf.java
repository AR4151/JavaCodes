package Java8.Practice;

import java.util.function.BiFunction;

public class SumOf {
    public static void main(String[] args) {
        BiFunction<Integer,Integer,Integer> i = (a, b)-> (a+b);
        BiFunction<Integer,Integer,Integer> i1 =  Integer::sum;
        System.out.println(i.apply(15,25));
    }
}
