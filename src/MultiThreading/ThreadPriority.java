package MultiThreading;


class TestT extends Thread{
    @Override
    public void run(){
        for(int i=1;i<+10;i++){
            System.out.println("Child Thread");
        }
    }


}
public class ThreadPriority {
    public static void main(String[] args) {
        TestT t = new TestT();
        System.out.println("Main Thread Priority "+Thread.currentThread().getPriority());
        System.out.println("Child Thread Priority "+t.getPriority());
        //t.start();
        //t.run();
        t.setPriority(9);
        t.start();

        for(int i=1;i<+10;i++){
            System.out.println("Main Thread");
        }

        System.out.println("Main Thread Priority "+Thread.currentThread().getPriority());
        System.out.println("Child Thread Priority "+t.getPriority());

    }
}
