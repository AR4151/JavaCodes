package MultiThreading;

class display{

    public void wish(String msg) {
        synchronized (this) {
            for (int i = 0; i < 10; i++) {
                System.out.println("Good Morning " + msg);
                try {
                    Thread.sleep(1000);

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("Java");
        }
    }
}
class MyThd extends Thread{
    display d;
    String msg;

    MyThd(display d,String msg){
        this.d=d;
        this.msg=msg;
    }

    public void run(){
        d.wish(msg);
    }
}
class HelloWorld {
    public static void main(String[] args) {
        display d1=new display();
        display d2=new display();
        MyThd t1=new MyThd(d1,"Dhoni");
        MyThd t2=new MyThd(d1,"Yuvraj");
        t1.start();
        t2.start();

    }
}
