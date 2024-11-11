package Java8.Predicat;

import java.util.function.Predicate;

public class StringArr1 {
    public static void main(String[] args) {
        String[] s1 = {"Roshan","Rohan","Raj","Rajinikanth","Prabhas"};

        Predicate<String>s = ss->ss.length()%2==0;
        for(String t:s1){
            if(s.test(t)){
                System.out.println(t);
            }
        }
    }
}
