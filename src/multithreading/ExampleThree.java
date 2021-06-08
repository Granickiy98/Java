package multithreading;

public class ExampleThree {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new MyThread());
        Thread thread2 = new Thread(new MyThread2());
        thread1.start();
        thread2.start();

    }
}

class MyThread implements Runnable{
    public void run(){
        for(int i = 1; i<=1000; i++){
            System.out.println(i);
        }
    }
}

class MyThread2 implements Runnable{
    public void run(){
        for(int i = 1000; i>0; i--){
            System.out.println(i);
        }
    }
}
