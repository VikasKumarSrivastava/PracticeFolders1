package MultithreadingInJava.ThreadPoolExecutor;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) {
        ThreadPoolExecutor poolExecutor = new ThreadPoolExecutor(2, 4, 1, TimeUnit.HOURS, new ArrayBlockingQueue<>(10), new CustomThreadFactor(),
        new CustomRejectedHandler());

        for(int i=0;i<25;i++){
            poolExecutor.submit(()->{
                try{
                    Thread.sleep(5000);
                    System.out.println("thread name: "+Thread.currentThread().getName());
                }catch(Exception e){
                    e.printStackTrace();
                }

            });
        }
        poolExecutor.shutdown();
        poolExecutor.close();
    }
}
class CustomRejectedHandler implements RejectedExecutionHandler{

    @Override
    public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {
        System.out.println("Task denied :"+r.toString());
    }
    
}

class CustomThreadFactor implements ThreadFactory{
    @Override
    public Thread newThread(Runnable r){
        Thread th = new Thread(r);
        return th;
    }
}
