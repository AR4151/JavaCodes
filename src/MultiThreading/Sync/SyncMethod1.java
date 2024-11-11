package MultiThreading.Sync;


class Display2{
    public static synchronized void Show(String Name) throws InterruptedException{
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
class MyThread3 extends Thread{
    Display2 d;
    String Name;
    MyThread3(Display2 d, String Name){
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
public class SyncMethod1 {
    public static void main(String[] args) {
        Display2 d1 = new Display2();
        Display2 d2 = new Display2();
        MyThread3 t1 = new MyThread3(d1,"Dhoni");
        MyThread3 t2 = new MyThread3(d2,"Sachin");
        t1.start();
        t2.start();
    }
}
