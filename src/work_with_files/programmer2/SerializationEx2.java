package work_with_files.programmer2;

import work_with_files.programmer1.Employees;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class SerializationEx2 {
    public static void main(String[] args) {
        Employees best_employees ;

        try(ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("employees2.bin"))) {
            best_employees = (Employees) inputStream.readObject();
            System.out.println(best_employees);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
