package Blocks;

public class Code3 extends AB{
    public static void main(String[] args) {
        System.out.println("Main");

    }
}

class AB{
    AB(){
        System.out.println("Cons->AB");

    }
    AB(int a){
        System.out.println("Cons->Int a");
    }
    static{
        System.out.println("Static Block AB");
    }
    {
        System.out.println("Inst. Block AB");
    }

}