package work_with_files;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyEx2 {
    public static void main(String[] args) {
        try(FileInputStream inputStream =
                    new FileInputStream("C:\\Users\\Granickiy\\Desktop\\Схема_ЭБУ_К9К.png");
            FileOutputStream outputStream = new FileOutputStream("auto_picture.png");) {
            int i;
            while ((i=inputStream.read())!=-1){
                outputStream.write(i);
            }
            System.out.println("Done!");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
