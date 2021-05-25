package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BinarySearch {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(-3);
        arrayList.add(-2);
        arrayList.add(-18);
        arrayList.add(4);
        arrayList.add(36);
        arrayList.add(33);
        Collections.sort(arrayList);
        int index1 = Collections.binarySearch(arrayList,86 );
        System.out.println("index1 = "+index1);


        Employee employee1 = new Employee(100,"Ivan",1234);
        Employee employee2 = new Employee(10,"Yura",234);
        Employee employee3 = new Employee(1,"Dima",5264);
        Employee employee4 = new Employee(24,"Kristina",134);
        Employee employee5 = new Employee(17,"Vasy",987);
        Employee employee6 = new Employee(1,"Vlad",7625);
        Employee employee7 = new Employee(89,"Igor",10000);
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(employee1);
        employeeList.add(employee2);
        employeeList.add(employee3);
        employeeList.add(employee4);
        employeeList.add(employee5);
        employeeList.add(employee6);
        employeeList.add(employee7);
        System.out.println("Not sorted = " + employeeList);
        Collections.sort(employeeList);
        System.out.println("Sorted = "+ employeeList);
        int index2 = Collections.binarySearch(employeeList,new Employee(1,"Dima",0));
        System.out.println("index2 = "+index2);

        int [] array = {-3,-8,12,4,0,3,6,150,-10};
        System.out.println("array not sorted"+ Arrays.toString(array));
        Arrays.sort(array);
        System.out.println("array is sorted"+Arrays.toString(array));
        int index3 = Arrays.binarySearch(array,150);
        System.out.println("index3 = "+index3);

        Collections.sort(arrayList);
        System.out.println("ArrayList is sorted = "+arrayList);
        Collections.reverse(arrayList);
        System.out.println("ArrayList is reverse = "+arrayList);
        Collections.shuffle(arrayList);
        System.out.println("ArrayList is shuffle = "+arrayList);

    }


}

class Employee implements Comparable<Employee>{
    int id ;
    String name;
    int salary;

    public Employee(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Employee anotherEmp) {
        int result = this.id - anotherEmp.id;
        if (result == 0){
            result = this.name.compareTo(anotherEmp.name);
        }
        return result;
    }
}
