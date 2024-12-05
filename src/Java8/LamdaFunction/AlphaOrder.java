package Java8.LamdaFunction;

import java.util.List;


public class AlphaOrder {
    static List<String> alphaOrder(List<String> list){
        List<String> list1 = list.stream().sorted((s1,s2)->{
            return s1.compareToIgnoreCase(s2);    //  --> Lambda Expression.
        }).toList();
        List<String> list2 = list.stream().sorted(String::compareToIgnoreCase).toList(); // --> Method Reference.
        return list1;
    }
    public static void main(String[] args) {
        List<String> str = List.of("Roshan","rohan","Ayush","Shubham","yash");
        List<String> colors = List.of("Red","pink","Yellow","black","Blue","white","Green","violet");
        System.out.println("Original Names List:");
        System.out.println(str);
        //System.out.println();
        //alphaOrder(str);
        System.out.println("Names List after Sorting: ");
        System.out.println(alphaOrder(str));
        System.out.println("Original Colors List:");
        System.out.println(colors);
        System.out.println("Colors List after Sorting: ");
        System.out.println(alphaOrder(colors));
    }

}
