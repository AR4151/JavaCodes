package Arrays;
//Write a Java program to calculate the average value of array elements.

public class ArrAvg {
    public static void main(String[] args) {
        int [] Arr = {110,125,155,145,122,158,458,200};
        float sum = 0;
        for(int i=0;i<Arr.length;i++){
            sum= sum+Arr[i];
        }
        System.out.println("The Average value of array elements: "+sum/Arr.length);
    }
}
