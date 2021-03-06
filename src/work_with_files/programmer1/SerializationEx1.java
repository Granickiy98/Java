package work_with_files.programmer1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class SerializationEx1 {
    public static void main(String[] args) {
        List<String> employes = new ArrayList<>();
        employes.add("Yura");
        employes.add("Ivan");
        employes.add("Elena");
        try(ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("employees1.bin"))){
            outputStream.writeObject(employes);
            System.out.println("DONE!");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
