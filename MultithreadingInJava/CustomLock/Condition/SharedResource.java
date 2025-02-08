package MultithreadingInJava.CustomLock.Condition;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class SharedResource {
    boolean isAvailable = false;
    ReentrantLock lock = new ReentrantLock();
    Condition condition = lock.newCondition();

    public void producer(){
        try{
            lock.lock();
            System.out.println("Produce lock acquired by :"+Thread.currentThread().getName());
            if(isAvailable){
                System.out.println("Producer waiting for consumer to consume: "+Thread.currentThread().getName());
                condition.await();
            }
            isAvailable=true;
            condition.signalAll();
        }catch (InterruptedException e){
            e.printStackTrace();
        }finally {
            lock.unlock();
            System.out.println("Produce lock released by :"+Thread.currentThread().getName());
        }
    }

    public void consume(){
        try{
            Thread.sleep(1000);
            lock.lock();
            System.out.println("Consume lock acquired by :"+Thread.currentThread().getName());
            if(!isAvailable){
                System.out.println("Consume waiting for producer to produce: "+Thread.currentThread().getName());
                condition.await();
            }
            isAvailable=false;
            condition.signalAll();
        }catch(InterruptedException e){
            e.printStackTrace();
        }finally{
            lock.unlock();
            System.out.println("Consumer lock released by :"+Thread.currentThread().getName());
        }
    }

}
