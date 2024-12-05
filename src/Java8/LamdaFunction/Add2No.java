package Java8.LamdaFunction;

import java.util.function.IntBinaryOperator;

public class Add2No {

    static int add2Num(int x, int y){
        IntBinaryOperator add = (a,b) -> (a+b);
        return add.applyAsInt(x,y);

    }
    public static void main(String[] args) {
        System.out.println(add2Num(852,456));
        System.out.println(add2Num(123,789));

    }
}
