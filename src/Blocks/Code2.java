package Blocks;
class One{
    One(){
        System.out.println("One Cons");
    }
    static{
        System.out.println("StaticB One");
    }
    {
        System.out.println("InstanceB One");
    }

}
class Two extends One {
    Two(){
        System.out.println("Two Cons");
    }
    static{
        System.out.println("StaticB Two");
    }
    {
        System.out.println("InstanceB Two");
    }
}
public class Code2 {
    public static void main(String[] args) {
        System.out.println("Main Method");
        Two t =new Two();
        System.out.println("Main Method1");
        One o = new One();
        System.out.println("Main Method2");

    }

}
