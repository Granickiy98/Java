package work_with_files;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map;

public class PAthAndFilesEx1 {
    public static void main(String[] args) throws IOException {
        Path filePath = Paths.get("test15.txt");
        Path directoryPath = Paths.get("C:\\Users\\Granickiy\\Desktop\\M");


        System.out.println("filePath : " + filePath.getFileName());
        System.out.println("directoryPath : " + directoryPath.getFileName());
        System.out.println("----------------------------");

        System.out.println("filePath get parent : " + filePath.getParent());
        System.out.println("directoryPath  get parent : " + directoryPath.getParent());
        System.out.println("----------------------------");

        System.out.println("filePath get root : " + filePath.getRoot());
        System.out.println("directoryPath  get root : " + directoryPath.getRoot());
        System.out.println("----------------------------");

        System.out.println("filePath is absolute : " + filePath.isAbsolute());
        System.out.println("directoryPath  is absolute : " + directoryPath.isAbsolute());
        System.out.println("----------------------------");

        System.out.println("filePath to absolute : " + filePath.toAbsolutePath());
        System.out.println("directoryPath  to absolute : " + directoryPath.toAbsolutePath());
        System.out.println("----------------------------");

        System.out.println("filePath to absolute get parent : " + filePath.toAbsolutePath().getParent());
        System.out.println("directoryPath  to absolute get parent : " + directoryPath.toAbsolutePath().getParent());
        System.out.println("----------------------------");

        System.out.println("filePath  to directoryPath : " + directoryPath.resolve(filePath));
        System.out.println("----------------------------");

        Path anotherPath = Paths.get("C:\\Users\\Granickiy\\Desktop\\M\\N\\Z\\test21.txt");

        System.out.println("anotherPath  to directoryPath : " + directoryPath.relativize(anotherPath));
        System.out.println("----------------------------");

        if(!Files.exists(filePath)){
            try {
                Files.createFile(filePath);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        if(!Files.exists(directoryPath)){
            try {
                Files.createDirectory(directoryPath);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Files is readable(filePath) : " +Files.isReadable(filePath));
        System.out.println("----------------------------");
        System.out.println("Files is writable(filePath) : " +Files.isWritable(filePath));
        System.out.println("----------------------------");
        System.out.println("Files is executable (filePath) : " +Files.isExecutable(filePath));
        System.out.println("----------------------------");

        Path filePath2 = Paths.get("C:\\Users\\Granickiy\\IdeaProjects\\java_pro\\test15.txt");
        System.out.println("Files isSameFile(filePath,filePath2) : " + Files.isSameFile(filePath,filePath2));
        System.out.println("----------------------------");

        System.out.println("Files size : " + Files.size(filePath));
        System.out.println("----------------------------");

        System.out.println("Files getAttribute : " + Files.getAttribute(filePath,"creationTime"));
        System.out.println("----------------------------");

        Map<String,Object> attributes = Files.readAttributes(filePath,"*");
        for (Map.Entry<String ,Object> entry:attributes.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

    }
}
