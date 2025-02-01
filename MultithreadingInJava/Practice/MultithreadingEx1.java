package MultithreadingInJava.Practice;

public class MultithreadingEx1 implements Runnable{

    @Override
    public void run() {
        System.out.println("thread name is "+ Thread.currentThread().getName());
    }

}
