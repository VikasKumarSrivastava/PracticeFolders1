package MultithreadingInJava.LockFreeMechanism;

import java.util.concurrent.atomic.*;

public class AtomicIntegerResource {


    AtomicInteger counter = new AtomicInteger(0);
    public void increment(){
        counter.incrementAndGet();
    }
    public int get(){
        return counter.get();
    };
}
