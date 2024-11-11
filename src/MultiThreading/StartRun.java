package MultiThreading;

public class StartRun extends Thread{
    public void run(){
        for(int i=0;i<6;i++){
            System.out.println("Child Thread1");
        }
    }
}
class ThreadS {
    public static void main(String[] args) {
        StartRun t = new StartRun();
        t.run();
        System.out.println();
        for(int i=0;i<6;i++){
            System.out.println("Parent Thread1");
        }
    }
}
/*Here No new thread is there only one main thread is there.because we are directly calling run() method
 not the start() method and run method is executed as normal method*/