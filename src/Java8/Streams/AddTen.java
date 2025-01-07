package Java8.Streams;

import java.util.ArrayList;
import java.util.List;

public class AddTen {
    public static void main(String[] args) {
        ArrayList<Integer> marks = new ArrayList<>();
        marks.add(70);
        marks.add(45);
        marks.add(10);
        marks.add(65);
        marks.add(20);
        marks.add(25);

        List<Integer> add = marks.stream().map(i->i+10).sorted().toList();
        System.out.println(add);



    }
}
