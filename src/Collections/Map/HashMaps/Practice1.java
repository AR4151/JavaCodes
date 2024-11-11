package Collections.Map.HashMaps;

import java.util.*;

public class Practice1 {
    public static void main(String[] args) {
        HashMap m = new HashMap();
        m.put("Roshan",8000);
        m.put("Shahrukh",6300);
        m.put("Salman",5000);
        m.put("Akshay",5000);
        System.out.println(m);
        System.out.println(m.put("Salman",5500));
        Set s = m.keySet();
        System.out.println(s);
        Collection c = m.values();
        System.out.println(c);
        Set s1 = m.entrySet();
        System.out.println(s1);

        Iterator itr = s1.iterator();
        while(itr.hasNext()){
            Map.Entry m1 = (Map.Entry) itr.next();
            System.out.println(m1.getKey()+" --> "+m1.getValue());

            if(m1.getKey().equals("Roshan")){
                m1.setValue(10000);
            }
        }
        System.out.println(m);

    }
}
