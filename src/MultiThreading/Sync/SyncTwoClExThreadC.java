package MultiThreading.Sync;


class Mains{
   static public synchronized void main3(){
        for(int i=0;i<10;i++) {
            System.out.println("Java");
        }

    }
    public synchronized void main1(){
        for(int i=0;i<10;i++){
            System.out.print(i);
            try{
                Thread.sleep(1500);
            }
            catch(InterruptedException e){

            }
        }
    }
    public synchronized void main2(){
        for(int i=65;i<75;i++){
            System.out.print((char)i);
            try{
                Thread.sleep(1500);
            }
            catch(InterruptedException e){

            }
        }
    }

}
class MyTh1 extends Thread{
    Mains m;
    MyTh1(Mains m){
        this.m=m;
    }
    @Override
    public void run(){
        //m.main3();
        m.main1();
    }
}
class MyTh2 extends Thread{
    Mains m;
    MyTh2(Mains m){
        this.m=m;
    }
    @Override
    public void run(){
        m.main2();
    }
}
public class SyncTwoClExThreadC {
    public static void main(String[] args) {

        Mains m = new Mains();
        MyTh1 t1 = new MyTh1(m);
        MyTh2 t2 = new MyTh2(m);
        t1.start();
        Mains.main3();
        t2.start();
    }

}
