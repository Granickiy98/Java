package collection.Set.TreeSet;

import java.util.Objects;
import java.util.TreeSet;

public class TreeSetExampleTwo {
    public static void main(String[] args) {
        TreeSet<Student> treeSet = new TreeSet<>();
        Student st1 = new Student("Ivan",1);
        Student st2 = new Student("Vlad",2);
        Student st3 = new Student("Petr",5);
        Student st4 = new Student("Vasy",4);
        Student st5 = new Student("Marina",3);
        treeSet.add(st1);
        treeSet.add(st2);
        treeSet.add(st3);
        treeSet.add(st4);
        treeSet.add(st5);
        System.out.println(treeSet);
        System.out.println(treeSet.first());
        System.out.println(treeSet.last());
        Student st6 = new Student("Oleg",3);

        System.out.println(treeSet.headSet(st6));
        System.out.println(treeSet.tailSet(st6));
        System.out.println(treeSet.subSet(st1,st3));
        System.out.println(st6.equals(st5));
        System.out.println(st6.hashCode() == st5.hashCode());
    }
}

class Student implements Comparable<Student>{
    String name;
    int course;

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    @Override
    public int compareTo(Student other) {
        return this.course - other.course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return course == student.course;
    }

    @Override
    public int hashCode() {
        return Objects.hash(course);
    }
}
