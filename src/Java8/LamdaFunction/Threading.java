package Java8.LamdaFunction;

public class Threading {
    public void main(String[] args) throws InterruptedException {
        Runnable r = ()-> {
            for (int i = 0; i <6 ; i++) {
                System.out.println("Child Thread");
            }
            Thread.currentThread().notify();
        };
        Thread  t = new Thread(r);
        t.start();
        t.wait();
        for (int i = 0; i < 6; i++) {
            System.out.println("Main Thread");

        }

    }
}
