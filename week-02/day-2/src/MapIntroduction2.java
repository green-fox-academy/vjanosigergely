import java.util.HashMap;
import java.util.Map;

public class MapIntroduction2 {
    public static void main(String[] args) {
      /*  Create a map where the keys are strings and the values are strings with the following initial values

        Key	Value
        978-1-60309-452-8	A Letter to Jo
        978-1-60309-459-7	Lupus
        978-1-60309-444-3	Red Panda and Moon Bear
        978-1-60309-461-0	The Lab*/

        HashMap<String , String> isbn = new HashMap<String, String>();

        isbn.put("978-1-60309-452-8", "A Letter to Jo");
        isbn.put("978-1-60309-459-7", "Lupus");
        isbn.put("978-1-60309-444-3", "Red Panda and Moon Bear");
        isbn.put("978-1-60309-461-0", "The Lab");

        /*Print all the key-value pairs in the following format

        A Letter to Jo (ISBN: 978-1-60309-452-8)
        Lupus (ISBN: 978-1-60309-459-7)
        Red Panda and Moon Bear (ISBN: 978-1-60309-444-3)
        The Lab (ISBN: 978-1-60309-461-0)
         for (Map.Entry<String,Integer> obj: map2.entrySet()) {
            System.out.println(obj.getValue());
            System.out.println(obj.getKey());
*/
        for (Map.Entry<String,String> obj: isbn.entrySet()){
            System.out.print(obj.getValue() + " ");
            System.out.println("(ISBN: " + obj.getKey() + ")");
        }

        //Remove the key-value pair with key 978-1-60309-444-3

        isbn.remove("978-1-60309-444-3");

        //Remove the key-value pair with value The Lab
        isbn.values().remove("The Lab");

        // Add the following key-value pairs to the map
        //
        //Key	            Value
        //978-1-60309-450-4	They Called Us Enemy
        //978-1-60309-453-5	Why Did We Trust Him?
        isbn.put("978-1-60309-450-4" , "They Called Us Enemy" );
        isbn.put("978-1-60309-453-5" , "Why Did We Trust Him?");

        // Print whether there is an associated value with key 478-0-61159-424-8 or not

        if (isbn.containsKey("478-0-61159-424-8")) {
            System.out.println("Yes, we have that book (478-0-61159-424-8)");
        }else{
            System.out.println("No, we do not have that book (478-0-61159-424-8)");
        };

        //Print the value associated with key 978-1-60309-453-5
        System.out.println(isbn.get("978-1-60309-453-5"));
    }
}
