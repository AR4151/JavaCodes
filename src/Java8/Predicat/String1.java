package Java8.Predicat;

import java.util.function.Predicate;

public class String1 {
    public static void main(String[] args) {
        Predicate<String>s1 = i->i.length()<5;
        System.out.println(s1.test("Roshan"));
        System.out.println(s1.test("Raj"));

        Predicate<Integer> i1 = i->i%2==0;
        System.out.println(i1.test(15));
        System.out.println(i1.test(10));
    }
}
