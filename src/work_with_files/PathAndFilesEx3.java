package work_with_files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class PathAndFilesEx3 {
    public static void main(String[] args) throws IOException {
        Path filePath = Paths.get("test10.txt");
//        Files.createFile(filePath);
//        String dialog = "-HEllo\n-HEllo\n-How are you?\n-Fine,you?\n-Fine";
//        Files.write(filePath,dialog.getBytes());
      List<String> list =  Files.readAllLines(filePath);
        for (String s : list){
            System.out.println(s);
        }
    }
}
