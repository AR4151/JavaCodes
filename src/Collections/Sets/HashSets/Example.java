package Collections.Sets.HashSets;

import java.util.HashSet;

public class Example {
    public static void main(String[] args) {
        HashSet h = new HashSet();
        h.add(10);
        h.add("R");
        h.add("Z");
        h.add(null);
        h.add("20");
        h.add("r");
        h.add("z");
        System.out.println(h);
    }
}
