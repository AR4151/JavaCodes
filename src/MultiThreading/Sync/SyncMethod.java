package MultiThreading.Sync;


class Display{
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
class MyThread1 extends Thread{
    Display d;
    String Name;
    MyThread1(Display d, String Name){
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
public class SyncMethod {
    public static void main(String[] args) {
        Display d = new Display();
        MyThread1 t1 = new MyThread1(d,"Dhoni");
        MyThread1 t2 = new MyThread1(d,"Sachin");
        t1.start();
        t2.start();
    }
}
