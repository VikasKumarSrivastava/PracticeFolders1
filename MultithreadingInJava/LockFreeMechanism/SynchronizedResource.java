package MultithreadingInJava.LockFreeMechanism;

public class SynchronizedResource {
    int counter;

    public synchronized void increment(){
        counter++;
    }
    public int get(){
        return counter;
    }
}
