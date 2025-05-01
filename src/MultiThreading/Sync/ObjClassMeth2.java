package MultiThreading.Sync;

class Thread1 extends Thread{
    int total=0;
    @Override
    public void run() {
        synchronized (this){
            for(int i=1;i<=100;i++){
                total = total + i;
                
            }
            this.notify();
            System.out.println("Notified the Thread");
        }
    }
}
public class ObjClassMeth2 {
    public static void main(String[] args) throws InterruptedException {
        Thread1 t = new Thread1();
        t.start();
       //Thread.sleep(5000);
        synchronized (t){
            System.out.println("Entered into Waiting Thread");
            t.wait();
            System.out.println("waiting thread");
            System.out.println(t.total);
            System.out.println("Notified!");
        }

    }

}
