import java.util.HashMap;
import java.util.Map;

public class productDatabase {
    public static void main(String[] args) {
        HashMap<String, Integer> priceList = new HashMap<>();

        priceList.put("Eggs" , 200);
        priceList.put("Milk" , 200);
        priceList.put("Fish" , 400);
        priceList.put("Apples" , 150);
        priceList.put("Bread" , 50);
        priceList.put("Chicken" , 550);

        //How much is the fish?
        System.out.println(priceList.get("Fish"));
        //What is the most expensive product?

        int max = 0;
        String s = "";

        for (Map.Entry<String,Integer> obj: priceList.entrySet()){
            if (obj.getValue() > max) {
                max = obj.getValue();
                s = obj.getKey();
            }
        }

        System.out.println("The most expensive product is " + s);

        //What is the average price?
        int total = 0;

        for(Map.Entry<String,Integer> obj: priceList.entrySet()){
            total = total + obj.getValue();
        }

        System.out.println("The average is: " + total/priceList.size());

        //How many products' price is below 300?
        int counter = 0;
        for (Map.Entry<String, Integer> obj: priceList.entrySet()) {
            if (obj.getValue() < 300) {
                counter = counter +1;
            }
        }
        System.out.println("There are " + counter + " products for less than 300");

        //Is there anything we can buy for exactly 125?
        System.out.println(priceList.containsValue(125));

        //What is the cheapest product?

        int min = max;
        String cheapest = "";

        for (Map.Entry<String, Integer> obj:priceList.entrySet()){
            if (obj.getValue() < min){
                min = obj.getValue();
                cheapest = obj.getKey();
            }

        }
        System.out.println("The cheapest product is: " + cheapest );

    }
}

//Create a map with the following key-value pairs.
//
//Product name (key)	Price (value)
//Eggs	200
//Milk	200
//Fish	400
//Apples	150
//Bread	50
//Chicken	550

//How much is the fish?
//What is the most expensive product?
//What is the average price?
//How many products' price is below 300?
//Is there anything we can buy for exactly 125?
//What is the cheapest product?