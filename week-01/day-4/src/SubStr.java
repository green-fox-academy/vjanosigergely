import java.util.Scanner;;


public class SubStr {
    public static void main(String[] args) {
        System.out.println("Please give me two Strings");

        Scanner scanner = new Scanner(System.in);
        String firstString = scanner.nextLine();
        String secondString = scanner.nextLine();

        int firstIndex = firstString.indexOf(secondString);

        if (firstIndex == -1) {
            System.out.println(firstIndex);
        }else {
            System.out.println("You can find ," + secondString + "' in ," + firstString + "' at " + firstIndex);
        }
    }
}
    // This is a string in which a substring
    // is to be searched.
   /* String str = "GeeksforGeeks is a computer science portal";

    // Returns index of first occurrence of substring
    int firstIndex = str.indexOf("Geeks");
    System.out.println("First occurrence of char Geeks"+
            " is found at : " + firstIndex); */
