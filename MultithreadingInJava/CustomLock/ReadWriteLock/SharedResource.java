package MultithreadingInJava.CustomLock.ReadWriteLock;

import java.util.concurrent.locks.ReadWriteLock;

public class SharedResource {

    boolean isAvailable = false;
    public void producer(ReadWriteLock lock){
        try{
            lock.readLock().lock();
            System.out.println("Read lock acquired by "+Thread.currentThread().getName());
            isAvailable = true;
            Thread.sleep(8000);
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            lock.readLock().unlock();
            System.out.println("Read lock relased by "+Thread.currentThread().getName());
        }
    }
    public void consumer(ReadWriteLock lock){
        try{
            lock.writeLock().lock();
            System.out.println("Write lock acquired by "+Thread.currentThread().getName());
            isAvailable = true;
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            lock.writeLock().unlock();
            System.out.println("Write lock relased by "+Thread.currentThread().getName());
        }
    }
}
