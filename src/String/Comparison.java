package String;

public class Comparison {
    public static void main(String[] args) {
        String S1 = new String("Roshan");
        String S2 = new String("Roshan");
        StringBuffer SS = new StringBuffer("Roshan");
        StringBuffer SS1 = new StringBuffer("Roshan");
        System.out.println(S1==S2);
        System.out.println(S1.equals(S2));
        System.out.println();
        /*
        For String-
        In simple words,In String == checks the Object Reference/Address.
        .equals() checks the Content.(String is Overridden)
        */

        /*
        For StringBuffer-
        Both == and .equals() checks the Object Reference/Address.
        */
        System.out.println(SS==SS1);
        System.out.println(SS.equals(SS1));
    }
}
