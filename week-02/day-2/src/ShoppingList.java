import java.util.ArrayList;

public class ShoppingList {
    public static void main(String[] args) {
        ArrayList<String> shoppingList = new ArrayList<String>();

        shoppingList.add("eggs");
        shoppingList.add("milk");
        shoppingList.add("fish");
        shoppingList.add("apples");
        shoppingList.add("bread");
        shoppingList.add("chicken");

        doWeHaveMilkOrBananas(shoppingList);

    }

    public static void doWeHaveMilkOrBananas(ArrayList<String> shoppingList) {
        if (shoppingList.contains("milk")) {
            System.out.println("Yes, we have milk on the list");
        } else {
            System.out.println("No, there is no milk on the list");
        }

        if (shoppingList.contains("bananas")) {
            System.out.println("Yes, we have bananas on the list");
        } else {
            System.out.println("No, we do not have bananas on the list");

        }
    }
}
//We are going to represent a shopping list in a list containing strings.
//
//Create a list with the following items.
//Eggs, milk, fish, apples, bread and chicken
//Create an application which solves the following problems.
//Do we have milk on the list?
//Do we have bananas on the list?