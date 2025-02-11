package MultithreadingInJava.ThreadPoolExecutor.ScheduledThreadPoolExecutor;

import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Main2 {

    public static void main(String[] args) {
        ScheduledExecutorService executorService = Executors.newScheduledThreadPool(5);
        /* 
        executorService.schedule(()->{
            System.out.println("hello");
        },5, TimeUnit.SECONDS);
        */
        /* 
        Future<String> futureObj=executorService.schedule(()->{
            return"world";
        },7, TimeUnit.SECONDS);
        try{
            System.out.println(futureObj.get());
        }catch(Exception e){}
        */
        /* 
        Future<?> futureobj2 = executorService.scheduleAtFixedRate(()->{
            System.out.println("This is java");
        }, 3 , 5, TimeUnit.SECONDS);

        try{
            Thread.sleep(10000);
            futureobj2.cancel(true);
        }catch(Exception e){}
        */
        /*
        Future<?> futureObj3 = executorService.scheduleAtFixedRate(()->{
            System.out.println("task is picked");
            try{
                Thread.sleep(6000);

            }catch(Exception e){}
            System.out.println("Task completed");
        }, 1, 3, TimeUnit.SECONDS);
        */
        Future<?> futureObj4 = executorService.scheduleWithFixedDelay(()->{
            System.out.println("task is picked");
            try{
                Thread.sleep(6000);

            }catch(Exception e){}
            System.out.println("Task completed");
        }, 1, 3, TimeUnit.SECONDS);



        //executorService.close();
    }
}
