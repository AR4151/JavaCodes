package Patterns;

public class ZeroOneTriangle {
    public static void main(String[] args) {
        zeroOneTriangle(5);
    }
    static void zeroOneTriangle(int n){
        int i,j;
        for(i=1;i<=n;i++){
            for(j=1;j<=i;j++){
                if(i%2!=0 || j%2==0) {
                    if(i%2!=0 && j%2==0){
                        System.out.print(0+" ");
                    }else {
                        System.out.print(1+" ");
                    }
                }else{
                    System.out.print(0+" ");
                }
            }
            System.out.println();
        }
    }
}
