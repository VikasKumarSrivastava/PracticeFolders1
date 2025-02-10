package MultithreadingInJava.FutureCompletableFutureCallable;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 1, TimeUnit.HOURS
        , new ArrayBlockingQueue<>(10),Executors.defaultThreadFactory() , new ThreadPoolExecutor.AbortPolicy());
        
        Future<?> futureObj =threadPoolExecutor.submit(()->{
            try{
                Thread.sleep(5000);
                System.out.println("This is the task which thread will execute");
            }catch(Exception e){}

        });
        try{
            Thread.sleep(6000);
            //Thread.sleep(2000);
        System.out.println(" here "+futureObj.cancel(true));
        System.out.println(futureObj.isDone());
        }catch(Exception e){}
    }
}
