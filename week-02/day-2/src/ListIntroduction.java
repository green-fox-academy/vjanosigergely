import java.util.ArrayList;

public class ListIntroduction {
    public static void main(String[] args) {

        ArrayList<String> names=new ArrayList<>();

        System.out.println(names.size());

        names.add("William");

        System.out.println("Is this list empty?" + names.isEmpty());
        names.add("John");
        names.add("Amanda");
        //Print out the number of elements in the list
        System.out.println(names.size());

        // Print out the 3rd element
        System.out.println(names.get(2));
        /*//Iterate through the list and print out each name
              //  William
                    John
                    Amanda*/
        for (int i = 0; i < names.size() ; i++) {
            System.out.println(names.get(i));
        }
        /*Iterate through the list and print
        1. William
        2. John
        3. Amanda*/

        for (int i = 0; i < names.size() ; i++) {
            System.out.println(i+1 + "." + names.get(i) );
        }
        /*Remove the 2nd element*/
        names.remove(1);

       /* Iterate through the list in a reversed order and print out each name
                Amanda
                William

*/
        for (int i = names.size()-1; i >= 0 ; i--) {
            System.out.println(names.get(i));
        }

        names.clear();


    }
}

/*
    We are going to play with lists. Feel free to use the built-in methods where possible.

        Create an empty list which will contain names (strings)
        Print out the number of elements in the list
        Add William to the list
        Print out whether the list is empty or not
        Add John to the list
        Add Amanda to the list
        Print out the number of elements in the list
        Print out the 3rd element
        Iterate through the list and print out each name
        William
        John
        Amanda
        Iterate through the list and print
        1. William
        2. John
        3. Amanda
        Remove the 2nd element
        Iterate through the list in a reversed order and print out each name
        Amanda
        William
        Remove all elements*/
