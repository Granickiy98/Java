package stream;

import java.util.ArrayList;
import java.util.List;

public class FlatMap {
    public static void main(String[] args) {
        Student st1 = new Student("Ivan",'m',20,3,8.1);
        Student st2 = new Student("Vlad",'m',21,4,7.6);
        Student st3 = new Student("Dima",'m',18,1,8.8);
        Student st4 = new Student("Marina",'f',22,5,9.0);
        Student st5 = new Student("Elena",'f',19,2,7.1);

        Faculty f1 = new Faculty("Programm");
        Faculty f2 = new Faculty("Economic");
        f1.addStudentToFaculty(st1);
        f1.addStudentToFaculty(st2);
        f1.addStudentToFaculty(st3);
        f2.addStudentToFaculty(st4);
        f2.addStudentToFaculty(st5);

        List<Faculty> faculties = new ArrayList<>();
        faculties.add(f1);
        faculties.add(f2);

        faculties.stream().flatMap(faculty -> faculty.getStudentsOnFaculty().stream())
                .forEach(student -> System.out.println(student.getName()));
    }
}


class Faculty{
    String name;
    List<Student> studentsOnFaculty;

    public Faculty(String name) {
        this.name = name;
        studentsOnFaculty = new ArrayList<>();
    }

    public List<Student> getStudentsOnFaculty() {
        return studentsOnFaculty;
    }

    public void addStudentToFaculty(Student student){
        studentsOnFaculty.add(student);
    }
}