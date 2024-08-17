package String;

public class S {
    public static void main(String[] args) {
        String S = new String("Roshan");
        S.concat("Alte");
        System.out.println(S);

        StringBuffer SS = new StringBuffer("Roshan");
        SS.append(" Alte");
        System.out.println(SS);

        //The main difference between String and StringBuffer is that String is Immutable and StringBuffer is Mutable.

    }
}
