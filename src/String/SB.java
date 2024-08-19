package String;

public class SB {
//    String S = "Roshan";
    String Ss = "Alte";

    StringBuffer sb = new StringBuffer("Roshan");
    StringBuffer Sb = new StringBuffer("Alte");
    public static void main(String[] args) {
        String S = "Roshan";

        String bb = new String("Roshan");
        String ss = new String("Roshan");

        String s = "Roshan";
        //System.out.println(ss.equals(bb));
        //System.out.println(S.equals(s));
        //sb.S = "RR";
        /*System.out.println(S==bb);
        System.out.println(ss==bb);
        System.out.println(S==s);*/

        StringBuffer sb = new StringBuffer("Rohan");
        System.out.println(sb);
        StringBuffer newb = sb.append(" Alte");
        //StringBuffer st = new StringBuffer("Roshan").append(" Alte");
        System.out.println(sb);
        System.out.println(newb);
        System.out.println(sb==newb);


    }
}

