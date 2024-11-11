package MultiThreading;

class Demo implements Runnable{
    @Override
    public void run(){
        for(int i=1;i<=10;i++){
            System.out.println("Child Thread");
        }
        System.out.println("I wants to Sleep");
        try{
            System.out.println("I'm Sleep Method");
            Thread.sleep(5000);
        }
        catch(InterruptedException ie){
            System.out.println("I got Interrupted");
        }
        System.out.println("Below Catch");
    }
}
public class InterruptMethod {
    public static void main(String[] args) {
        Demo t1 = new Demo();
        Thread t = new Thread(t1);
        t.start();
        t.interrupt();
        System.out.println("End of the Main Thread");

        for(int i=1;i<=10;i++){
            System.out.println("Main Thread");
        }

    }
}
