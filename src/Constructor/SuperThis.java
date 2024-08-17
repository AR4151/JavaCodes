package Constructor;

//class CC {
//    CC(){
//        this(60);
//        System.out.println("'");
//    }
//    CC(int c){
//        System.out.println(c);
//    }
//}

class AA {
    int a;
    AA(){
        this(20);
        System.out.println("This is Class AA");
    }
    AA(int a){
        //super();
        System.out.println("This is int a from class AA ");
    }
}
class BB extends AA{
    int b;
    BB(){
        this(50,"String");
        System.out.println("This is class BB");
    }
    BB(int b,String s){
        //super();
        //System.out.println(s);
        System.out.println("This is int b from class BB ");
    }
    public static void main(String []args){
        BB ss = new BB();
//        int n=2445;
//        String s = ""+n;
//        System.out.println(s);
    }
}
/*Execution of Code
* */
