package Arrays;

//Write a Java program to find duplicate values in an array of string values

public class DupEle {
    public static void main(String[] args) {
        int [] A = {15,12,45,15,88,56,98,45,66,78,65,88,66};
        for(int i=0;i<A.length;i++){
            for(int j=i+1;j<A.length;j++){
                if(A[i]==A[j]){
                    System.out.println("Duplicate Element is "+A[j]);
                }
            }
        }
    }
}
