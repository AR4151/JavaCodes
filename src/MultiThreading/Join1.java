package MultiThreading;



class MyThreadd extends Thread{
    Join1 rr;
    MyThreadd (Join1  rr){
        this.rr = rr;
    }
    public void run(){
        try{
            rr.ref.join();
        }
        catch (InterruptedException e){

        }

        for(int i=0;i<10;i++){
            System.out.println("Child Thread");
        }
    }

}
class Join1{
    Thread ref;
    public static void main(String[] args){
        Join1 rr = new Join1();
        rr.ref = Thread.currentThread();
        MyThreadd tt = new MyThreadd(rr);
        tt.start();

        for(int i=0;i<10;i++){
            System.out.println("Main Thread");
        }


    }
}
