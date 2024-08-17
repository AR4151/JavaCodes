package Blocks;


class A{
    void sub(int a,int b){
        System.out.println(a-b);

    }
    int add(int a,int b){
        System.out.println(Add(15,15));
        return a+b;
    }
    static int Add(int c,int d){
        //A.add(10,25);
        return c*d;
    }
}
public class Meth {
    public static void main(String[] args) {
        A A = new A();
        System.out.println(A.add(5,15));
        A.sub(15,5);
        //System.out.println(A.Add(10,10));
        //A.add(10,10);

    }
}
