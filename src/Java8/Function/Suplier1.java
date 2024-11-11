package Java8.Function;

import java.util.Date;
import java.util.function.Supplier;

public class Suplier1 {
    public static void main(String[] args) {
        //Supplier<Date> t = ()-> new Date();
        Supplier<Date> t = Date::new;

        System.out.println(t.get());
        System.out.println(t.get());
        System.out.println(t.get());
    }
}
