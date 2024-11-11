package MultiThreading;

class Test3 extends Thread{
    public void start(){
        super.start();
        System.out.println("Start Method");
    }
    public void run(){
        System.out.println("Run Method");
    }
}
public class ORStartM1 {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        System.out.println("Main1");
        Test3 t = new Test3();
        System.out.println(t.getName());
        //System.out.println("Main2");
        t.start();
        System.out.println("Main3");
    }
}