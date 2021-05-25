package collection.List.ArrayList_LinkedList_Vector.LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorExample {

    public static void main(String[] args) {
        String line = "madam";
        List<Character> characterList = new LinkedList<>();
        for(char ch : line.toCharArray() ){
            characterList.add(ch);
        }
//        System.out.println(characterList);
        ListIterator<Character> iterator = characterList.listIterator();
        ListIterator<Character> reverseIterator2 = characterList.listIterator(characterList.size());
        boolean isPalindrome = true;
        while (iterator.hasNext() && reverseIterator2.hasPrevious()){
             if(iterator.next() != reverseIterator2.previous()){
                 isPalindrome = false;
                 break;
             }
        }
        if(isPalindrome){
            System.out.println("Palindrom");
        }else {
            System.out.println("It is not Palindrome");
        }
    }

}
