package MultiThreading;


class Parent{
    void parent(){
        System.out.println("Parent");
    }
}
public class OverloadingInDiffClass extends Parent {
    int parent(int a){
        System.out.println("Parent1");
        return a;
    }

    public static void main(String[] args) {
        OverloadingInDiffClass oo = new OverloadingInDiffClass();
        Parent pp = new Parent();
        Parent p1 = new OverloadingInDiffClass();
        oo.parent();
        pp.parent();
        p1.parent();

        System.out.println(oo.parent(10));
        //pp.parent(10);
       // p1.parent(10);

    }
}
