package Java8.Streams;

import java.util.ArrayList;
import java.util.List;

public class Filter1 {
    public static void main(String[] args) {
        List<String> l = new ArrayList<String>();
        l.add("Rohan");
        l.add("Roshan");
        l.add("Yashraj");
        l.add("Roshan");
        l.add("Raj");
        l.add("Shreyash");
        l.add("Shubham");
        System.out.println(l);
        List<String> sort1 = l.stream().sorted().toList();
        System.out.println(sort1);
        List<String> sort2 = l.stream().sorted((i1,i2)->{
            int l1 = i1.length();
            int l2 = i2.length();
            if(l1<l2)
                return -1;
            else if(l1>l2)
                return 1;
            else {
                return i1.compareTo(i2);
                //return 0; --> by this two strings having same length not follow alphabetical order.
            }
        }).toList();
        System.out.println(sort2);
    }
}
