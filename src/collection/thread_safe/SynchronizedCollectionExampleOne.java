package collection.thread_safe;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SynchronizedCollectionExampleOne {
    public static void main(String[] args) throws InterruptedException {
        ArrayList<Integer> source = new ArrayList<>();
        for (int i = 0 ; i<5;i++){
            source.add(i);
        }

//        ArrayList<Integer> target = new ArrayList<>();
        List<Integer> synchList = Collections.synchronizedList(new ArrayList<>());
        Runnable runnable = ()->{synchList.addAll(source);};


        Thread threadOne = new Thread(runnable);
        Thread threadTwo = new Thread(runnable);

        threadOne.start();
        threadTwo.start();
        threadOne.join();
        threadOne.join();
        System.out.println(synchList);
    }
}
