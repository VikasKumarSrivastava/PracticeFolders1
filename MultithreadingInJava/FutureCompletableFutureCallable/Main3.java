package MultithreadingInJava.FutureCompletableFutureCallable;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Main3 {

    public static void main(String[] args) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 1, 
        TimeUnit.HOURS, new ArrayBlockingQueue<>(10),Executors.defaultThreadFactory(), new ThreadPoolExecutor.AbortPolicy());

        //UseCase1 
        Future<?> futureObject1 = threadPoolExecutor.submit(()->{
            System.out.println("Task1 with Runnable.");
        });

        try{
            Object object = futureObject1.get();
            System.out.println(object==null);
        }catch(Exception e){}

        //UseCase2
        List<Integer> output = new ArrayList<>();
        Future<List<Integer>> futureObject2= threadPoolExecutor.submit(()->{
            output.add(100);
            output.add(50);
            System.out.println("Task2 with runnable and return object");
        }, output);
        try{
            List<Integer> outputFromFutureObject2 = futureObject2.get();
            System.out.println(outputFromFutureObject2);
        }catch(Exception e){
            System.out.println("exception");
        }

        //UseCase3
        Future<List<Integer>> futureObject3 = threadPoolExecutor.submit(()->{
            System.out.println("Task3 with Callable.");
            List<Integer> listObj = new ArrayList<>();
            listObj.add(200);
            return listObj;
        });
        try{
            List<Integer> outputFromFutureObject3 = futureObject3.get();
            System.out.println(outputFromFutureObject3.get(0));
        }catch(Exception e){}
        // threadPoolExecutor.submit(()->"Hello");
        // threadPoolExecutor.submit(()->System.out.println("Yo"));
        threadPoolExecutor.close();
    }
}
