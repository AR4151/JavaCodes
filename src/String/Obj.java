package String;

public class Obj {
    public static void main(String[] args) {
        String s1 = new String("hello java");
        String s2 = new String("Hello Java");
        String ss = s1.toLowerCase();
        System.out.println(s1==ss);

        String s3 = "Hello Java";
        String s4 = "Hello Java";


        String s5 = "Hello "+"Java";

        String s6 = "Hello ";
        // System.out.println(s6.t);
        String s7 = s6 +"Java";

        final String s8 = "Hello ";
        String s9 = s8+"Java";

        System.out.println(s1==s2);
        System.out.println(s1==s3);
        System.out.println(s3==s4);
        System.out.println(s4==s5);
        System.out.println(s4==s7);
        System.out.println(s4==s9);

        //StringBuffer ss  = new StringBuffer("java");


    }
}
