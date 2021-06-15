package collection.thread_safe;
import java.util.HashMap;
import java.util.Iterator;
import  java.util.concurrent.ConcurrentHashMap;
public class ConcurrentHashMapEx {
    public static void main(String[] args) throws InterruptedException {
       ConcurrentHashMap<Integer,String> hashMap = new ConcurrentHashMap<>();
        hashMap.put(1,"Yura");
        hashMap.put(2,"Ivan");
        hashMap.put(3,"Oleg");
        hashMap.put(4,"Elena");
        hashMap.put(5,"Petr");
        System.out.println(hashMap);

        Runnable runnable1 = ()->{

            Iterator<Integer> iterator = hashMap.keySet().iterator();
            while (iterator.hasNext()){
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                Integer i = iterator.next();
                System.out.println(i + " : " +hashMap.get(i));
            }
        };

        Runnable runnable2 = ()->{
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
           hashMap.put(6,"Maina") ;

        };

        Thread thread1 = new Thread(runnable1);
        Thread thread2 = new Thread(runnable2);

        thread1.start();
        thread2.start();
        thread1.join();
        thread1.join();
        System.out.println(hashMap);
    }
}
