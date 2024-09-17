package String;

public class StringMethods {
    public static void main(String[] args) {
        String s = "Java Programming  ";
        System.out.println(s.length());
        System.out.println(s.concat("World"));
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());
        System.out.println(s.replace("J","Y"));
        System.out.println(s.replace("Java","Python"));
        System.out.println(s.indexOf("g"));
        System.out.println(s.charAt(10));
        System.out.println(s.trim());
        System.out.println(s.startsWith("Ja"));
        System.out.println(s.endsWith("g"));
        System.out.println(s.substring(10));
        System.out.println(s.substring(0,4));
        System.out.println(s.isEmpty());
        System.out.println(s.equals("java"));
        System.out.println(s.contains("P"));
    }
}
