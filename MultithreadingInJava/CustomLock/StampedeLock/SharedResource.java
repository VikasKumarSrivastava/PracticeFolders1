package MultithreadingInJava.CustomLock.StampedeLock;

import java.util.concurrent.locks.StampedLock;

public class SharedResource {

    int a = 10;
    StampedLock lock = new StampedLock();

    public void producer(){
        long stamp =lock.tryOptimisticRead();
        try{
            System.out.println("Taken optimistic lock");
            a=11;
            Thread.sleep(6000);
            if(lock.validate(stamp)){
                System.out.println("Optimistic lock valid");
            }else{
                System.out.println("Optimistic lock not valid");
                a=10;
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public void consumer(){
        long stamp = lock.writeLock();
        System.out.println("write lock acquired: "+Thread.currentThread().getName());
        try{
            System.out.println("performing work");
            a=9;
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            lock.unlockWrite(stamp);
            System.out.println("write lock released: "+Thread.currentThread().getName());
        }
    }
}
