package Arrays;
import java.util.Arrays;

/* Write the code to print the  all the zeros to Left side and remaining digits are kept as it is in same sequence at Right side.
 int [ ] arr ={0,1,0,2,0,3};*/
// Expected OutPut ==> [0,0,0,1,2,3]
public class LeftZeros {

    static void moveZerosToLeft(int[] arr){
        int index = arr.length-1;
        int j=0;

        for(int i=index;i>=0;i--){
            if(arr[i] != 0){
                arr[index] = arr[i];
                index--;
            }
        }
        System.out.println(index);
        for(int i=j;i<=index;i++){
            arr[j] = 0;
            j++;
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int [ ] arr ={0,1,0,2,0,3};
        moveZerosToLeft(arr);
    }

}
