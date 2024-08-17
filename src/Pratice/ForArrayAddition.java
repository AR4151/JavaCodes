package Pratice;

import java.util.Arrays;

public class ForArrayAddition {
    public static void main(String[] args) {


        int[] ary = {29, 34, 66, 89, 43, 67, 89, 23, 56, 78, 98};
        int length = ary.length;
        //System.out.println(length);

//        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
//        for (int i = 0; i < cars.length; i++) {
//            System.out.println(cars[i]);
//        }

//        int sum = 0;
//        for(int i=0;i<ary.length;i++){
//            int a = ary[i];
//            sum = sum+a;
//        //System.out.println(ary[i]);
//    }
//        System.out.println(sum);

        int [][] a = new int [10][10];
        int l = a.length;
        int q;

        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++) {
                System.out.print("_ ");
            }
            System.out.println();
        }
//        System.out.println();



    }
}

