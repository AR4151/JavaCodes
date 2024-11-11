package MultiThreading;

class ChildThread2 extends Thread{
    //JoinMainMethod2 jj = new JoinMainMethod2();
    Thread ref;
    ChildThread2(Thread ref){
        this.ref=ref;

    }
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

public class JoinMainMethod2 {
    Thread ref;
    public static void main(String[] args) throws InterruptedException{
        JoinMainMethod2 jj = new JoinMainMethod2();
        //Thread ref;
        jj.ref = Thread.currentThread();

        ChildThread2 t = new ChildThread2(jj.ref);
        t.start();
        //t.join();

        for (int i=1;i<10;i++){
            System.out.println("Main Thread");
            Thread.sleep(1000);
        }
        //t.join();

    }
}


