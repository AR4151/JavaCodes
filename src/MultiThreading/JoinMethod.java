package MultiThreading;


class Main extends Thread{
    @Override
    public synchronized void run(){
        for(int i=1;i<=10;i++){
            System.out.println("Child Thread");
        }
    }
}
public class JoinMethod {
    public static void main(String[] args) throws InterruptedException {
        Main t = new Main();
        t.start();
        //Thread.yield();
        t.join();
        //t.start();

        for(int i=1;i<=10;i++){
            System.out.println("Main Thread");
            Thread.sleep(1000);
        }
    }
}
