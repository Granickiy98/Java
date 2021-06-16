package work_with_files;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriteEx {
    public static void main(String[] args) {
        String rubai = "Много лет размышлял я над жизнью земной.\n"+
                "Непонятного нет для меня под луной.\n" +
                "Мне известно , что мне ничего не известно! \n" +
                "Вот последняя правда,открытая мной. \n";
        String line ="Hello";

        FileWriter writer = null;
        try {
            writer = new FileWriter("test2.txt",true);
//            for (int i =0;i<rubai.length();i++){
//                writer.write(rubai.charAt(i));
//            }
//            writer.write(rubai);
            writer.write(line);
            System.out.println("Done!");
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try {
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
