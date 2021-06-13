package multithreading;

import java.util.concurrent.*;

public class ThreadPoolExample1 {
    public static void main(String[] args) throws InterruptedException {
//        ExecutorService executorService = Executors.newFixedThreadPool(5);
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        for(int i = 0;i<10;i++){
            executorService.execute(new RunnableImp100());
        }
        executorService.shutdown();
//        executorService.awaitTermination(5, TimeUnit.SECONDS);
//        System.out.println("Main ends");
    }
}


class RunnableImp100 implements Runnable{

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " begins work");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+" ends work");
    }
}