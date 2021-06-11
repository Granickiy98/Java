package multithreading;

public class InterruptionExample {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Main starts");
        InterruptedThread thread = new InterruptedThread();
        thread.start();
        Thread.sleep(2000);
        thread.interrupt();
        thread.join();
        System.out.println("Main ends");
    }
}


class InterruptedThread extends Thread{
    double sqrtSum =0;
    public void run(){
        for(int i =1; i<=1000000000;i++){
            if(isInterrupted()){
                System.out.println("Thread want pause");
                System.out.println("Sum sqrt = "+sqrtSum);
                return;
            }
            sqrtSum+=Math.sqrt(i);
            try {
                sleep(100);
            } catch (InterruptedException e) {
                System.out.println("Thread want pause is sleep,go end this!");
                System.out.println("Sum sqrt = "+sqrtSum);
                return;
            }
        }
        System.out.println("Sum sqrt = "+sqrtSum);
    }
}