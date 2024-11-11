package String.Stirng;


class Char{
    static String oneByOneChar(String s){

        int i=0;
        String s1 = "";

        while( i<s.length()){
           char c1= s.charAt(i);
           //s1 = s1.concat((c1+" "));
            System.out.print(s.charAt(i)+" ");
           i+=2;
        }
        //System.out.println(c1);
        return s1;
    }
}
public class OneByOneChar {
    public static void main(String[] args) {
        String d = "Roshan";
        //char d1 = d.charAt(2);
        System.out.println(d);
        System.out.println(Char.oneByOneChar(d));

    }

}
