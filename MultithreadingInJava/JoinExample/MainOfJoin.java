package MultithreadingInJava.JoinExample;

public class MainOfJoin {

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName() + " Has started");
        SharedResource sharedResource = new SharedResource();
        Thread t1 = new Thread(()->{
            System.out.println("Thread 1 started");
            sharedResource.produce();
        });
        t1.start();
        
        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        System.out.println(Thread.currentThread().getName() + " Has ended");
    }
}
