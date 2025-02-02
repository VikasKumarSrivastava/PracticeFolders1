package MultithreadingInJava.Practice;

public class MainSharedResource {
    public static void main(String[] args) {
        SharedResource sharedResource = new SharedResource();
        Thread producer = new Thread(()->{
            System.out.println("Producer thread started: "+Thread.currentThread().getName());
            sharedResource.addItem();
        });
        Thread consumer = new Thread(()->{
            System.out.println("Consumer thread started: "+Thread.currentThread().getName());
            sharedResource.consumeItem();
        });
        producer.start();
        consumer.start();
        System.out.println("Main thread completed");
    }

}
