package MultithreadingInJava.JoinExample;

public class SharedResource {

    public synchronized void produce(){
        System.out.println("Lock acquired");
        try{
            Thread.sleep(8000);
        }catch(Exception e){
            e.printStackTrace();
        }
        System.out.println("Lock released");
    }

}
