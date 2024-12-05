package Java8.LamdaFunction;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class UppLowC {
    static List<String> toUpperCase(List<String> list){
        Function<String,String> str = String::toUpperCase;
        List<String> upperCase = new ArrayList<>();
        for(String s:list){
            upperCase.add(str.apply(s));

        };

        return upperCase;
    }
    static List<String> toLowerCase(List<String> list){
        Function<String,String>  s = String::toLowerCase;
        //Function<String,String>  s = str -> str.toLowerCase();
        List<String> lowerCase = new ArrayList<>();
        for(String str:list){
            lowerCase.add(s.apply(str));
        }
        return lowerCase;
    }

    public static void main(String[] args) {
        List<String> l = new ArrayList<>();
        l.add("roshan");
        l.add("rohan");
        l.add("raj");
        l.add("yash");
        System.out.println(toUpperCase(l));

        List<String> ll = List.of("ROSHAN","ROHAN","RoCKY");
        System.out.println(toLowerCase(ll));
    }
}
