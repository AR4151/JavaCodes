package Java8.Function;

import java.util.Scanner;
import java.util.function.Function;
import java.util.function.Predicate;

public class Example {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String s = sc.next().trim();
        Function<String, String> s1 = String::toUpperCase;
        System.out.println(s1.apply(s));
        //Predicate<String> pp = p1-> Boolean.parseBoolean(p1.toUpperCase());
        Predicate<String> p = p1-> p1.equals(p1.toUpperCase());
        System.out.println(p.test(s));
        //System.out.println(pp.test("false"));



    }
}
