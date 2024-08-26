package String;

public class Comparison {
    public static void main(String[] args) {
        String S1 = new String("Roshan");
        String S2 = new String("Roshan");
        StringBuffer Sb1 = new StringBuffer("Roshan");
        StringBuffer Sb2 = new StringBuffer("Roshan");
        System.out.println(S1==S2);
        System.out.println(S1.equals(S2));
        System.out.println();
        /*
        For String-
        In simple words,In String == checks the Object Reference/Address.
        .equals() checks the Content.(String cannot Overriden)
        */

        /*
        For StringBuffer-
        Both == and .equals() checks the Object Reference/Address.
        */
        System.out.println(Sb1==Sb2);
        System.out.println(Sb1.equals(Sb2));

        /*
        For String ==> To Add Something we use .concat() method
        For StringBuffer ==> To Add Something we .append() method

        Sb1.concat(" Alte");
        Sb1.append(" Alte");
        System.out.println(Sb1);
        S1.concat(" A");
        S1.append("asd");

         */

    }
}
