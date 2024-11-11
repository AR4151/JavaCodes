package MultiThreading.Sync;

class SharedResource {
    // The method where threads will wait for notification
    public synchronized void waitingMethod() {
        try {
            System.out.println(Thread.currentThread().getName() + " is waiting...");
            wait();  // Thread will release the lock and wait
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + " has been notified and is resuming!");
    }

    // The method to notify all waiting threads
    public synchronized void notifyAllThreads() {
        System.out.println("Notifying all waiting threads...");
        notifyAll();  // Wake up all waiting threads
    }
}

class WaitingThread extends Thread {
    SharedResource resource;

    public WaitingThread(SharedResource resource) {
        this.resource = resource;
    }

    @Override
    public void run() {
        resource.waitingMethod();  // Each thread will wait on the resource object
    }
}

public class NotifyAllExample {
    public static void main(String[] args) throws InterruptedException {
        // Shared resource object on which all threads will wait
        SharedResource resource = new SharedResource();

        // Creating and starting multiple threads that will wait on the shared resource
        WaitingThread thread1 = new WaitingThread(resource);
        WaitingThread thread2 = new WaitingThread(resource);
        WaitingThread thread3 = new WaitingThread(resource);

        thread1.start();
        thread2.start();
        thread3.start();

        // Sleep to ensure all threads are in waiting state
        Thread.sleep(1000);

        // Notifying all threads that are waiting on the resource
        resource.notifyAllThreads();

        // Joining threads to ensure they complete before main thread finishes
        /*thread1.join();
        thread2.join();
        thread3.join();

        System.out.println("All threads have finished execution.");
    }
}*/

    }
}