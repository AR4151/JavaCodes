package String;

public class S {
    public static void main(String[] args) /*throws InterruptedException*/ {
        //Thread.sleep(10000);
        String S = new String("Roshan");
        S.concat("Alte");
        System.out.println(S);

        StringBuffer SS = new StringBuffer("Roshan");
        SS.append(" Alte");
        System.out.println(SS);
        //System.out.println(S instanceof Object);

        //The main difference between String and StringBuffer is that String is Immutable and StringBuffer is Mutable.

    }
}
