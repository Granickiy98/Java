package collection.Map;



import java.util.Hashtable;

public class HashTAble {
    public static void main(String[] args) {
        Hashtable<Double, Student> hashtable = new Hashtable<>();
        Student st1 = new Student("Yra","Granickiy",5);
        Student st2 = new Student("Ivan","Ivanov",4);
        Student st3 = new Student("Petr","Petrov",3);
        Student st4 = new Student("Oleg","Sidorov",2);
        hashtable.put(1.1,st1);
        hashtable.put(1.3,st2);
        hashtable.put(1.6,st3);
        hashtable.put(1.9,st4);
        System.out.println(hashtable);
    }
}
