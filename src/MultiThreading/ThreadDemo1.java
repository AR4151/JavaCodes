package MultiThreading;

class ThreadDemo1 implements Runnable{

    @Override
    public synchronized void run() {
        for(int i=1;i<=10;i++){
            System.out.println(" "+Thread.currentThread().getName());
        }
    }
}
class ThreadTesting{
    public static void main(String[] args) throws InterruptedException {
        System.out.println(Thread.currentThread().getName());
        ThreadDemo1 obj=new ThreadDemo1();
        Thread t1=new Thread(obj);
        System.out.println("t1- "+t1.getName());
        t1.setPriority(1);   // here i am setting thread 0 as low priority so it will always execute after thread 1
        t1.start();
        Thread t2=new Thread(obj);
        System.out.println("t2- "+t2.getName());
        t2.setPriority(4);        // This is execute always before to thread 0
        t2.start();
    }
}