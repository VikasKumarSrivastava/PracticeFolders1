package MultithreadingInJava.Practice;

class MyThread extends Thread{
    @Override
    public void run(){
        for(int i =0;i<5;i++){
            System.out.println("child thread");
        }
    }
}

public class Test {
    public static void main(String[] args) {
        MyThread th1 = new MyThread();
        th1.start();
        System.out.println("==============");
        // th1.run();
        for( int i = 0 ; i < 5 ; i++ ){
            System.out.println("Main thread");
        }
    }

}
