package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexEx1 {
    public static void main(String[] args) {
        String s1 = "ABDOP";
        Pattern pattern1 = Pattern.compile("AB[C-F]OP");

        Matcher matcher1 = pattern1.matcher(s1);
        while (matcher1.find()){
            System.out.println("Position: "+matcher1.start()+"  "+matcher1.group());
        }
    }
}
