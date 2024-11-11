package Java8.Function;

import java.util.function.Function;

public class Chaining {
    public static void main(String[] args) {
        Function<Integer,Integer> f = i->i*2;
        Function<Integer,Integer> t = i->i*i*i;

        // .andThen() means "apply f first, then apply t on the result of f."
        System.out.println(f.andThen(t).apply(2));
        // .compose() means "apply t first, then apply f on the result of t."
        System.out.println(f.compose(t).apply(2));
    }
}
