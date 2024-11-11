package Java8.Practice;

import java.util.function.Predicate;

public class EmptyString {
    public static void main(String[] args) {
        Predicate<String> s = (i)->i.isEmpty();
        Predicate<String> s1 = String::isEmpty;
        System.out.println(s.test("Java"));
        System.out.println(s.test(""));
        System.out.println(s.test(" "));
    }
}
