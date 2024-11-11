package MultiThreading;


class Show implements Runnable{
    @Override
    public void run(){
        for(int i=0;i<6;i++){
            System.out.println("Child Show");
        }
        System.out.println(Thread.currentThread().getName());
    }
}
public class ThreadUsingRunnable {
    public static void main(String[] args) {
        Show s = new Show();
        Thread t = new Thread(s);
        t.start();
        Thread.currentThread().setName("Roshan");
        System.out.println(Thread.currentThread().getName());
    }

}
