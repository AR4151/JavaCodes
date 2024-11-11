package Collections.Sets.LinkedHashSets;

import java.util.LinkedHashSet;

public class Example {
    public static void main(String[] args) {
        LinkedHashSet h = new LinkedHashSet();
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
