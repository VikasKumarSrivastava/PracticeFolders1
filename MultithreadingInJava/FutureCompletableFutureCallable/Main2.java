package MultithreadingInJava.FutureCompletableFutureCallable;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class Main2 {

    public static void main(String[] args) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 1, 
        TimeUnit.HOURS, new ArrayBlockingQueue<>(10), Executors.defaultThreadFactory(), new ThreadPoolExecutor.AbortPolicy());

        Future<?> futureObj =threadPoolExecutor.submit(()->{
            try{
                Thread.sleep(7000);
                System.out.println("this is the task which thread will execute");
            }catch(Exception e){

            }
        });
        System.out.println("is Done: "+futureObj.isDone());
        try{
            futureObj.get(2, TimeUnit.SECONDS);
        }catch(TimeoutException e){
            System.out.println("TimeOut Exception");
        }catch(Exception e){}

        try{
            futureObj.get();
        }catch(Exception e){}

        System.out.println("is Done final : "+futureObj.isDone());
        System.out.println("is cancelled: "+futureObj.isCancelled());
        threadPoolExecutor.close();
    }
}
