package collection.List.ArrayList_LinkedList_Vector.ArrayList;

import collection.Students;

import java.util.ArrayList;

public class ArrayListMethodsTwo {
    public static void main(String[] args) {
       Students studentsOne = new Students("Ivan",'m',18,2,8.3);
       Students studentsTwo = new Students("Jon",'m',20,4,6.3);
       Students studentsThree = new Students("Nik",'m',18,2,9.3);
       Students studentsFour = new Students("Ann",'f',19,3,7.3);
       Students studentsFive = new Students("Bob",'m',21,5,9.0);

        ArrayList<Students> studentsList = new ArrayList<>();
        studentsList.add(studentsOne);
        studentsList.add(studentsTwo);
        studentsList.add(studentsThree);
        studentsList.add(studentsFour);
        studentsList.add(studentsFive);
        System.out.println(studentsList);
        Students studentsSix = new Students("Bob",'m',21,5,9.0);
      //  studentsList.remove(studentsSix);
        int index = studentsList.indexOf(studentsSix);

        System.out.println();
        System.out.println(index);
        System.out.println(studentsList);

    }
}


