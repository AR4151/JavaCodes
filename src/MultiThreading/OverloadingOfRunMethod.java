package MultiThreading;

class Test extends Thread{
    public void run(){
        System.out.println("no-args");
    }
    public void run(int a){
        System.out.println("Args");
    }
}
class OverloadingOfRunMethod {
    public static void main(String[] args) {
        Test t = new Test();
        t.start();
    }
}

/*Here by default start() method will always invoke no-arg run() method*/