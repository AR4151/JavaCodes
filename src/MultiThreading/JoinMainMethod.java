package MultiThreading;


class ChildThread extends Thread{
    static Thread ref;
    @Override
    public void run(){
        try {
            ref.join();
        }
        catch (InterruptedException ie){
        }
        for (int i=1;i<10;i++){
            System.out.println("Child Thread");
        }
    }
}

public class JoinMainMethod {
    public static void main(String[] args) throws InterruptedException{
        ChildThread.ref = Thread.currentThread();

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
