package Java8.Predicat;

import java.util.function.BiPredicate;

public class BiPredi {
    public static void main(String[] args) {
        BiPredicate<Integer,Integer> t = (a,b)->(a+b)%2==0;

        boolean b = t.test(15,25);
        System.out.println(b);
        System.out.println(t.test(55,48));
    }
}
