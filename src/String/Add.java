package String;

public class Add {
    Object o;
    String s;
    void add(Object o){
        this.o =o;
        //System.out.println("Object");
    }
    void add(String s){
        System.out.println(this.s=s);
        //System.out.println("String");
    }
    public static void main(String[] args) {
        Add aa = new Add();
        aa.add(null);

        String s = """
                """;

        String f = "Hello";
        System.out.println(f.toString());
    }


}
