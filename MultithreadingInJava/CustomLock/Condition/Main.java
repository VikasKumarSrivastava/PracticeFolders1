package MultithreadingInJava.CustomLock.Condition;

public class Main {
    public static void main(String[] args) {
        SharedResource sharedResource = new SharedResource();
        Thread th1 = new Thread(()->{
            for(int i =0;i<2;i++){
                sharedResource.producer();
            }
        });

        Thread th2 = new Thread(()->{
            for(int i=0;i<2;i++){
                sharedResource.consume();
            }
        });
        th1.start();
        th2.start();
    }

}
