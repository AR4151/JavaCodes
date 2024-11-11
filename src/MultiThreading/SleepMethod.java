package MultiThreading;


public class SleepMethod {
    public static void main(String[] args) throws InterruptedException {
        for(int i=1;i<=10;i++){
            System.out.println("Main Thread");
            Thread.sleep(2000);
        }
    }
}
