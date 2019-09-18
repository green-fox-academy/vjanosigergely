import java.util.HashMap;

public class productDatabase {
    public static void main(String[] args) {
        HashMap<String, Integer> priceList = new HashMap<>();

        priceList.put("Eggs" , 200);
        priceList.put("Milk" , 200);
        priceList.put("Fish" , 400);
        priceList.put("Apples" , 150);
        priceList.put("Bread" , 50);
        priceList.put("Chicken" , 550);

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