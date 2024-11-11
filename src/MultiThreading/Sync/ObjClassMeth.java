package MultiThreading.Sync;

class ThreadB extends Thread{
    int total = 0;
    public void run(){
        for(int i=1;i<=100;i++){
            total = total+i;
        }
    }
}

public class ObjClassMeth {
    public static void main(String[] args) throws InterruptedException {
        ThreadB b = new ThreadB();
        b.start();
        Thread.sleep(1);
        System.out.println(b.total);
    }
}
