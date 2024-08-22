package Arrays;
// Write a Java program to sum values of an array.


public class SumOfArrayElem {


    int [] Arr = {12,15,48,23,25,48,78,45,36,47,55,85};


    public static void main(String[] args) {
        int sum =0;
        SumOfArrayElem AA = new SumOfArrayElem();
        for(int i=0;i<AA.Arr.length;i++){
            sum = sum+AA.Arr[i];
        }
        System.out.println("The Addition of elements of given Array is "+sum+".");
    }
}
