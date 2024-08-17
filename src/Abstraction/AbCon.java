package Abstraction;

public class AbCon {
    AbCon(){
        //String name;
        System.out.println("Constructor");
    }
    static{
        System.out.println("Hello");
    }

    {
        System.out.println("HI...");
    }

    public static void main(String[] args) {
        System.out.println("Hey..");
        AbCon AA = new AbCon();

    }
}
//class AA extends AbCon{
//    public static void main(String[] args) {
//        //AbCon aa = new AbCon("Hello");
//        System.out.println("Hi..");
//    }
//}
