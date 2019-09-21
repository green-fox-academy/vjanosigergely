import java.util.HashMap;
import java.util.Map;

public class ShoppingList2 {
    public static void main(String[] args) {
        HashMap<String, Double> shoppingList = new HashMap<>();

        shoppingList.put("Milk", 1.07);
        shoppingList.put("Rice", 1.59);
        shoppingList.put("Eggs", 3.14);
        shoppingList.put("Cheese", 12.60);
        shoppingList.put("Chicken Breasts", 9.40);
        shoppingList.put("Apples", 2.31);
        shoppingList.put("Tomato", 2.58);
        shoppingList.put("Potato", 1.75);
        shoppingList.put("Onion", 1.10);

        HashMap<String, Double> bob = new HashMap<>();
        bob.put("Milk",	3.0);
        bob.put("Rice",	2.0);
        bob.put("Eggs",	2.0);
        bob.put("Cheese",	1.0);
        bob.put("Chicken Breasts",	4.0);
        bob.put("Apples",	1.0);
        bob.put("Tomato",	2.0);
        bob.put("Potato",	1.0);

        HashMap<String, Double> alice = new HashMap<>();
        alice.put("Rice",	1.0);
        alice.put("Eggs",	5.0);
        alice.put("Chicken Breasts",	2.0);
        alice.put("Apples",	1.0);
        alice.put("Tomato",	10.0);

        whoBuysWhat(shoppingList,bob,alice);



    }
    public static void whoBuysWhat (HashMap<String, Double> fullList , HashMap<String, Double> bob ,
                                    HashMap<String, Double> alice) {

        //How much does Bob pay?
        // How much does Alice pay?
        double bobPays = 0;
        double alicePays = 0;


        for (Map.Entry<String, Double> obj2:fullList.entrySet()){
            for (Map.Entry<String, Double> obj:bob.entrySet()){
                if (obj.getKey() == obj2.getKey()) {
                   bobPays = bobPays + obj.getValue() * obj2.getValue();}
            }
            for (Map.Entry<String, Double> obj:alice.entrySet()){
                if (obj.getKey() == obj2.getKey()) {
                    alicePays = alicePays + obj.getValue() * obj2.getValue();}
            }
        }
        System.out.println("Bob needs to pay " + bobPays  + " and Alice needs to pay " + alicePays);

        //Who buys more Rice?
        boolean bobMore = (bob.get("Rice") > alice.get("Rice"));

        if (bobMore) {
            System.out.println("Bob buys more rice");
        } else {
            System.out.println("Alice buys more rice");
        }

        //Who buys more Potato?

        boolean bobPotato = bob.containsKey("Potato");
        boolean alicePotato = alice.containsKey("Potato");
        if (bobPotato && alicePotato) {
            if (bob.get("Potato") > alice.get("Potato")) {
                System.out.println("Bob buys more potatoes");
            } else {
                System.out.println("Alice buys more potatoes");
            }
        } else if (bobPotato == false && alicePotato == false){
            System.out.println("They do not buy any potato");
        } else if (bobPotato = false){
                System.out.println("Alice buys more potatoes");
        } else {
            System.out.println("Bob buys more potatoes");
        }


        //Who buys more different products?
        boolean diversity = bob.size() > alice.size();

        if (bob.size() == alice.size()) {
            System.out.println("They buy the same amount of different products");
        } else if (diversity) {
            System.out.println("Bob buys more different products");
        } else {
            System.out.println("Alice buys more different products");
        }
        //Who buys more products? (piece)

        double sumBob = 0;
        double sumAlice = 0;

        for (Map.Entry<String, Double> obj:bob.entrySet()){
            sumBob = obj.getValue() + sumBob;
        }
        for (Map.Entry<String, Double> obj:alice.entrySet()){
            sumAlice = obj.getValue() + sumAlice;
        }

        if (sumBob > sumAlice) {
            System.out.println("Bob buys more products.");
        } else if (sumAlice > sumBob) {
            System.out.println("Alice buys more products");
        } else {
            System.out.println("They buy the same amount of products");
        }

    }
}
