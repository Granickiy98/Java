package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Collect {
    public static void main(String[] args) {
        Student st1 = new Student("Ivan",'m',20,3,8.1);
        Student st2 = new Student("Vlad",'m',21,4,7.6);
        Student st3 = new Student("Dima",'m',18,1,8.8);
        Student st4 = new Student("Marina",'f',22,3,9.0);
        Student st5 = new Student("Elena",'f',19,2,7.1);
        List<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);

//       Map<Integer,List<Student>> map = students.stream().map(student ->{student.setName(student.getName().toUpperCase());
//                return student;
//        })
//                .collect(Collectors.groupingBy(student -> student.getCourse()));
//       for (Map.Entry<Integer,List<Student>> entry : map.entrySet()){
//           System.out.println(entry.getKey()+":"+entry.getValue().toString());
//       }

      Map<Boolean,List<Student>> map =
                students.stream()
                .collect(Collectors.partitioningBy(student -> student.getAvgGrade()>8));
        for (Map.Entry<Boolean,List<Student>> entry : map.entrySet()){
            System.out.println(entry.getKey()+":"+entry.getValue().toString());
        }
    }
}

