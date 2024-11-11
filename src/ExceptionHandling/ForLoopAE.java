package ExceptionHandling;

public class ForLoopAE {
    public static void main(String[] args)
    {
        for (int i = 1; i <= 5; i++) {
            System.out.print(i + " ");
            try {
                int a = 10;
                int b = 0;
                int c = a/b;
                System.out.println(c);
            }
            catch (NullPointerException ae) {

            }
        }
        /*
      int a = 10;
      double b = 0.0;
      int c = (int) (a/b);
      System.out.println(c);*/
    }
}
