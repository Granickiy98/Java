package multithreading;

public class ExampleFive {
    public static void main(String[] args) {
        MyThread5 myThread5 = new MyThread5();
        myThread5.setName("My_Potok");
        myThread5.setPriority(Thread.MAX_PRIORITY);
        System.out.println("Name of MyThread5: "+ myThread5.getName()+" Priority of MyThread5: "+myThread5.getPriority());

    }
}

class MyThread5 extends Thread{
    public void run(){
        System.out.println("Hello");
    }
}
