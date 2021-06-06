package stream;

import java.util.ArrayList;
import java.util.List;

public class Min_Max {
    public static void main(String[] args) {
        Student st1 = new Student("Ivan",'m',20,3,8.1);
        Student st2 = new Student("Vlad",'m',21,4,7.6);
        Student st3 = new Student("Dima",'m',18,1,8.8);
        Student st4 = new Student("Marina",'f',22,5,9.0);
        Student st5 = new Student("Elena",'f',19,2,7.1);
        List<Student> studentList = new ArrayList<>();
        studentList.add(st1);
        studentList.add(st2);
        studentList.add(st3);
        studentList.add(st4);
        studentList.add(st5);

            Student student_min = studentList.stream().min((x,y)->x.getAge()- y.getAge()).get();
            System.out.println(student_min);
            Student student_max = studentList.stream().max((x,y)->x.getAge()- y.getAge()).get();
            System.out.println(student_max);
    }
}
