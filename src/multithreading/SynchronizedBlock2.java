package multithreading;

public class SynchronizedBlock2 {

    volatile  static int counter = 0;
    public static  void increment(){
        synchronized (SynchronizedBlock2.class){
            counter++;
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(new MyRunnable2());
        Thread thread2 = new Thread(new MyRunnable2());

        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();

        System.out.println(counter);
    }
}

class MyRunnable2 implements Runnable{

    @Override
    public void run() {
        for (int i = 0 ; i<1000; i++){
            SynchronizedBlock2.increment();
        }
    }
}
