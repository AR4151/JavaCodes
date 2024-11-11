package String;

public class HashCode {

    public int hashCode(){
        return 1001;
    }

    public static void main(String[] args) {
        HashCode h1 = new HashCode();
        HashCode h2 = new HashCode();
        System.out.println(h1.hashCode());
        System.out.println(h2.hashCode());

        String s1 = "Java";
        String s2 = new String("Java");
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
    }
}
