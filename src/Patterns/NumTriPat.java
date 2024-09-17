package Patterns;

public class NumTriPat {

    public static void main(String[] args) {
        Pattern(4);
    }

   static  void Pattern(int a){
        int i,j;

        for(i=1;i<=a;i++){
            for(j=1;j<=a-i;j++){
                System.out.print(" ");
            }
            for(j=1;j<=i;j++){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

}


