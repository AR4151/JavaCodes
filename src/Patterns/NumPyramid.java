package Patterns;

public class NumPyramid {
    public static void main(String[] args) {
        NumPyramidPattern(5);
    }
    static void NumPyramidPattern(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
