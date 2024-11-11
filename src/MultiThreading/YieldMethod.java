package MultiThreading;


class Method extends Thread{
    @Override
    public void run(){
        for(int i=1;i<=7;i++){
            System.out.println("Child Thread");
            //Thread.yield();
        }
    }
}
public class YieldMethod {
    public static void main(String[] args) {
        Method m = new Method();
        m.start();
        for(int i=1;i<=7;i++){
            System.out.println("Main Thread");
            Thread.yield();

        }
        System.out.println(m.getPriority());
    }

}
