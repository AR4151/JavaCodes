package MultiThreading;


class ChildThread1 extends Thread{
    String t;
    int a;
    JoinMainMethod1 jj = new JoinMainMethod1();

    @Override
    public void run(){
        try {
            jj.ref.join();
        }
        catch (InterruptedException ie){
        }
        for (int i=1;i<10;i++){
            System.out.println("Child Thread");
        }
    }
}

public class JoinMainMethod1 {
    Thread ref;
    public static void main(String[] args) throws InterruptedException{
        JoinMainMethod1 jj = new JoinMainMethod1();
        //Thread ref;
        jj.ref = Thread.currentThread();

        ChildThread t = new ChildThread();
        t.start();
        //t.join();

        for (int i=1;i<10;i++){
            System.out.println("Main Thread");
            Thread.sleep(1000);
        }
        //t.join();

    }
}

