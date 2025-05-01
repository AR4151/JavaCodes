package Java8.Streams;

import java.util.Arrays;
import java.util.Comparator;

public class SecHighestNum {
    public static void main(String[] args) {
        int[] num = {15,58,36,48,98,64,78,25,66};

        int secHighest = Arrays.stream(num).boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
        System.out.println(secHighest);
        Integer secHigh = Arrays.stream(num).sorted().skip(num.length-2).findFirst().getAsInt();
        System.out.println(secHigh);

    }
}
