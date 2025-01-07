package Collections.Map.TreeMaps;

import java.util.TreeMap;

public class Treemap {
    public static void main(String[] args) {
        TreeMap t = new TreeMap();
        t.put(100,"AAA");
        t.put(500,"BBB");
        t.put(300,"CCC");
        t.put(30,"CDC");
        System.out.println(t);
        try {
            t.put("XXX", "YYY");
        }
        catch (Exception e){
            System.out.println(e);
        }
        System.out.println(t);
        //att.put(null,"TTT");
    }
}
