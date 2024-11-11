package MultiThreading;
/*To resolve the deadlock in your code, you need to ensure that threads acquire locks in the same order. Deadlocks typically
 occur when two or more threads try to acquire the same set of locks but in different orders. By ensuring a consistent lock
 acquisition order, you can avoid the situation where each thread is holding one lock and waiting for the other to release its lock.

Solution 1: Lock resources in the same order
In your case, both T1 and T2 are trying to lock R1 and R2 but in different orders. To avoid deadlock, you can change the code so that
 both threads lock the resources in the same order. For example, always lock R1 first and then lock R2.*/


public class DeadLock {
    final static String R1 = "Hello Welcome to Scaler!";
    final static String R2 = "Visit Scaler!";

    public static void main(String[] args) {
        // creating thread T1
        Thread T1 = new Thread() {
            // implementing run method
            public void run() {

                // thread T1 locking the R1 resource
                synchronized (R1) {
                    System.out.println("Thread T1 locked ->   Resource R1");
                    /*try {
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {}*/

                    // thread T1 locking the R2 resource
                    synchronized (R2) {
                        System.out.println("Thread T1 locked -> Resource R2");
                    }
                }
            }
        };

        // creating thread T2
        Thread T2 = new Thread() {
            // implementing run method
            public void run() {

                // thread T2 locking the R2 resource
                synchronized (R2) {
                    System.out.println("Thread T2 locked -> Resource R2");
                    /*try{
                        Thread.sleep(3000);
                    }
                    catch (InterruptedException e){

                    }*/

                    // thread T2 locking the R1 resource
                    synchronized (R1) {
                        System.out.println("Thread T2 locked -> Resource R1");
                    }
                }
            }
        };

        // starting both the threads
        T2.start();
        T1.start();
        //T2.start();
    }


}
