package Patterns;

public class SqrHallow {
    static void Pattern(int n){
        System.out.printf("Square Pattern of %dx%d\n",n,n);
        int i,j;

        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                if(i==0 || j==0 || i==n-1 || j==n-1){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }


    public static void main(String[]args){

        Pattern(10);

//        for(int i=1;i<=6;i++){
//            //System.out.print("* ");
//            for(int j=1;j<=5;j++){
//                if(i==1 || i==6 || j==1 || j==5){
//                    System.out.print("* ");
//                }
//                else{
//                    System.out.print("  ");
//                }
//            }
//            System.out.println();
//        }
    }
}
