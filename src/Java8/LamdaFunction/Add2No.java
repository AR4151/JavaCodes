package Java8.LamdaFunction;

import java.util.function.IntBinaryOperator;
/*
* In anonymous classes, a new object is always created for every declaration.
  In lambda expressions, object creation depends on the nature of the lambda:
    -Stateless lambdas: Reuse a single instance.
    -Stateful lambdas: Create a new instance for each use.*/
public class Add2No {

    static int add2Num(int x, int y){
        IntBinaryOperator add = (a,b) -> (a+b);
        return add.applyAsInt(x,y);

    }
    public int addTwoNum(int a,int b){
        IntBinaryOperator app = Integer::sum;
        return app.applyAsInt(a,b);
    }
    public static void main(String[] args) {
        System.out.println(add2Num(852,456));
        System.out.println(add2Num(123,789));
        Add2No add = new Add2No();
        System.out.println(add.addTwoNum(450,550));

    }
}
