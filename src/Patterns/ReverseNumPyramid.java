package Patterns;

public class ReverseNumPyramid {
    public static void main(String[] args) {
        RevNumPyramid(6);
    }
    static void RevNumPyramid(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n+1-i;j++) {
                System.out.print(j + " ");

            }
            System.out.println();
        }
    }
}
