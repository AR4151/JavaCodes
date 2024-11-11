package MultiThreading.Sync;


class Display1{
    public synchronized void Show(String Name) throws InterruptedException{
        for(int i=0;i<10;i++){
            System.out.print("Good Morning: ");
            Thread.sleep(2000);
            System.out.println(Name);
            /*try{
                Thread.sleep(2000);
            }
            catch(InterruptedException ie){
                System.out.println(Name);
            }*/
        }
    }
}
class MyThread2 extends Thread{
    Display1 d;
    String Name;
    MyThread2(Display1 d, String Name){
        this.d = d;
        this.Name = Name;
    }
    public void run(){
        try{
            d.Show(Name);
        }
        catch(InterruptedException e){
            //System.out.println(Name);
        }
    }
}
public class SyncMethod2 {
    public static void main(String[] args) {
        Display1 d1 = new Display1();
        Display1 d2 = new Display1();
        MyThread2 t1 = new MyThread2(d1,"Dhoni");
        MyThread2 t2 = new MyThread2(d2,"Sachin");
        t1.start();
        t2.start();
    }
}
