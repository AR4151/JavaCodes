package String;

public class Heap_SCP {


    public static void main(String[] args) {

        String s1 = new String("You cannot change Me");
        String s2 = new String("You cannot change Me");
        System.out.println(s1==s2); // ==> false

        String s3 = "You cannot change Me";
        System.out.println(s1==s3); // ==> false

        String s4 = "You cannot change Me";
        System.out.println(s3==s4); // ==> true

        String s5 = "You cannot "+"change Me";
        System.out.println(s4==s5); // ==> ture

        String s6 = "You cannot ";
        String s7 = s6 + "change Me";
        System.out.println(s4==s7); // ==> false

        final String s8 = "You cannot ";
        //s8 = "You";
        String s9 = s8+"change Me";
        System.out.println(s4==s9); // ==> true


        //Initial Capacity of StringBuffer
        StringBuffer ss = new StringBuffer();
        StringBuilder sg = new StringBuilder();
        System.out.println(ss.capacity());
        sg.append("1234567891234567");
        System.out.println(sg.capacity());


        StringBuffer sb = new StringBuffer("Roshan");
        System.out.println(sb.capacity());

        StringBuilder sb1 = new StringBuilder("Roshan");
        System.out.println(sb1.capacity());
        //StringBuilder sb1 = new StringBuilder("RoshanRoshanRoshan");
        sb1.append("RoshanRoshanRosha");
        System.out.println(sb1.capacity());

    }
}
