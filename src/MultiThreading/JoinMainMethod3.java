package MultiThreading;

class ChildThread3 extends Thread{
    JoinMainMethod3 jj;


    //Thread ref;
    ChildThread3(JoinMainMethod3 jj){
        //this(s);
        this.jj=jj;
        System.out.println(jj.s);

    }


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

public class JoinMainMethod3 {
    Thread ref;
    String s = "Java";
    public static void main(String[] args) throws InterruptedException{
        JoinMainMethod3 jj = new JoinMainMethod3();
        //Thread ref;
        jj.ref = Thread.currentThread();
        //System.out.println(jj.s);

        ChildThread3 t = new ChildThread3(jj);
        t.start();
        //t.join();

        for (int i=1;i<10;i++){
            System.out.println("Main Thread");
            Thread.sleep(1000);
        }
        //t.join();

    }
}


