package Scanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Scanner2 {
    public static void main(String[] args) {
        Scanner scanner = null;
        Set<String> stringSet = new TreeSet<>();
        try {
            scanner = new Scanner(new FileReader(new File("C:\\Users\\Granickiy\\Desktop\\file.txt")));
            scanner.useDelimiter("\\W");
            while (scanner.hasNext()){
                String word = scanner.next();
                stringSet.add(word);
            }
            for (String word :stringSet){
                System.out.println(word);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Have a problem");
        }finally {
            scanner.close();
        }
    }
}
