package String;

public class Imp {
    public static void main(String[] args) {
        /*String s1 = "roshan";
        String s2 = s1.toString();
        System.out.println(s1==s2);//t
        String s3 = s1.toLowerCase();
        String s4 = s1.toUpperCase();
        System.out.println(s1==s3);//t
        System.out.println(s1==s4);//f
        System.out.println();*/

        String g1 = new String("java roshan");
        String gg = "java roshan";

        String g2 = g1.toUpperCase();
        String g3 = g1.toLowerCase();
        String gg1 = gg.toUpperCase();
        String gg2 = gg.toLowerCase();
        System.out.println(g1==g2); //false
        System.out.println(g1==g3);//true
        System.out.println(g1==gg);//false
        System.out.println(gg1==gg);//false
        System.out.println(gg==gg2);//true
        System.out.println(gg2==gg1);//false
        System.out.println(gg1==g2);//false

        /*StringBuffer ss = new StringBuffer("java");
        ss.substring(2);
        System.out.println(ss);
        ss.append("Pro");
        ss.replace(0,ss.length(),"o");
        System.out.println(ss);

        String sss = "Hello";
        sss = sss.concat("HI");
        System.out.println(sss);*/
    }
}
