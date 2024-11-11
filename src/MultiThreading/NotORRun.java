package MultiThreading;

class Test1 extends Thread{


}
public class NotORRun {
    public static void main(String[] args) {
        Test1 t = new Test1();
        t.start();
    }
}
/*Here it is Highly recommended to Override run() method otherwise don't go for MultiThreading*/