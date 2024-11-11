package Arrays;
import java.util.Arrays;


/* Write the code to print the  all the zeros to Right side and remaining digits are kept as it is in same sequence at Left side.
 int [ ] arr ={0,1,0,2,0,3};*/
// Expected OutPut ==> [1,2,3,0,0,0]

public class RightZeros {

    static void moveZerosToRight(int[] arr){
        System.out.println(Arrays.toString(arr));
        int index = arr.length - 1;
        int j=0;

        for(int i=0;i<=index;i++){
            if(arr[i] != 0){
                arr[j] = arr[i];
                j++;
            }
        }
        //System.out.println(j);
        System.out.println(Arrays.toString(arr));
        for(int i=j;i<=index;i++){
            arr[i] =0;
        }
/*        for(int i=0;i<=index;i++){
            if(arr[i] == 0){
                arr[j] = arr[i];
                //index--;
                j++;
            }
        }*/
        //System.out.println(j);
        System.out.println(Arrays.toString(arr));


    }
    public static void main(String[] args) {
        int [ ] arr ={0,1,0,2,0,3};
        moveZerosToRight(arr);

    }
}
