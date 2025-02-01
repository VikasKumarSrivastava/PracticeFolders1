package MultithreadingInJava.Practice;

public class Main {
    public static void main(String[] args) {
        System.out.println("Thread name in Main :"+Thread.currentThread().getName());
        MultithreadingEx1 multithreadingEx1Obj = new MultithreadingEx1();
        Thread thread1 = new Thread(multithreadingEx1Obj);
        Thread thread2 = new Thread(()->System.out.println("Thread name from lambda:"
        +Thread.currentThread().getName()));
        thread1.start();
        thread2.start();
    }


}
