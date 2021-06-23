package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexEx2 {
    public static void main(String[] args) {
        String s1 = "Ivanov Ivan, Russia, Moskow, Lenin street, 51, Flat 43,"+
                " email: ivanovivan@mail.ru, Postkode:AA99, Phone Number: +123456434;"+
                 "Petrova Maria, Ukraine, Dnepr, Lomonosova street, 24, Flat 83,"+
                " email: petrovaM@gmail.com, Postkode:51910, Phone Number: +0962345869"+
                "Chuck Norris, USA, Hollywood, All stars street, 87, Flat 21,"+
                " email: chach@gmail.com, Postkode:USA239, Phone Number: +156238404";

//        Pattern pattern = Pattern.compile("\\w+");
//        Pattern pattern = Pattern.compile("\\b\\d{2}\\b");
//        Pattern pattern = Pattern.compile("\\+\\d{9}");
        Pattern pattern = Pattern.compile("\\w+@\\w+\\.(ru|com)");
        Matcher matcher = pattern.matcher(s1);
        while (matcher.find()){
            System.out.println(matcher.group());
        }
    }
}
