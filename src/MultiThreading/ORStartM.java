package MultiThreading;

/*It's not recommended to go for MultiThreading if you wants to override start() method*/
class Test2 extends Thread{
    @Override
    public void start(){
        System.out.println("Start Method");
    }
    @Override
    public void run(){
        System.out.println("Run Method");
    }
}
public class ORStartM {
    public static void main(String[] args) {
        System.out.println("Main1");
        Test2 t = new Test2();
        System.out.println("Main2");
        t.start();
        System.out.println("Main3");
    }
}
