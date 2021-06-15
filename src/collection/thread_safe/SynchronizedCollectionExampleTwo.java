package collection.thread_safe;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class SynchronizedCollectionExampleTwo {
    public static void main(String[] args) throws InterruptedException {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0 ; i<1000;i++){
            arrayList.add(i);
        }

        List<Integer> synchList = Collections.synchronizedList(arrayList);
        Runnable runnableOne = ()->{
            synchronized (synchList){
            Iterator<Integer> integerIterator = synchList.iterator();
            while (integerIterator.hasNext()){
                System.out.println(integerIterator.next());
                }
            }
        };

        Runnable runnableTwo = ()->
                synchList.remove(10);

        Thread threadOne = new Thread(runnableOne);
        Thread threadTwo = new Thread(runnableTwo);

        threadOne.start();
        threadTwo.start();
        threadOne.join();
        threadOne.join();
        System.out.println(synchList);
    }
}
