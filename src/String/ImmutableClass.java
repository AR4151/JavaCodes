package String;

final class Test{
    private int a;
    Test(int a){
        this.a = a;
    }
    public Test Modify(int a){
        if(this.a == a){
            return this;
        }
        else{
            return new Test(a);
        }
    }
}

public class ImmutableClass {
    public static void main(String[] args) {
        Test t = new Test(10);
        Test t1 = t.Modify(100);
        Test t2 = t.Modify(10);
        System.out.println(t==t1);
        System.out.println(t==t2);
        //System.out.println(t.a=15);

    }
}
