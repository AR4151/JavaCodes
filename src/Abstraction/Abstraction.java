package Abstraction;

public class Abstraction {

}

abstract class Ab{
//    void show(){
//        System.out.println();

    abstract int a();

}
interface Int{

}
interface In{

}
interface Test extends Int,In {

}
//abstract class ff{
//    abstract int b();
//}

class ff extends Ab implements Int,In{

    @Override
    int a() {
        return 0;
    }

    public static void main(String[] args) {

    }
}
