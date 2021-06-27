package Scanner;

import java.util.Scanner;

public class Scanner1 {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Number: " );
//        int i = scanner.nextInt();
//        System.out.println("Numbered: " + i);
//        System.out.print("Write two numbers: ");
//        int x = scanner.nextInt();
//        int y = scanner.nextInt();
//        System.out.println("Chastnoe: " + x/y);
////        System.out.println("Ostatok: " + x%y);
//        System.out.print("Write a couple of words : ");
//        String line = scanner.next();
//        System.out.println("You wrote   : " + line);
//        System.out.println("Write drobkoe number : ");
//        double d = scanner.nextDouble();
//        System.out.print("Wrote number : " + d);

        Scanner scanner = new Scanner("Hello my friend\nHow are you?");
//        String line = scanner.nextLine();
//        System.out.println(line);
//        System.out.println(scanner.nextLine());

//        while (scanner.hasNextLine()){
//            System.out.println(scanner.nextLine());
//        }

        System.out.println(scanner.next().charAt(2));
    }
}
