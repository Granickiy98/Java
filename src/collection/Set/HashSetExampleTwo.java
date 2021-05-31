package collection.Set;

import java.util.HashSet;

public class HashSetExampleTwo {
    public static void main(String[] args) {
        HashSet<Integer> integerHashSet1 = new HashSet<>();
        integerHashSet1.add(5);
        integerHashSet1.add(2);
        integerHashSet1.add(3);
        integerHashSet1.add(1);
        integerHashSet1.add(8);

        HashSet<Integer> integerHashSet2 = new HashSet<>();
        integerHashSet2.add(7);
        integerHashSet2.add(4);
        integerHashSet2.add(5);
        integerHashSet2.add(3);
        integerHashSet2.add(8);

       HashSet<Integer> hashSetResult = new HashSet<>(integerHashSet1);
//       hashSetResult.addAll(integerHashSet2);
//        System.out.println(hashSetResult);

//        hashSetResult.retainAll(integerHashSet2);
//        System.out.println(hashSetResult);
        hashSetResult.removeAll(integerHashSet2);
        System.out.println(hashSetResult);
    }
}
