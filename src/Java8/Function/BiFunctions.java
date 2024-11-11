package Java8.Function;

import java.util.function.BiFunction;
class Test{
    int a;//int b;
    Test(int a /*int b*/){
        this.a = a;
        //this.b = b;
    }
    static void SumEven(int a, int b){
        System.out.println("Sum is "+(a+b));
        if((a+b)%2==0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }

    }
}

public class BiFunctions {
    public static void main(String[] args) {
        BiFunction<Integer,Integer,Integer> i =(a, b)->{
          if((a+b)%2==0){
              System.out.println("Even");
          }
          else{
              System.out.println("Odd");
          }
            return a+b;
        };
        System.out.println(i.apply(15,20));
        System.out.println(i.apply(55,45));

        Test.SumEven(44,48);
    }
}
