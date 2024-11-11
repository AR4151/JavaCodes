package String.Stirng;

public class CompareTo {
    public static void main(String[] args) {
        String s = "Roshan";
        String n = "Rohan";
        String r = "roshan";
        String j = "Akash";
        String a = "5261";
        System.out.println(s.compareTo("roshan"));
        System.out.println(r.compareToIgnoreCase(s));
        System.out.println(r.compareTo(s));
        System.out.println(s.compareTo("Ro"));
        System.out.println("R".compareTo(s));
        System.out.println(n.compareTo(s));
        System.out.println(s.compareTo(n));
        System.out.println(r.compareTo(j));


        System.out.println(a.compareTo("2"));
        System.out.println(a.compareTo("52"));

    }
}
