package Polymophism.Overriding;

class sam1{
    void t(){
        System.out.println("t");
    }
}

class sam2{
    void t2(){
        System.out.println("t2");
    }
}

public class Sameer {
    public static void main(String[] args) {
        sam1 s =new sam1();
        sam2 s1 =new sam2();
        s.t();
        s1.t2();
    }

}
