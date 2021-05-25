package collection.List.ArrayList_LinkedList_Vector.LinkedList;

import java.util.LinkedList;

public class LinkedListMethodsOne {
    public static void main(String[] args) {
        StudentTwo studentTwo_1 = new StudentTwo("Ivan",5);
        StudentTwo studentTwo_2 = new StudentTwo("Maria",4);
        StudentTwo studentTwo_3 = new StudentTwo("Yra",3);
        StudentTwo studentTwo_4 = new StudentTwo("Kristina",2);
        StudentTwo studentTwo_5 = new StudentTwo("Vlad",1);

        LinkedList<StudentTwo> studentTwoLinkedList = new LinkedList<>();
        studentTwoLinkedList.add(studentTwo_1);
        studentTwoLinkedList.add(studentTwo_2);
        studentTwoLinkedList.add(studentTwo_3);
        studentTwoLinkedList.add(studentTwo_4);
        studentTwoLinkedList.add(studentTwo_5);
        System.out.println(studentTwoLinkedList);
        System.out.println("LinkedList = " + studentTwoLinkedList.get(2));
        StudentTwo studentTwo_6 = new StudentTwo("Slava",3);
        StudentTwo studentTwo_7 = new StudentTwo("Vika",2);
        studentTwoLinkedList.add(studentTwo_6);
        System.out.println("LinkedList = "+ studentTwoLinkedList);
        studentTwoLinkedList.add(1,studentTwo_7);
        System.out.println("LinkedList = "+ studentTwoLinkedList);

    }
}

class StudentTwo{
    String name;
    int course;

    public StudentTwo(String name, int course) {
        this.name = name;
        this.course = course;
    }

    @Override
    public String toString() {
        return "StudentTwo{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }
}
