import java.util.ArrayList;
import java.util.Scanner;

public class PalindromeSearcher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();

        palindromeSearcher(string);
        System.out.print("[");
        for (int i = 0; i < palindromeSearcher(string).length ; i++) {
            System.out.print("'" + palindromeSearcher(string)[i] + "', ");
        }
        System.out.print("]");
    }

    public static String[] palindromeSearcher (String string){

        int length = string.length();

        ArrayList <String> results = new ArrayList<>();

        for (int i = 3; i <= length; i++) {
            for (int j = 0; j < length - i; j++) {
                String substring = string.substring(j,j+i);
                int counter = 0;
                for (int k = 0; k < substring.length()/2 ; k++) {
                    if (substring.charAt(k) == substring.charAt(substring.length()-1-k)){
                        counter = counter +1;
                    }
                    if (counter == substring.length()/2){
                        results.add(substring);

                }

                }

            }

        }

        String[] resultArray = new String[results.size()];

        for (int i = 0; i < results.size() ; i++) {
            resultArray[i] = results.get(i);
        }

        return  resultArray;

    }
}
