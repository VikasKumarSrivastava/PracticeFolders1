package MultithreadingInJava.LockFreeMechanism;

public class SharedResource {

    int counter;

    public void increment(){
        counter++;
    }
    public int get(){
        return counter;
    }
}
