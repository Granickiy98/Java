package multithreading;

public class Ex11 {
    static  int counter =0;
    public static synchronized void increment(){counter++;}

    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(new MyRunnable());
        Thread thread2 = new Thread(new MyRunnable());
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println(counter);
    }
}

class MyRunnable implements Runnable{

    @Override
    public void run() {
        for (int i = 0 ; i<1000; i++){
            Ex11.increment();
        }
    }
}
