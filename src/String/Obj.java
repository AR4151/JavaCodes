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
        System.out.println();

        StringBuffer sb  = new StringBuffer("java");
        System.out.println(sb);
        sb.append("Program");
        System.out.println(sb);
        sb.substring(1,5);
        System.out.println(sb);
        System.out.println(sb.charAt(4));
        sb.replace(0,4,"python");
        System.out.println(sb);
        String dt = "java";
        System.out.println(dt.repeat(5));
        dt.substring(1,4);
        StringBuffer sb1  = new StringBuffer("java");
        System.out.println(sb1);
        /*1. String Literals
"Hello " and "Java" are string literals.
They are created (or retrieved, if already present) in the String Constant Pool (SCP).
2. Concatenation Process
The expression s6 + "Java" involves runtime string concatenation, so:

The + operator results in the creation of a new String object in the Heap Memory.

The result of concatenation ("Hello Java") is not automatically placed in the SCP because it is computed at runtime.
Instead, it is stored in the Heap Memory as a new String object.
However, if you explicitly call intern() on s7, its value ("Hello Java") will be added to the SCP (if it doesn't already exist):*/


    }
}
