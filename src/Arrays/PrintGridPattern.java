package Arrays;
//Write a Java program to print the following grid.

public class PrintGridPattern {
    public static void main(String[] args) {
        int [][] a = new int [10][10];
        for (int i=0;i<10;i++){
            for(int j=0;j<10;j++){
                System.out.print("- ");
            }
            System.out.println();
        }
    }
}
