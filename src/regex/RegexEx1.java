package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexEx1 {
    public static void main(String[] args) {
//        String s1 = "ABDOP";
//        Pattern pattern1 = Pattern.compile("AB[C-F]OP");
//        String s1 = "abcd abce abc5 abcg6abch";
//        Pattern pattern1 = Pattern.compile("abc.");
//        String s1 = "abcd abce abc5abcg6abch";
//        Pattern pattern1 = Pattern.compile("bch$");
//        String s1 = "abcd abce abc5abcg6abch";
//        Pattern pattern1 = Pattern.compile("\\d");
        String s1 = "abcd abce abc5abcg6abch";
        Pattern pattern1 = Pattern.compile("\\w");

        Matcher matcher1 = pattern1.matcher(s1);
        while (matcher1.find()){
            System.out.println("Position: "+matcher1.start()+"  "+matcher1.group());
        }
    }
}
