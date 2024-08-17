package Constructor;


class A{
    A(){
        this("java");

        System.out.println("AA");
    }
    A(int a){
//        this("java");
        System.out.println("A int a "+a);
    }
    A(String s){
        this(50);
        //this(45);
        System.out.println("A String s "+s);
    }
}
public class ThisInCons {
    public static void main(String[]args){
        A ss = new A();
    }
}
