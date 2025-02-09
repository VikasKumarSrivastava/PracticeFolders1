package MultithreadingInJava.LockFreeMechanism;

public class Main {
    public static void main(String[] args) {
        SharedResource sharedResource = new SharedResource();
        SynchronizedResource synchronizedResource = new SynchronizedResource();
        AtomicIntegerResource atomicIntegerResource = new AtomicIntegerResource();
        Thread th1 = new Thread(()->{
            for(int i =0;i<200;i++){
                sharedResource.increment();
                synchronizedResource.increment();
                atomicIntegerResource.increment();
            }
        });
        Thread th2 = new Thread(()->{
            for(int i =0;i<200;i++){
                sharedResource.increment();
                synchronizedResource.increment();
                atomicIntegerResource.increment();
            }
        });

        th1.start();
        th2.start();
        try{
            th1.join();
            th2.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Inconsistent  value :"+sharedResource.get());
        System.out.println("Consistent using synchronized: "+synchronizedResource.get());
        System.out.println("Consistent using AtomicInteger: "+atomicIntegerResource.get());

    }
}
