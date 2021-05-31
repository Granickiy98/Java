package collection.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class HashCodeExample1 {
    public static void main(String[] args) {
        Map<Student,Double> studentMap = new HashMap<>();
        Student st1 = new Student("Yriy","Granickiy",5);
        Student st2 = new Student("Ivan","Ivanov",3);
        Student st3 = new Student("Petr","Petrov",1);

        studentMap.put(st1,7.7);
        studentMap.put(st2,6.7);
        studentMap.put(st3,8.7);
        System.out.println(studentMap);



        Student st4 = new Student("Yriy","Granickiy",5);
//        Student st5 = new Student("Igor","Sidorov",2);
//        boolean result = studentMap.containsKey(st4);
//        System.out.println("Result = "+result);
//        System.out.println("st1 = "+st1.hashCode());
//        System.out.println("st4 = "+st4.hashCode());
//
//        for (Map.Entry<Student,Double> entry:studentMap.entrySet()){
//            System.out.println(entry.getKey()+":"+entry.getValue());
//        }


    }
}

final class  Student{
    final String name;
    final String surname;
    final int course;

    public Student(String name, String surname, int course) {
        this.name = name;
        this.surname = surname;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", course=" + course +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return course == student.course && Objects.equals(name, student.name) && Objects.equals(surname, student.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, course);
    }
}
