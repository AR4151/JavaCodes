package MultiThreading;

class MyThread extends Thread{


    public void run(){
        for(int i=0;i<10;i++){
            System.out.println("Child Thread");
        }
    }
}
public class ThreadDemo {
    public static void main(String[] args) {
        MyThread5 t = new MyThread5();
        t.start();
        //System.out.println();
        for(int i=0;i<10;i++){
            System.out.println("Parent Thread");
        }
        //t.start();
    }
}
