package MultiThreading;

/*This is best example for the 11th Rule of Overriding in Polymorphism*/

class MyThread5 extends Thread{
    static Thread ref;
    public void run() /*throws InterruptedException*/{
        try{
        ref.join();
        }
        catch (InterruptedException e){

        }

        for(int i=0;i<10;i++){
            System.out.println("Child Thread");
        }
    }

}
class Join{

    public static void main(String[] args){
        MyThread5.ref = Thread.currentThread();

        MyThread5 t = new MyThread5();
        t.start();
        /*try {
            t.join();
        }
        catch (Exception e){

        }*/

        for(int i=0;i<10;i++){
            System.out.println("Main Thread");
        }


    }
}
