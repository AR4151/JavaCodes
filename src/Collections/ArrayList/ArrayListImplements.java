package Collections.ArrayList;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.RandomAccess;

public class ArrayListImplements {
    public static void main(String[] args) {
        ArrayList l = new ArrayList();
        LinkedList l1 = new LinkedList();

        System.out.println(l instanceof Cloneable);
        System.out.println(l instanceof Serializable);
        System.out.println(l instanceof RandomAccess);
        System.out.println();
        System.out.println(l1 instanceof Cloneable);
        System.out.println(l1 instanceof Serializable);
        System.out.println(l1 instanceof RandomAccess);

//        char a=5;
//        System.out.println(a);


    }
}
