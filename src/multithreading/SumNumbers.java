package multithreading;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class SumNumbers {
    private static long value = 1_000_000_000L;
    private static long sum = 0;

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService service = Executors.newFixedThreadPool(10);
        List<Future<Long>> futureList = new ArrayList<>();

        long valueDividedBy10 = value/10;
        for(int i = 0;i<10;i++){
            long from = valueDividedBy10*i+1;
            long to = valueDividedBy10*(i+1);

            PartilSum task = new PartilSum(from,to);
            Future<Long> futurePartSum =  service.submit(task);

            futureList.add(futurePartSum);
        }

        for(Future<Long>result:futureList){
            sum+=result.get();
        }
        service.shutdown();
        System.out.println("Total sum = " + sum);
    }
}

class PartilSum implements Callable<Long>{
    long from;
    long to;
    long localSum;

    public PartilSum(long from,long to){
        this.from = from;
        this.to = to;
    }

    @Override
    public Long call()  {
      for (long i = from;i <= to;i++){
          localSum+=i;
      }
        System.out.println("Sum from " + from + " to " + to + " = " + localSum);
      return  localSum;
    }
}
