package Java8.Streams;

import java.util.ArrayList;
import java.util.List;

/*
Intermediate Operations: Transform streams but are lazy.
Terminal Operations: Consume streams and produce results, triggering the execution pipeline.

 */

public class Filters {
    public static void main(String[] args) {
        ArrayList<Integer> marks = new ArrayList<>();
        marks.add(70);
        marks.add(45);
        marks.add(10);
        marks.add(65);
        marks.add(20);
        marks.add(25);
        //marks.add("Alte");
        System.out.println(marks);
        long failedStudent = marks.stream().filter(i->i<35).count();
        List<Integer> failedStudent1 = marks.stream().filter(i->i<35).toList();
        //ArrayList<Integer> failedStudent1 = marks.stream().filter(i->i<35).toList();  --> toList(): Available from
        // Java 16 onward, creates an immutable list.
        //Note: The list returned by toList() is unmodifiable, so if you need to modify the list later, use the Collectors.toCollection() approach.
        System.out.println("Number of Students Failed");
        System.out.println(failedStudent);
        System.out.println("Their Marks are as follows");
        System.out.println(failedStudent1);
        List<Integer> sortedList = marks.stream().sorted().toList();
        /*List<Integer> sortedList = new ArrayList<>(marks.stream().sorted().toList());
        sortedList.add(55);*/
        System.out.println(sortedList);
        /*List<Integer> sort1 = marks.stream().sorted((i1, i2)->(i1<i2)?1:(i1>i2)?1:0).toList(); --> If you want ele as acc. to Insertion order.
        List<Integer> sort1 = marks.stream().sorted((i1, i2)->(i1<i2)?-1:(i1>i2)?-1:0).toList(); --> If you want ele in Reverse of Insertion order*/
        List<Integer> sort1 = marks.stream().sorted((i1, i2)->(i1<i2)?1:(i1>i2)?-1:0).toList();
        System.out.println(sort1);
    }
}
