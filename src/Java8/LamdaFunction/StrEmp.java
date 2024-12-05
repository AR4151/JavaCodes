package Java8.LamdaFunction;

import java.util.function.Function;

public class StrEmp {

    public static String isEmpty(String s){
        Function<String,String> s1 = str ->{
                if(str.isEmpty()){
                    return "String is Empty";
                }
                else {
                    return "String is Not Empty";
                }

        };
        return s1.apply(s);
    }

    public static void main(String[] args) {
        System.out.println(isEmpty(""));
        System.out.println(isEmpty("Roshan"));
        System.out.println(isEmpty(" "));
    }
}
