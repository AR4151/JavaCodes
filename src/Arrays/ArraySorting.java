package Arrays;
import java.util.Arrays;

//Write a Java program to sort a numeric array.

public class ArraySorting {
    public static void main(String[] args) {
        int [] Arr = {154,150,200,115,152,456,625,126};
        System.out.println("Original Arrays: "+Arrays.toString(Arr));
        Arrays.sort(Arr);
        System.out.println("Array after Sorting: "+Arrays.toString(Arr));
    }
}
