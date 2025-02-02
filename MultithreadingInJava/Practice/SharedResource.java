package MultithreadingInJava.Practice;

public class SharedResource {

    boolean isItemAvailable = false;
    public synchronized void addItem(){
        isItemAvailable = true;
        System.out.println("Item added by thread: "+Thread.currentThread().getName()+" and invoking notifyAll()");
        notifyAll();  
    }
    public synchronized void consumeItem(){
        System.out.println("Consume item method called: "+Thread.currentThread().getName());
        while(!isItemAvailable){
            try {
                System.out.println("Thread "+Thread.currentThread().getName()+" is waiting for item to be produced");
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Item consumed by thread: "+Thread.currentThread().getName());
        isItemAvailable = false;
    }

}
