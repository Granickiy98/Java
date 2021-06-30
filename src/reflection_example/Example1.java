package reflection_example;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

public class Example1 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException {
        Class employeeClass = Class.forName("reflection_example.Employee");
//        Class employeeClass2 = Employee.class;
//
//        Employee employee = new Employee();
//        Class employeeCalss3  = employee.getClass();

       Field someField =  employeeClass.getField("id");
        System.out.println("Type of ID field = " + someField.getType());
        System.out.println("----------------");
       Field[] arrayFields = employeeClass.getFields();
       for (Field field : arrayFields){
           System.out.println("Type of " + field.getName() + " = " + field.getType());
       }
        System.out.println("----------------");
      Field[] allFields =  employeeClass.getDeclaredFields();
        for (Field field : allFields){
            System.out.println("Type of " + field.getName() + " = " + field.getType());
        }
        System.out.println("----------------");

       Method method1 = employeeClass.getMethod("increaseSalary");
        System.out.println("Return type of method increaseSalary: " + method1.getReturnType()+ " , parameter types: " +
                Arrays.toString(method1.getParameterTypes()));

        System.out.println("----------------");

        Method method2 = employeeClass.getMethod("setSalary",double.class);
        System.out.println("Return type of method setSalary: " + method2.getReturnType()+ " , parameter types: " +
                Arrays.toString(method2.getParameterTypes()));
        System.out.println("----------------");

        Method[] methods3 = employeeClass.getMethods();
        for (Method method : methods3){
            System.out.println("Name of method : " + method.getName()+ " , return types: " +
                   method.getReturnType() + " , parameter type: " + method.getParameterTypes());
        }
        System.out.println("----------------");

        Method[] methods4 = employeeClass.getDeclaredMethods();
        for (Method method : methods4 ){
            System.out.println("Name of method : " + method.getName()+ " , return types: " +
                    method.getReturnType() + " , parameter type: " + method.getParameterTypes());
        }
        System.out.println("----------------");

        Method[] methods5 = employeeClass.getDeclaredMethods();
        for (Method method : methods5){
            if(Modifier.isPublic(method.getModifiers())){
                System.out.println("Name of method : " + method.getName()+ " , return types: " +
                        method.getReturnType() + " , parameter type: " + method.getParameterTypes());
            }
        }
        System.out.println("----------------");

       Constructor constructor1 = employeeClass.getConstructor();
        System.out.println("Name: " + constructor1.getName()+", get parameter: " +constructor1.getParameterCount()+
                ", get parameter types: " +Arrays.toString(constructor1.getParameterTypes()));
        System.out.println("----------------");

        Constructor constructor2 = employeeClass.getConstructor(int.class,String.class,String.class);
        System.out.println("Name: " + constructor2.getName()+", get parameter: " +constructor2.getParameterCount()+
                ", get parameter types: " +Arrays.toString(constructor2.getParameterTypes()));
        System.out.println("----------------");

        Constructor[] constructor3 = employeeClass.getConstructors();
        for (Constructor constructor : constructor3){
            System.out.println("Name: " + constructor.getName() +", get parameter: " + constructor.getParameterCount() +
                    ", get parameter types: " + Arrays.toString(constructor.getParameterTypes()));
        }

        System.out.println("----------------");
    }
}
