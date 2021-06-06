package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Min_Max {
    public static void main(String[] args) {
        Student st1 = new Student("Ivan",'m',20,3,8.1);
        Student st2 = new Student("Vlad",'m',21,4,7.6);
        Student st3 = new Student("Dima",'m',18,1,8.8);
        Student st4 = new Student("Marina",'f',22,3,9.0);
        Student st5 = new Student("Elena",'f',19,2,7.1);
        List<Student> studentList = new ArrayList<>();
        studentList.add(st1);
        studentList.add(st2);
        studentList.add(st3);
        studentList.add(st4);
        studentList.add(st5);

//     List<Integer> courses =   studentList.stream()
//             .mapToInt(student -> student.getCourse())
//             .boxed()
//             .collect(Collectors.toList());
//
//        System.out.println(courses);

        int sum = studentList.stream().mapToInt(value -> value.getCourse()).sum();
        System.out.println(sum);

        double average = studentList.stream().mapToInt(value -> value.getCourse()).average().getAsDouble();
        System.out.println(average);

        int min = studentList.stream().mapToInt(value -> value.getCourse()).min().getAsInt();
        System.out.println(min);

        int max = studentList.stream().mapToInt(value -> value.getCourse()).max().getAsInt();
        System.out.println(max);

//            Student student_min = studentList.stream().min((x,y)->x.getAge()- y.getAge()).get();
//            System.out.println();
//            System.out.println("Student min: "+student_min);
//            System.out.println("----------------");
//            Student student_max = studentList.stream().max((x,y)->x.getAge()- y.getAge()).get();
//            System.out.println("Student max: "+student_max);
//            System.out.println("----------------");
//            studentList.stream().filter(student -> student.getAge()>18).forEach(System.out::println);
//            System.out.println("----------------");
//            studentList.stream().filter(student -> student.getAge()>18).limit(2).forEach(System.out::println);
//            System.out.println("----------------");
//            studentList.stream().filter(student -> student.getAge()>18).skip(2).forEach(System.out::println);

    }
}
