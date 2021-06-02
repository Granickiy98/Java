package lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class StudentInfo  {

    void testStudents(ArrayList<Student> arrayList , StudentChecks sc){
        for(Student s : arrayList){
            if (sc.check(s)){
                System.out.println(s);
            }
        }
    }
}

class Test{
    public static void main(String[] args) {
        Student st1 = new Student("Ivan",'m',22,3,8.2);
        Student st2 = new Student("Nikolay",'m',28,2,6.4);
        Student st3 = new Student("Elena",'f',19,1,8.9);
        Student st4 = new Student("Petr",'m',35,4,7.0);
        Student st5 = new Student("Maria",'f',23,3,9.1);

        ArrayList<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);

        StudentInfo info = new StudentInfo();

        Collections.sort(students,(s1,s2)->s1.course-s2.course);
        System.out.println(students);

//        info.testStudents(students, student->student.avgGrade>8);
//        System.out.println("-------------------------");
//        StudentChecks cs = (Student s) ->{return s.avgGrade>8.2;};
//        info.testStudents(students,cs);
//        System.out.println("-------------------------");
//        info.testStudents(students,student ->student.age <30);
//        System.out.println("-------------------------");
//        info.testStudents(students,student -> student.age>20 && student.sex == 'f' && student.avgGrade < 9.5);
//        info.printStudentOverGrade(students,8.0);
//        System.out.println("-------------------------");
//        info.printStudentUnderAge(students,30);
//        System.out.println("-------------------------");
//        info.printStudentMixCondition(students,9.5,20,'f');
//        System.out.println("-------------------------");

    }
}

interface StudentChecks{
    boolean check(Student student);
}
