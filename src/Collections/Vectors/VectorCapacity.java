package Collections.Vectors;

import java.util.Stack;
import java.util.Vector;

public class VectorCapacity {
    public static void main(String[] args) {
        Vector v = new Vector(10,5);
        System.out.println(v.capacity());
        for(int i=1;i<=10;i++){
            v.add(i);
        }
        System.out.println(v);
        v.add(15);
        v.addElement(15);
        //System.out.println(v.addElement(15));  --> This method is specific to Vector class and it returns nothing i.e, void
        System.out.println(v);

        Stack<Character> stk = new Stack<>();
        stk.add('A');
        stk.add('B');
        stk.add('C');
        System.out.println(stk);
        System.out.println(stk.pop());
        System.out.println(stk);
    }
}
