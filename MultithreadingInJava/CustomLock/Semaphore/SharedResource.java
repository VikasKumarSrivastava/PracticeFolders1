package MultithreadingInJava.CustomLock.Semaphore;

import java.util.concurrent.Semaphore;

public class SharedResource {

    boolean isAvaialble=false;
    Semaphore lock = new Semaphore(2);
    public void producer(){

        try{
            lock.acquire();
            System.out.println("Lock acquired by :"+Thread.currentThread().getName());
            isAvaialble=true;
            Thread.sleep(4000);
        }
        catch(Exception e){
            e.printStackTrace();
        }finally{
            lock.release();
            System.out.println("Lock released by :"+ Thread.currentThread().getName());
        }
    }

}
