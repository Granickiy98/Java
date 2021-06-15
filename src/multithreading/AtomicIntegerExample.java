package multithreading;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicIntegerExample {
//    static  int counter =0;
    static AtomicInteger counter = new AtomicInteger(0);

    public  static void increment(){
//        counter++;
//        counter.incrementAndGet();
        counter.addAndGet(5);
    }


    public static void main(String[] args) throws InterruptedException {
        Thread threadOne = new Thread(new MyRunnableImpl18());
        Thread threadTwo = new Thread(new MyRunnableImpl18());
        threadOne.start();
        threadTwo.start();
        threadOne.join();

        threadTwo.join();

        System.out.println(counter);
    }
}

class MyRunnableImpl18 implements Runnable{

    @Override
    public void run() {
        for(int i =0;i<100;i++){
            AtomicIntegerExample.increment();
        }
    }
}
