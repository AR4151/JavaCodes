package Polymophism.Overriding;

class Aaa{
    void Test(){
        System.out.println("Class A-Test");
    }
}
class Bb extends Aaa{
    void Test(){
        System.out.println("Class B-Test");
    }

}

class Casting {
    public static void main(String[] args) {
        Aaa a = new Aaa();
        Bb b = new Bb();
        a.Test();
        b.Test();
    }
}
