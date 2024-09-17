package Polymophism.Overriding;

class Aa{
    void Test(){
        System.out.println("Class A-Test");
    }
}
class Bb{
    void Test(){
        System.out.println("Class B-Test");
    }
}

class Casting {
    public static void main(String[] args) {
        Aa a = new Aa();
        Bb b = new Bb();
        a.Test();
        b.Test();
    }
}
