package MultithreadingInJava.ProducerConsumerProblem;

public class ProducerConsumerLearning {
    public static void main(String[] args) {
        SharedResource sharedResource= new SharedResource(3);
        Thread producer = new Thread(()->{
            try{
                for(int i = 0; i<6;i++){
                    sharedResource.produce(i);
                }
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        });

        Thread consumer = new Thread(()->{
            try{
                for(int i = 0; i<6;i++){
                    sharedResource.consume();
                }

            }catch(Exception e){
                e.printStackTrace();
            }
        });
        producer.start();
        consumer.start();
    }
}
