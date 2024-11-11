package Collections.Vectors;

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
        //System.out.println(v.addElement(15));
        System.out.println(v);
    }
}
