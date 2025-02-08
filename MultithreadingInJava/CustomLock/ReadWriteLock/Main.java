package MultithreadingInJava.CustomLock.ReadWriteLock;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Main {

    public static void main(String[] args) {
        SharedResource sharedResource = new SharedResource();
        ReadWriteLock lock = new ReentrantReadWriteLock();
        Thread th1 =new Thread(()->{
            sharedResource.producer(lock);
        });

        Thread th2 =  new Thread(()->{
            sharedResource.producer(lock);
        });
        SharedResource sharedResource1 = new SharedResource();
        Thread th3 =  new Thread(()->{
            sharedResource1.consumer(lock);
        });
        th1.start();
        th2.start();
        th3.start();
    }
}
