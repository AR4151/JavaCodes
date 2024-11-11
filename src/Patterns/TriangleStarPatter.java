package Patterns;

public class TriangleStarPatter {

    public static void main(String[] args){
        triangleStarPattern(5);
    }


    static void triangleStarPattern(int n){
        int i,j;

        for(i=1;i<=n;i++){
             for(j=1;j<=n-i;j++){
                 System.out.print(" ");
             }
             for(j=1;j<=i;j++){
                 System.out.print("* ");
             }

            System.out.println();
             //for(j)
        }

    }
}

