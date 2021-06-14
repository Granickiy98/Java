package multithreading;

import java.util.concurrent.*;

public class CallableFactorial {
    static int factorialResult;

    public static void main(String[] args) {
        ExecutorService service = Executors.newSingleThreadExecutor();
        Factorial2 factorial2 = new Factorial2(6);
        Future<Integer> future = service.submit(factorial2);
        try {
            System.out.println(future.isDone());
            System.out.println("Want to get the result");
            factorialResult = future.get();
            System.out.println("Got the result");
            System.out.println(future.isDone());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            System.out.println(e.getCause());
        }
        finally {
            service.shutdown();
        }
        System.out.println(factorialResult);
    }
}

class Factorial2 implements Callable<Integer>{
    int f ;
    public  Factorial2(int f){
        this.f = f;
    }
    @Override
    public Integer call() throws Exception {
        if(f<=0){
            throw new Exception("You entered an invalid number");
        }
        int result = 1;
        for(int i =1;i<=f;i++){
            result*=i;
            Thread.sleep(1000);
        }
        return result;
    }
}
