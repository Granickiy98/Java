package multithreading;

import java.util.concurrent.CountDownLatch;

public class CoutDownLatchExample {
    static CountDownLatch countDownLatch = new CountDownLatch(3);

    private static void marketStaffIsOnPlace() throws InterruptedException {
        Thread.sleep(2000);
        System.out.println("Market staff came to work");
        countDownLatch.countDown();
        System.out.println("CountDownLatch = " + countDownLatch.getCount());
    }

    private static void everythingIsReady() throws InterruptedException {
        Thread.sleep(3000);
        System.out.println("Everything is ready,so let`s open market");
        countDownLatch.countDown();
        System.out.println("CountDownLatch = " + countDownLatch.getCount());
    }

    private static void openMarket() throws InterruptedException {
        Thread.sleep(4000);
        System.out.println("Market is opened");
        countDownLatch.countDown();
        System.out.println("CountDownLatch = " + countDownLatch.getCount());
    }

    public static void main(String[] args) throws InterruptedException {
        new Friend("Yura",countDownLatch);
        new Friend("Oleg",countDownLatch);
        new Friend("Elena",countDownLatch);
        new Friend("Viktor",countDownLatch);
        new Friend("Marina",countDownLatch);

        marketStaffIsOnPlace();
        everythingIsReady();
        openMarket();
    }
}

class Friend extends Thread{
    String name;
    private CountDownLatch countDownLatch;

    public Friend(String name, CountDownLatch countDownLatch){
        this.name = name;
        this.countDownLatch = countDownLatch;
        this.start();
    }
    public void run(){
        try {
            countDownLatch.await();
            System.out.println(name + "started purchasing");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}


