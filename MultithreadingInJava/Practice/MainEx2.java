package MultithreadingInJava.Practice;

public class MainEx2 {


    public static void main(String[] args) {
        System.out.println("Main thread name is : "+Thread.currentThread().getName());
        MultithreadingEx2 t1 = new MultithreadingEx2();
        t1.start();
        System.out.println("Main thread finished");

           
    }

}
