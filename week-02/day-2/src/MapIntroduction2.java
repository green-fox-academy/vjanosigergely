import java.util.HashMap;

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
*/
        


    }
}
