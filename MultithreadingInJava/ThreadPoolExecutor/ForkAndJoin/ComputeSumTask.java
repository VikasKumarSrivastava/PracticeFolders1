package MultithreadingInJava.ThreadPoolExecutor.ForkAndJoin;

import java.util.concurrent.Callable;
import java.util.concurrent.RecursiveTask;

public class ComputeSumTask extends RecursiveTask<Integer> {

    int start;
    int end;
    ComputeSumTask(int start , int end){
        this.start =start;
        this.end =end;
    }
    @Override
    protected Integer compute() {

        if(start-end <=4){
            int total = 0;
            for(int i=start;i<=end;i++){
                total+=i;
            }
            return total;
        }else{
            int mid  = (start+end)/2;
            ComputeSumTask leftTask = new ComputeSumTask(start, mid);
            ComputeSumTask rightTask = new ComputeSumTask(mid+1, end);

            leftTask.fork();
            rightTask.fork();

            int leftResult  = leftTask.join();
            int rightResult = rightTask.join();

            return leftResult+rightResult;
        }
        
    }
}
