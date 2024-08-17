package Blocks;


public class Blocks {
    Blocks(){
        System.out.println("COns ");
    }

    {
        System.out.println("hi");
    }

    static{
        System.out.println("Ho");
    }

    public static void main(String[] args) {
        System.out.println("Main");
        Blocks A = new Blocks();
        Blocks AA = new Blocks();
        Blocks AAA = new Blocks();
    }
}
