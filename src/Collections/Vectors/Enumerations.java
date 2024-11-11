package Collections.Vectors;
import java.util.*;
import java.util.Enumeration;

public class Enumerations {
    public static void main(String[] args) {
        Vector v = new Vector();
        for(int i=1;i<=10;i++){
            v.add(i);
        }
        System.out.println(v);
        Enumeration e = v.elements();
        while(e.hasMoreElements()){
            Integer I = (Integer) e.nextElement();
            if(I%2==0){
                System.out.println(I);
            }
            //System.out.println(I);
        }
        System.out.println(v);

    }

}
