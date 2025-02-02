package MultithreadingInJava.Practice;

public class MonitorLockExample {
    public synchronized void task1(){

        try{
            System.out.println("Task 1 started");
            Thread.sleep(5000);
        }
        catch(Exception e){
            System.out.println("Task 1 interrupted");
        }
        System.out.println("Task 1 completed");
    }
    public void task2(){
        System.out.println("task2 ,before synchronized block");
        synchronized(this){
            System.out.println("task2,inside synchronized block");
        }
    }
    public void task3(){
        System.out.println("task3 started");
    }

}
