package work_with_files;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class PathAndFilesEx2 {
    public static void main(String[] args) throws IOException {
        Path filePath = Paths.get("test15.txt");
        Path directoryPath = Paths.get("C:\\Users\\Granickiy\\Desktop\\M");
        Path directoryPath2 = Paths.get("C:\\Users\\Granickiy\\Desktop\\Test3");
//
//        Files.copy(filePath,directoryPath.resolve(filePath),StandardCopyOption.REPLACE_EXISTING);
//        Files.copy(filePath,directoryPath.resolve("test16.txt"), StandardCopyOption.REPLACE_EXISTING);
//        Files.copy(directoryPath2,directoryPath.resolve("TEST"));
//        System.out.println("DONE!");


//        Files.move(filePath,directoryPath.resolve("test15.txt"));

//        Files.move(Paths.get("test10.txt"),(Paths.get("test11.txt")));
//        Files.delete(Paths.get("test5.txt"));



    }
}
