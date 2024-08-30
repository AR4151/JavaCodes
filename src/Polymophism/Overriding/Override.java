package Polymophism.Overriding;

class AA{
    int Sq(int a){
        return a*a;
    }
}
public class Override extends AA {


    int Sq(int a){
        return a+a;
    }

    public static void main(String[] args) {
        AA a = new AA();
        AA b = new Override();
        System.out.println(a.Sq(15));
        System.out.println(b.Sq(15));

    }
}
