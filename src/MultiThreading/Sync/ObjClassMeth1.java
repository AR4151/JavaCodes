package MultiThreading.Sync;

class ThreadA extends Thread{
    int total=0;
    @Override
    public void run(){
        for(int i=1;i<=100;i++){
            total = total+i;
        }

    }
}
public class ObjClassMeth1 {
    public static void main(String[] args) throws Exception {
        ThreadA t = new ThreadA();
        t.start();
        t.wait();
        try{
            Thread.sleep(100);
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
        System.out.println(t.total);
    }
}
