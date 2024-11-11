package Arrays;
//Write a Java program to reverse an array of integer values.

import java.util.Arrays;

public class ArrRev {


    public static void main(String[] args) {
        int [] Arr = {25,50,12,48,65,14,78,95,26,19,85};
        int [] Reverse = new int [Arr.length];

        for(int i=0;i<Arr.length;i++){
            Reverse[i] = Arr[Arr.length-1-i];
        }
        System.out.println(Arrays.toString(Reverse));

    }
}
