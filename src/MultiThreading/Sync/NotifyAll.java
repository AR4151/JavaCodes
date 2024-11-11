package MultiThreading.Sync;

class MyThread extends Thread {
    @Override
    public void run() {
        synchronized (this) {
            try {
                System.out.println(Thread.currentThread().getName() + " waiting...");
                this.wait();  // Thread waits
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " is running again!");
        }
    }
}

public class NotifyAll {
    public static void main(String[] args) throws InterruptedException {
        MyThread thread1 = new MyThread();
        MyThread thread2 = new MyThread();
        MyThread thread3 = new MyThread();

        thread1.start();
        thread2.start();
        thread3.start();

        Thread.sleep(1000);  // Let the threads start and wait

        synchronized (thread1) {
            thread1.notifyAll();  // Wakes up all waiting threads
        }
    }
}

