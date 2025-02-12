package MultithreadingInJava.ThreadLocal;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main1 {

    public static void main(String[] args) {
        ThreadLocal<String> threadLocal = new ThreadLocal<String>();
        ExecutorService executorService= Executors.newFixedThreadPool(5);

        executorService.submit(()->{
            threadLocal.set(Thread.currentThread().getName());
            threadLocal.remove();
        });
        for( int  i = 1; i<15;i++){
            executorService.submit(()->{
                System.out.println(threadLocal.get());
            });
        }
        executorService.close();
    }
}
