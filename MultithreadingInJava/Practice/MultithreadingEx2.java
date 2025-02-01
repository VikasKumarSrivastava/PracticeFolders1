package MultithreadingInJava.Practice;

public class MultithreadingEx2 extends Thread {
    public void run(){
        System.out.println("Thread name is :"+Thread.currentThread().getName());
    }

}
