package MultithreadingInJava.ThreadPoolExecutor.ScheduledThreadPoolExecutor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) {
        /*  --Scenario 1 : Task submission after Shutdown
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        executorService.submit(()->{
            System.out.println("Thread going to start its work");
        });
        executorService.shutdown();
        executorService.submit(()->{
            System.out.println("Thread going to start its work 2");
        });
        */
        // Scenario 2: Shutdown do not impact the already submitted task
        /*
        ExecutorService executorService1 = Executors.newFixedThreadPool(5);
        executorService1.submit(()->{
            try{
                Thread.sleep(5000);
            }catch(Exception e){}
            System.out.println("New task");
        });

        executorService1.shutdown();
        System.out.println("Main thread unblocked and finished processing");
        */

        //Scenario 3: usage of 'awaitTermination'
        /* 
        ExecutorService executorService3 = Executors.newFixedThreadPool(5);
        executorService3.submit(()->{
            try{
                Thread.sleep(5000);
            }catch(Exception e){}
            System.out.println("New task");
        });
        executorService3.shutdown();
        try{
            boolean isExecutorTerminated = executorService3.awaitTermination(3, TimeUnit.SECONDS);
            System.out.println("Main thread, isExecutorTerminated "+ isExecutorTerminated);
        }catch(Exception e){}

        System.out.println("Main thread is completed");
        */
        //Scenario 4: shutdownNow()
        ExecutorService executorService4 = Executors.newFixedThreadPool(5);
        executorService4.submit(()->{
            try{
                Thread.sleep(15000);
            }catch(Exception e){}
            System.out.println("New task");
        });
        executorService4.shutdownNow();
        try{
            boolean isExecutorTerminated = executorService4.awaitTermination(3, TimeUnit.SECONDS);
            System.out.println("Main thread, isExecutorTerminated "+ isExecutorTerminated);
        }catch(Exception e){}

        System.out.println("Main thread is completed");
    }
}
