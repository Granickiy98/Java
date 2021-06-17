package work_with_files;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class FileEx {
    public static void main(String[] args) throws IOException {
        File folder = new File("C:\\Users\\Granickiy\\Desktop\\Test");
        File folder2 = new File("C:\\Users\\Granickiy\\Desktop\\Test3");
        File file = new File("test2.txt");
        File file2 = new File("C:\\Users\\Granickiy\\Desktop\\Test3\\test4.txt");


        System.out.println("File get absolute path: " + file.getAbsolutePath());
        System.out.println("Folder get absolute path: " + folder.getAbsolutePath());
        System.out.println("--------------------------------");
        System.out.println("File is absolute path: " + file.isAbsolute());
        System.out.println("Folder is absolute path: " + folder.isAbsolute());
        System.out.println("--------------------------------");

        System.out.println("File is directory : " + file.isDirectory());
        System.out.println("Folder is directory: " + folder.isDirectory());
        System.out.println("--------------------------------");

        System.out.println("File is exists : " + file.exists());
        System.out.println("Folder is exists: " + folder.exists());
        System.out.println("File 2 is exists: " + file2.exists());
        System.out.println("Folder 2 is exists: " + folder2.exists());
        System.out.println("--------------------------------");


        System.out.println("Folder 2 is create new : " + folder2.mkdir());
        System.out.println("File 2 create new : " + file2.createNewFile());

        System.out.println("--------------------------------");

        System.out.println("File 2 length : " + file2.length());
        System.out.println("Folder 2 length : " + folder2.length());
        System.out.println("--------------------------------");

        System.out.println("Folder 2 delete : " + folder2.delete());
//        System.out.println("File 2 delete : " + file2.delete());
        System.out.println("--------------------------------");

        File [] files =  folder.listFiles();
        System.out.println("Folder : " + Arrays.toString(files));
        System.out.println("--------------------------------");
        System.out.println("File is hidden : " + file.isHidden());
        System.out.println("File canRead  : " + file.canRead());
        System.out.println("File canWrite : " + file.canWrite());
        System.out.println("File canExecute : " + file.canExecute());





    }
}
