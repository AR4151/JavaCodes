package Polymophism.Overriding;


class One{
    int Int(int a){
        return a*a;
    }
}

class Two /*extends One*/{
    int Int(int a){
        return a*a;
    }

}
class MethResolution {
    public static void main(String[] args) {
        One o = new One();
        Two t = new Two();
        //Hello h = new Hello();
        //One oo = new Two();
        //System.out.println(h.Int(10));
        System.out.println(o.Int(5));
        System.out.println(t.Int(5));
        //System.out.println(oo.Int(5));
    }




}
