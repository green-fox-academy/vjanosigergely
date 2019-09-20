import javax.print.DocFlavor;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please give me a word");

        String s = scanner.nextLine();

        //System.out.println(s);

        System.out.println("The palindrome of this word is: " + palindromeCreator(s));


    }
    public static String palindromeCreator (String original){
        char [] palindrome = new char[original.length()];

        for (int i = 0; i < original.length(); i++) {
           palindrome[i] = original.charAt(original.length()-1-i);
        }

        String reversed = new String(palindrome);

        return reversed;
    }
}

